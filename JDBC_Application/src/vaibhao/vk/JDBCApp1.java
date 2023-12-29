package vaibhao.vk;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class JDBCApp1 
{
	public static void main(String[] args) throws SQLException 
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vk","vaibhaovk","vaibhao");
		if (conn!=null) {
			System.out.println("Database Is Connected..........");
			Statement statement=conn.createStatement();
			int val=statement.executeUpdate("insert into register values('0','ram','ram@gmail.com','123455')");
					 if(val>0)
					 {
					 System.out.println("Record Save................");
					 }

		}
		else {
			System.out.println("Some Problem Is There.........");
		}
	}
}
