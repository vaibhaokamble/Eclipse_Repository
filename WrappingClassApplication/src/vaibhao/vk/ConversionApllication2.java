package vaibhao.vk;

import java.net.SocketTimeoutException;
import java.util.*;

public class ConversionApllication2 
{

	public static void main(String[] args) 
	{
		int a = 100;
		Integer b = a; //auto boxing
		System.out.println("B is : "+b);
		
		Integer d= 500;
		int e=d;  //auto unboxing
		System.out.println("E is : " +e);
	}

}
