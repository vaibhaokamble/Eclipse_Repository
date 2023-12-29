package vaibhao.org;

public class P6 {

	public static void main(String[] args) {
		int dailywage=4;
		int number_of_day=5;
		int salary;
		
		salary=number_of_day++ * --dailywage * dailywage++ * number_of_day--;
		
		salary=-dailywage;
		
		System.out.println(dailywage+""+number_of_day+""+salary);

	}

}
