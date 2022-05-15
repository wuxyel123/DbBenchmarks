package test.magnews.dbBenchmark.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.magnews.dbBenchmark.om.DbBenchmarkRequestOm;
import test.magnews.dbBenchmark.om.DbBenchmarkResponseOm;
import test.magnews.dbBenchmark.service.DbBenchmarkService;

/**
 * REST controller for DB Benchmark APIs
 * @author Alessandro Disclazi
 * */
@RestController
@RequestMapping(path = "/db")
public class DbBenchmarkController {
	DbBenchmarkService service=new DbBenchmarkService();
	
	/*
	 * Executes the benchmark of the DB
	 * @param DbBenchmarkRequestOm request: request containing informations about the benchmark to be performed
	 * @return DbBenchmarkResponseOm: response conteining the result of the benchmark   
	 * */
	@GetMapping(value="/benchmark", produces="application/json")
	public DbBenchmarkResponseOm benchmarkDB(@RequestBody DbBenchmarkRequestOm request) {
		return service.benchmarkDB(request);
	}
}
