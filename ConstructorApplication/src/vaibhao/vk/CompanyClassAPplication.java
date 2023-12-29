package vaibhao.vk;

class Employee {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	private int sal;
}

class Company {
	Employee employee;

	Company(Employee employee) {
		this.employee = employee;
	}

	void show() {
		System.out.println(employee.getId() + "\t" + employee.getName() + "\t" + employee.getSal());
	}
}

public class CompanyClassAPplication {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("vaibhao");
		emp.setSal(1000);
		Company c = new Company(emp);
		c.show();
	}

}
