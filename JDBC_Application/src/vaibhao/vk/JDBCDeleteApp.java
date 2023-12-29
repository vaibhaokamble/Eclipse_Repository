package vaibhao.vk;

import java.sql.*;//step1

import java.util.*;

public class JDBCDeleteApp {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		try {
			com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);// step2 register driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vk", "vaibhaovk", "vaibhao");// step3
																											// establish
																											// connection
			if (conn != null) {
				stmt = conn.createStatement();// step4
				int val = stmt.executeUpdate("delete from register where email='ram@gmail.com'");
				if (val > 0) {
					System.out.println("Record Deleted Success...............");
				} else {

					System.out.println("Some problem is there.....................");
				}
			} else {
				System.out.println("Not connected");
			}
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
		}
	}
}
