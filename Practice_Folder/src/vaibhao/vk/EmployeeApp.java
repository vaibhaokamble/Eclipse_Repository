package vaibhao.vk;

import java.util.*;

public class EmployeeApp {
	public static void main(String x[]) {
		Scanner xyz = new Scanner(System.in);
		int id, sal;
		String name;
		System.out.println("Enter name of employee");
		name = xyz.nextLine();
		System.out.println("Enter id of employee");
		id = xyz.nextInt();
		System.out.println("Enter the salary:");
		sal = xyz.nextInt();
		System.out.printf("Name is %s\n:", name);
		System.out.printf("Id is %d\n:", id);
		System.out.printf("Salary is %d:\n", sal);
	}
}