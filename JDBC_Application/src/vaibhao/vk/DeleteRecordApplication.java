package vaibhao.vk;

import java.sql.*;
import java.util.*;

public class DeleteRecordApplication {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Connection conn;
		Statement stmt;
		try {
			com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vk", "vaibhaovk", "vaibhao");
			if (conn != null) {
				System.out.println("Connected");
				Scanner xyz = new Scanner(System.in);
				stmt = conn.createStatement();
				System.out.println("Enter the email");
				String e = xyz.nextLine();
				int val = stmt.executeUpdate("delete from register where email='" + e + "'");
				if (val > 0) {
					System.out.println("Record Deleted Success.............");
				} else {
					System.out.println("Some problem is there....................");
				}
			} else {
				System.out.println("Not connected");
			}
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
		}
	}
}