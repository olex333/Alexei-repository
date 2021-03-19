package com.demo.dbuti.PostgressConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {
	
	private static Connection connection;
	private PostgresConnection() {
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (connection == null) {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "password"; 
		connection = DriverManager.getConnection(url, username, password);
		return connection;
		} else {
			return connection;
		}
	}
}

// Creational design Pattern - "SingleTon" Java Class
// 1) Keep a static variable
// 2) Disable constructor access by making it as private
// 3) keep  a static method which returns the instance of static variable/object
