package vaibhao.vk;

import java.util.*;

import java.sql.*;

public class SelectApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vk", "vaibhaovk", "vaibhao");
		if (conn != null) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select *from register");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
		} else {
			System.out.println("Not Connected");
		}
	}
}
