package test.magnews.dbBenchmark.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	private static final String URL="jdbc:postgresql://localhost:5432/testDatabase";
	private static final String USERNAME="postgres";
	private static final String PASSWORD="password";
		
	/**Get the db connection*/
	public static Connection getDBConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		conn.setAutoCommit(false);
		return conn;
	}
}
