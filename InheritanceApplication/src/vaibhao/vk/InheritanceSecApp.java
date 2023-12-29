package vaibhao.vk;

class Employee {
	String name;
	int id;
	int contact;

	void setEmployeeInfo(String name, int id, int contact) {
		this.name = name;
		this.id = id;
		this.contact = contact;

		System.out.println("The Employee name id contact is :" + "\n" + name + "\n" + id + "\n" + contact);
	}
}

class FE extends Employee {
	void calHourlySal(int nhour, int ppcost) {
		int total = nhour * ppcost;
		System.out.println("Total salary is :" + total);
	}
}

class RE extends Employee {
	void calMonthSal(int anualSal) {
		int monSal = anualSal / 12;
		System.out.println("Monthly Salary is : " + monSal);
	}
}

class CE extends Employee {
	void projectWiseSal(int nproj, int ppsal) {
		int totalCost = nproj * ppsal;
		System.out.println("Total number of project is :" + totalCost);
	}
}

public class InheritanceSecApp {

	public static void main(String[] args) {
		FE f = new FE();
		f.setEmployeeInfo("vaibhao", 1, 123456);
		f.calHourlySal(100, 22);

		RE r = new RE();
		r.setEmployeeInfo("Akshat", 2, 789456);
		r.calMonthSal(123000);

		CE c = new CE();
		c.setEmployeeInfo("Amol", 3, 4561);
		c.projectWiseSal(2, 56);
	}

}
