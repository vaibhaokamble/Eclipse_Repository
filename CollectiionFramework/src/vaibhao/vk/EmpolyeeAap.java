package vaibhao.vk;

import java.util.*;

class Employee{
	private int id;
	private String name;
	private int sal;

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
	
}
public class EmpolyeeAap {
	
	public static void main(String[] args) {
		Vector v = new Vector();
		 Employee emp1 = new Employee();
		  emp1.setId(1);
		  emp1.setName("Vaibhao");
		  emp1.setSal(10000);
		 
		  Employee emp2 = new Employee();
		  emp2.setId(2);
		  emp2.setName("Samrat");
		  emp2.setSal(20000);
		  
		  Employee emp3 = new Employee();
		  emp3.setId(3);
		  emp3.setName("Sangharsh");
		  emp3.setSal(30000);
		  
		  v.add(emp1);
		  v.add(emp2);
		  v.add(emp3);		  
		  Iterator  i = v.iterator();
		  while(i.hasNext()) {
			  Object obj  =i.next();
			  Employee e =(Employee)obj;
			  System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		  }
		  
	}
}
