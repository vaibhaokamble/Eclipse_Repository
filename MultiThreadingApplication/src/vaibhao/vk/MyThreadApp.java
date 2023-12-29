package vaibhao.vk;

public class MyThreadApp
{
	public static void main(String[] args) throws InterruptedException
	{
	  Thread t=Thread.currentThread();
	    String threadName=t.getName();
	    System.out.println("Thread Name is "+threadName);  
	}
}
