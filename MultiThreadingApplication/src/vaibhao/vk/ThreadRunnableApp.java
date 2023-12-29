package vaibhao.vk;

class Test implements Runnable
{
	@Override
	public void run() {
		try {
			for(int i=1;i<=5; i++) {
				System.out.println("I = "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}	
	}
}
public class ThreadRunnableApp {
	public static void main(String[] args) {
		Test t1 = new Test();
		Thread th = new Thread(t1);
		th.start();
	}
}
