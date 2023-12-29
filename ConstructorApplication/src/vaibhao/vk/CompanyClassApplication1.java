package vaibhao.vk;


class Employee1
{
	public Employee1(String name,int id,int sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
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
class Company1
{    Employee1 employee1;
	Company1(Employee1 employee1){
		this.employee1=employee1;
	}
	void show() {
System.out.println(employee1.getId()+"\t"+employee1.getName()+"\t"+employee1.getSal());
	}
}
public class CompanyClassApplication1 {

	public static void main(String[] args) {
		Employee1 emp = new Employee1("vaibhao",1,1000);
	  Company1 c = new Company1(emp);
	  c.show();
	}
}
