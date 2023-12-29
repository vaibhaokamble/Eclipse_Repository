package vaibhao.vk;

import java.util.*;
public class StringApplication3 {
	public static void main(String[] args) {
	 String s="good";
	 String s1="";
	 int l=s.length();
	 for(int i=0; i<l;i++) {
		 char ch=s.charAt(i);
		 if(ch>=97 && ch<=122) {
		 	 char c=(char)((int)ch-32);
			 s1=s1+c;
		 }
	 }
	 s=s1;
	 System.out.println(s);
	 
	}
}
