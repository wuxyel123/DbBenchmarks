package test.magnews.dbBenchmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
//To see swagger doc: http://localhost:8080/dbBenchmark/swagger-ui/index.html
public class DbBenchmarkApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DbBenchmarkApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DbBenchmarkApplication.class);
	}

}
