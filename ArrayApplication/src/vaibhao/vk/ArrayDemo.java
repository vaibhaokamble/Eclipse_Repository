package vaibhao.vk;
import java.util.*;
public class ArrayDemo {
	   public static void main(String x[])
	   {  
		   Scanner v  = new Scanner(System.in);
	      int a[]; //declaration
	        a = new int[5];
	      System.out.println("Enter values in array");
		   for(int i=0; i<a.length; i++)
	       { a[i]=v.nextInt();
	       }
		   System.out.println("Display array values");
			for(int i=0; i<a.length;i++)
			{ System.out.printf("a[%d] ---->%d\n",i,a[i]);
			}
	   }
	}
