package com.jspider.jdbc_simple_crud_opration_prepared_statement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class StudentConnection {
//step-1 load/register driver
	public static Connection getStudent() {
		try {
			Driver drive = new Driver();
			DriverManager.registerDriver(drive);
			// Step-2 create connection\
			String url = "jdbc:mysql://localhost:3306/jdbc-e4";
			String user = "root";
			String password = "Vinityadav@123";
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}
