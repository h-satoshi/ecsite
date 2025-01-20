package com.diworksdev.ecsite.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
    //------- MySQL接続に必要な情報設定 -------//
	private static String driverName = "com.mysql.jdbc.Dricver";
	
	private static String url = "jdbc:mysql://localhost/ecsite";
	
	private static String user = "root";
	
	private static String password = "";
	
	public Connection getConnection() {
		
		Connection con = null;
		
	try {
		
		//------- 自分のMySQLへ接続する準備 -------//
		Class.forName(driverName);
		
		con = (Connection) DriverManager.
			   getConnection(url,user,password);
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
		
	}
	
	//------- MySQLに接続できたか情報を渡す -------//
	return con;
		
	}

}
