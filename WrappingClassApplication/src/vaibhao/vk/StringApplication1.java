package vaibhao.vk;
import java.util.*;
public class StringApplication1 {
	public static void main(String[] args) {
		Scanner xyz  = new Scanner(System.in);
		System.out.println("enter string data");
		String s=xyz.nextLine();
		int sum=0;
		for(int i=0; i<s.length();i++) {
			char ch=s.charAt(i);
			int asc=(int)ch;
			if(asc>=48 && asc<=57) {
		 		sum=sum+(asc-48); //49-48=1
			}
		}
		System.out.println("Sum is "+sum);
		
	}
}
