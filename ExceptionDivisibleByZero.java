package basics;

public class this1 {
	static int x=20;
	static int y=0;
	
	public static void main(String args[])
		{
		try
		{
			int r=x/y;
			System.out.println("Dividion="+r);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		}
	}
