package vaibhao.vk;


import java.util.*;
class ArraySum{
	int a[];
	int sum=0;
	ArraySum(int a[]){
	this.a=a;	
	}
	int getSum() {
		for(int i=0; i<a.length;i++) {
			sum = sum+a[i];
		}
		return sum;
	}
	
}
public class ArraySumApplication {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner xyz  = new Scanner(System.in);
		System.out.println("Enter values in array\n");
		for(int i=0; i<a.length;i++) {
			a[i]=xyz.nextInt();
		}
		ArraySum aSum = new ArraySum(a);
		int result=aSum.getSum();
		System.out.println("Result is "+result);
		
	}
}
