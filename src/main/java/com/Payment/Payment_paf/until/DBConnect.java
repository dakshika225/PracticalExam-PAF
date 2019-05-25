package com.Payment.Payment_paf.until;

import com.ebuy.util.ClassNotFoundException;
import com.ebuy.util.Connection;
import com.ebuy.util.SQLException;

public class DBConnect {
	
	private static Connection connection;

	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {

		// This creates new connection object when connection is closed or it is null
		if (connection == null || connection.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebuy", "root", "");
		}
		
		return connection;
	}

}
