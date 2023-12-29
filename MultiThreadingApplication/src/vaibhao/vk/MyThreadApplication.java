package vaibhao.vk;

class MyThread extends Thread
{
	public void run()
	{
		try 
		{
			for (int i = 0; i < 5; i++) {
				System.out.println("First Thread : " +i+"\t"+this.isAlive());
				if (i==3) 
				{
					stop();
				}
				sleep(1000);
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);// TODO: handle exception
		}
	}
}

class MyThread1 extends Thread
{
	public void run()
	{
		try 
		{
			for (int i = 0; i < 20; i++) 
			{
				System.out.println("Second thread "+i);
				sleep(1000);
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);// TODO: handle exception
		}
	}
}
public class MyThreadApplication 
{
	public static void main(String argString []) throws InterruptedException 
	{
		MyThread myThread =new MyThread();
		myThread.start();
		myThread.join();
		
		System.out.println("Now thread status is "+myThread.isAlive());
		MyThread1 myThread1=new MyThread1();
		myThread1.start();
	}
}
