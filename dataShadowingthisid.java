package basics;

public class this1 {
	int x=19;
	void test()
	{
		int x=20;
		System.out.println(this.x);
		System.out.println(this);
	}
	this1()
	{
		System.out.println(x);
		System.out.println(this);
	}
	public static void main(String args[])
	{
		this1 th=new this1();
		th.test();
		System.out.println(th);
	}

}
