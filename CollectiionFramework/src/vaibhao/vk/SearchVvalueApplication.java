package vaibhao.vk;
import java.util.*;
public class SearchVvalueApplication {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("Enter value in collection");
		Scanner xyz  = new Scanner(System.in);		
		 do {
			int value=xyz.nextInt();
			v.add(value);
			xyz.nextLine();
			System.out.println("Do you want to stop");
			String msg=xyz.nextLine();
			 if(msg.equals("yes"))
			 {   break;
			 }
		 }while(true);
		System.out.println("Enter data for search");
		int data =xyz.nextInt();
		boolean b = v.contains(data);
		if(b)//if(true)
		{  System.out.println("Data found");
		}
		else { System.out.println("data not found");
		}
	}
}
