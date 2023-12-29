package vaibhao.vk;

import java.util.*;
public class StringApplication4 {
	public static void main(String[] args) {
String []str=new String[] {"Ganesh","Manesh","vaibhao","Sandeep","Raghav","Ram","Ramesh","Sangram","Govind","Krushna"};		 
	for(int i=0;i<str.length;i++) {
	    boolean b =str[i].endsWith("o");
			  if(b) {
				  System.out.println(str[i]);
			  }
		 }
	}
}
