package in.beta;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class JdbcApp {
	
	private static Logger logger = Logger.getLogger(JdbcApp.class);
	
	static {
		PropertyConfigurator.configure("src\\main\\java\\in\\beta\\cfg\\log4j.properties");
	}
	

	public static void main(String[] args) {
		System.out.println("JdbcApp.main()");
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			logger.debug("Driver class loaded succesfully...");
			String url = "jdbc:mysql:///demo";
			String user = "root";
			String password = "root";
			connection = DriverManager.getConnection(url, user, password);
			logger.info("connection established");
			statement = connection.createStatement();
			logger.debug("statement object created...");
			String sqlSelectQuery = "select sid,sname,sage,saddress from student";
			resultSet = statement.executeQuery(sqlSelectQuery);
			logger.info("Query is executed and ResultSet object is created");
			while (resultSet.next()) 
			{
			System.out.println(resultSet.getInt("sid") + "\t" +resultSet.getString("sname") + "\t"+ resultSet.getInt("sage") + "\t" +resultSet.getString("saddress"));
			}
			} catch (ClassNotFoundException c) {
			logger.error("Failed to load the driver");
			} catch (SQLException se) {
			logger.error("Some db problem " + se.getMessage() + "----> " +
			se.getErrorCode());
			} catch (Exception e) {
			logger.fatal("Some unknown exception occured...");
			} finally {
			try {
			if (resultSet != null) {
			resultSet.close();
			}
			} catch (SQLException e) {
			logger.error("Problem in closing resultSet");
			}
			try {
			if (statement != null) {
			statement.close();
			}
			} catch (SQLException e) {
			logger.error("Problem in closing statement");
			}
			try {
			if (connection != null) {
			connection.close();
			}
			} catch (SQLException e) {
			logger.error("Problem in closing connection");
			}
			}
			logger.debug("end of main method");
			}
}