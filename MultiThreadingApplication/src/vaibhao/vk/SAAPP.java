package vaibhao.vk;

class Table1
{
	synchronized void showTable1(int no) 
	{
		try 
		{
			for (int i = 1; i <= 10; i++) 
			{
				System.out.printf("%d X  %d = %d\n", i, no, i * no);
				if (i == 5) 
				{
					wait();
				}
				Thread.sleep(1000);
			}
		} 
		catch (Exception ex) 
		{
			System.out.println("Error is" + ex);
		}
	}

	public synchronized void recall() 
	{
		try 
		{
			notifyAll();
		} catch (Exception ex) 
		{

		}
	}
}

class Two1 extends Thread 
{
	Table1 table1;

	void setTable1(Table1 table1) 
	{
		this.table1 = table1;
	}

	public void run() 
	{
		table1.showTable1(2);
	}
}

class Three1 extends Thread
{
	Table1 table1;

	void setTable1(Table1 table1) 
	{
		this.table1 = table1;
	}

	public void run() 
	{
		table1.showTable1(3);
	}
}

public class SAAPP {
	public static void main(String[] args)
	{
		Table1 t1 = new Table1();
		Two1 tw = new Two1();
		tw.setTable1(t1);
		tw.start();
		Three1 th = new Three1();
		th.setTable1(t1);
		th.start();

		do {
			java.util.Scanner xyz = new java.util.Scanner(System.in);
			String msg = xyz.nextLine();
			if (msg.equals("restart")) {
				t1.recall();
			}
			if (msg.equals("stop")) {
				System.exit(0);
			}

		} while (true);
	}
}
