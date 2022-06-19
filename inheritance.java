package inheritance;
class Base
{
	int x=20;
	void main()
	{
		System.out.println(x);
	}
}
	public class Mohittt extends Supolia	{
		Mohittt()
		{
			System.out.println(y);
		}
		void method()
		{
			System.out.println(y);
		}
		public static void main(String args[])
		{
		Mohittt ch=new Mohittt();
		ch.method();
		System.out.println(new Mohittt().y);
		}
	}
	class Supolia
	{
		int y=9;
		void info()
		{
			System.out.println(y);
		}
	}
