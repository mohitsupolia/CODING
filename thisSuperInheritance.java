package inheritance;
class Mmm
	{
		Mmm(int c)
		{
			//this()
			System.out.println(c);
			System.out.println("case 1......");
		}
		//Mmm()
		//{
			//System.out.println("same case 1.....");
//		}
	}
	class Nnn extends Mmm
	{
		Nnn(int a,int b)
		{
			super(100);
			System.out.println(a);
			System.out.println(b);
			System.out.println("case 2......");
		}
//		Nnn()
//		{
		//	System.out.println("same case 2.....");
		//}
	}

	public class Aaaa extends Nnn
	{
		Aaaa(int x)
		{
			this();
			System.out.println(x);
			System.out.println("public case 1......");
		}
		Aaaa()
		{
		super(34,89);
			System.out.println("number 4....");
		}
		public static void main(String []args)
		{
			new Aaaa(23);
			
		}

	}
