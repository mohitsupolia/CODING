package Interruptmethod;
class Show extends Thread
{
	int x=5;
	 synchronized public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hello lets start.......");
		for(int i=1;i<=10;i++)
		{
			try
			{
			//	System.out.println(Thread.currentThread().getName());
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println("No tension,they can hardwork we easily achieve our goals.");
			}
			System.out.println(x+"*"+i+"="+(x*i));
		}
	}
/*	public void interrupt(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}*/
}
class Demo extends Thread
{
	Show t1;
	Into t2;
	Demo(Show t1,Into t2)
	{
		this.t1=t1;
		this.t2=t2;
	}
	 synchronized public void run()
	{
	//	System.out.println("Never give up..............................");
	//	System.out.println(Thread.currentThread().getName());
		try {
		t1.join();
		t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println("Never give up..............................");
		System.out.println(t1.isInterrupted());
		t1.interrupt();
		System.out.println(t1.isInterrupted());
	}
}
class Into extends Thread
{
	int a=10;
	 synchronized	public void run()
	{
		 System.out.println(Thread.currentThread().getName());
		System.out.println("I am empty but I print table of 10");
		for(int j=1;j<=10;j++)
		{
			try
			{
				Thread.sleep(300);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(a+"*"+j+"="+(a*j));
		}
	}
}
public class Intrupting 
{

	public static void main(String[] args) 
	{
		Show sh=new Show();
		Into in=new Into();
		Demo de=new Demo(sh,in);
		sh.setName("one");
		de.setName("two");
		in.setName("three");
		sh.start();
		de.start();
		in.start();
	}

}
