package vaibhao.vk;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable {
	private int id;
	private String name;
	private int sal;

	Employee(String name, int id, int sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getSal() {
		return sal;
	}

	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		if (this.getId() > emp.getId()) {
			return 1;
		} else if (this.getId() < emp.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class ComparableSortingApp {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Employee("Vaibhao", 1, 1000));
		al.add(new Employee("Villain", 4, 5000));
		al.add(new Employee("VK", 2, 3000));
		al.add(new Employee("Virat", 5, 9000));
		al.add(new Employee("Vinay", 3, 2000));
		System.out.println("Before Sorting");
		for (Object obj : al) {
			Employee emp = (Employee) obj;
			System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSal());
		}
		Collections.sort(al);
		System.out.println("After Sorting");
		for (Object obj : al) {
			Employee emp = (Employee) obj;
			System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSal());
		}
	}

}
