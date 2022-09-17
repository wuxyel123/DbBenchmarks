package test.magnews.dbBenchmark.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DbUtils {
	@Value("${spring.datasource.url}")
	private String URL;
	@Value("${spring.datasource.username}")
	private String USERNAME;
	@Value("${spring.datasource.password}")
	private String PASSWORD;
		
	/**Get the db connection*/
	public Connection getDBConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		conn.setAutoCommit(false);
		return conn;
	}
}
