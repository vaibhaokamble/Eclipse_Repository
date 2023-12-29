package vaibhao.vk;

import java.sql.*;

public class JDBCConnectingApp 
{
	public static void main(String[] args) throws Exception 
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "vaibhaovk", "vaibhao");
		if (conn != null) 
		{
			System.out.println("Database is connected Successfully...................");
		} else {
			System.out.println("Some problem is there.................");
		}
	}
}
