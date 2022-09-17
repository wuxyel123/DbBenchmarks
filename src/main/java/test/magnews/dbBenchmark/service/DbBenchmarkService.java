package test.magnews.dbBenchmark.service;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import test.magnews.dbBenchmark.om.BenchmarkStatsOm;
import test.magnews.dbBenchmark.om.DbBenchmarkRequestOm;
import test.magnews.dbBenchmark.utils.DbUtils;
import test.magnews.dbBenchmark.om.DbBenchmarkResponseOm;

/**
 * Service class for Db benchmark API
 * @author Alessandro Disclazi
 * */
@Service
public class DbBenchmarkService {

	@Autowired
	DbUtils dbUtils;

	@Value("${benchmark.file.csv.path.insert}")
	String fileInsertBenchmark;

	@Value("${benchmark.file.csv.path.select}")
	String fileSelectBenchmark;
	
	/*
	 * Executes the benchmark of the DB
	 * @param DbBenchmarkRequestOm request: request containing information about the benchmark to be performed
	 * @return DbBenchmarkResponseOm: response containing the result of the benchmark   
	 * */
	public DbBenchmarkResponseOm benchmarkDB(DbBenchmarkRequestOm request) {
		DbBenchmarkResponseOm response=new DbBenchmarkResponseOm();

		response.setInsertBenchmark(benchmarkFromFile(request,fileInsertBenchmark));
		response.setSelectBenchmark(benchmarkFromFile(request,fileSelectBenchmark));

		return response;
	}

	/**
	 * Execute the benchmark using the queries taken from a file
	 * @param filepath: path of the file
	 * */
	public BenchmarkStatsOm benchmarkFromFile(DbBenchmarkRequestOm request,String filepath){
		Long records =0L;
		Long minTime=Long.MAX_VALUE;
		Long maxTime=Long.MIN_VALUE;
		Long avgTime=0L;
		try(Connection connection = dbUtils.getDBConnection())
		{
			File file=new File(filepath);    //creates a new file instance
			FileReader fr=new FileReader(file);   //reads the file
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
			String line;
			while((line=br.readLine())!=null)
			{
				PreparedStatement ps = connection.prepareStatement(line);
				records++;
				Long startTime=System.nanoTime();
				ps.execute();
				Long elapsed=System.nanoTime()-startTime;
				if(elapsed<minTime) minTime=elapsed;
				if(elapsed>maxTime) maxTime=elapsed;
				avgTime+=elapsed;
				if((records)%request.getCommitAfterXStatement()==0) connection.commit();
				ps.close();


			}
			connection.commit();
			avgTime/=records;
			fr.close();    //closes the stream and release the resource
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return new BenchmarkStatsOm(records,minTime,maxTime,avgTime);
	}



}
	

