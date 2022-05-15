package test.magnews.dbBenchmark.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import test.magnews.dbBenchmark.utils.DbUtils;
import test.magnews.dbBenchmark.om.DbBenchmarkRequestOm;
import test.magnews.dbBenchmark.om.DbBenchmarkResponseOm;

/**
 * Service class for Db benchmark API
 * @author Alessandro Disclazi
 * */
public class DbBenchmarkService {
	
	/*
	 * Executes the benchmark of the DB
	 * @param DbBenchmarkRequestOm request: request containing informations about the benchmark to be performed
	 * @return DbBenchmarkResponseOm: response containing the result of the benchmark   
	 * */
	public DbBenchmarkResponseOm benchmarkDB(DbBenchmarkRequestOm request) {
		DbBenchmarkResponseOm response=new DbBenchmarkResponseOm();
		
		clearTable();
		benchmarkInsert(request,response);
		benchmarkSelect(request,response);
		return response;
	}
	
	
	/**
	 * Clear the table for a clean benchmark
	 * */
	public void clearTable() {
			try (Connection connection = DbUtils.getDBConnection();
					PreparedStatement ps = connection.prepareStatement("TRUNCATE users")) {
					ps.execute();
					connection.commit();
				}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}
	
	/*
	 * Executes the benchmark of insert statement
	 * @param DbBenchmarkRequestOm request: request containing informations about the benchmark to be performed
	 * @param DbBenchmarkResponseOm: response that will be returned  
	 * */
	public void benchmarkInsert(DbBenchmarkRequestOm request,DbBenchmarkResponseOm response) {
		Long minTime=Long.MAX_VALUE;
		Long maxTime=Long.MIN_VALUE;
		Long avgTime=0L;
		String sql="INSERT into users (user_id,username,password,lastName,firstName,address,city,nation,zip_code) VALUES(?,?,?,?,?,?,?,?,?)";
		try (Connection connection = DbUtils.getDBConnection();				
			PreparedStatement ps = connection.prepareStatement(sql)) {
				//Inserts a number of data based on the input (DEFAULT 100)
				for(int i = 0;i<request.getInsertNumberToBenchmark();i++) {
					//Prepare the data to insert, since its just test data the pwd is not encrypted
					String username="User"+i;
					String password="pwd"+i;
					String lastName="LastName"+i;
					String firstName="FirstName"+i;
					String address="Adress"+i;
					String city="City"+i;
					String nation="Nation"+i;
					String zip_code="0"+i;
					ps.setLong(1, i+1);
					ps.setString(2, username);
					ps.setString(3, password);
					ps.setString(4, lastName);
					ps.setString(5, firstName);
					ps.setString(6, address);
					ps.setString(7, city);
					ps.setString(8, nation);
					ps.setString(9, zip_code);
					//Executes the query and calculate the time it took to complete in nanoseconds
					Long startTime=System.nanoTime();
					ps.execute();
					Long elapsed=System.nanoTime()-startTime;
					if(elapsed<minTime) minTime=elapsed;
					if(elapsed>maxTime) maxTime=elapsed;
					avgTime+=elapsed;
					
					if((i+1)%request.getCommitAfterXStatement()==0) connection.commit();
					
				}
				//Save the results in the response
				avgTime/=request.getInsertNumberToBenchmark();
				response.setMinInsertTimeNanoSeconds(minTime);
				response.setMaxInsertTimeNanoSeconds(maxTime);
				response.setAvgInsertTimeNanoSeconds(avgTime);
				response.setInsertedRecord(request.getInsertNumberToBenchmark());
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * Executes the benchmark of select statements
	 * @param DbBenchmarkRequestOm request: request containing informations about the benchmark to be performed
	 * @param DbBenchmarkResponseOm: response that will be returned  
	 * */
	public void benchmarkSelect(DbBenchmarkRequestOm request,DbBenchmarkResponseOm response) {
		Long minTime=Long.MAX_VALUE;
		Long maxTime=Long.MIN_VALUE;
		Long avgTime=0L;
		String sql="SELECT * FROM users WHERE user_id =? ";
		try (Connection connection = DbUtils.getDBConnection();				
			PreparedStatement ps = connection.prepareStatement(sql)) {
				//Select a number of data based on the input (DEFAULT 100)
				for(int i = 0;i<request.getSelectNumberToBenchmark();i++) {
	
				    Long max = request.getInsertNumberToBenchmark();
				    Random rand = new Random();
				    //The id to select is generated randomly among the possible ID that were inserted
				    Long idToQuery=rand.nextLong(max)+1;
					ps.setLong(1, idToQuery);
					//Executes the query and calculate the time it took to complete in nanoseconds
					Long startTime=System.nanoTime();
					ps.execute();
					Long elapsed=System.nanoTime()-startTime;
					if(elapsed<minTime) minTime=elapsed;
					if(elapsed>maxTime) maxTime=elapsed;
					avgTime+=elapsed;
					
				}
				//Save the results in the response
				avgTime/=request.getInsertNumberToBenchmark();
				response.setMinSelectTimeNanoSeconds(minTime);
				response.setMaxSelectTimeNanoSeconds(maxTime);
				response.setAvgSelectTimeNanoSeconds(avgTime);
				response.setQueryedRecords(request.getSelectNumberToBenchmark());
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
