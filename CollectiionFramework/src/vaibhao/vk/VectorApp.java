package vaibhao.vk;
 
import java.util.*;

public class VectorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector vector = new Vector<>();
		
		vector.add(100);
		vector.add(200);
		vector.add(300);
		
		System.out.println("Normal vector form : ");
		System.out.println(vector);
		
		System.out.println("Fetch the data using for loop : ");
		int sum=0;
		int s = vector.size();
		for (int i = 0; i < s; i++) {
			Object object =vector.get(i);
			
			sum=sum+(int)object;
			System.out.println(object);
			
		}
		System.out.println("The sum is : "+sum);
	}

}
