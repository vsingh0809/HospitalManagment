package com.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
public static Connection connection;

public static void openConnecton(String DB_URL, String USER_NAME, String PASSWORD) throws SQLException {
	connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	
}

public static Connection getConnection() {
	return connection;
}

 public static void closeconnection() throws SQLException {
	 if(connection!=null)
		 connection.close();
	 System.out.println("db is closed");
 }

}
