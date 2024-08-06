package com.grayMatter.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DataSource {
	
	private String driverName;
	private String url;
	private String uname;
	private String pwd;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driverName);
		Connection con =DriverManager.getConnection(url,uname,pwd);
		return con;
	}
	

}
