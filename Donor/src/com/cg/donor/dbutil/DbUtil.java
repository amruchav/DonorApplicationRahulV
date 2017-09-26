package com.cg.donor.dbutil;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
	public static Connection getConnection() throws IOException, SQLException
	{
		Connection conn=null;
		Properties prop=readdonor();
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		conn=DriverManager.getConnection(url,username,password);
		return conn;
	}

	private static Properties readdonor() throws IOException {
		
		Properties p=new Properties();
		FileReader fr=new FileReader("donor.properties");
		p.load(fr);
		return p;
	}
}
