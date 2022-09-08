package inheritance;
class another
{
	public void into(int x)
	{
	System.out.println("....."+x);
	}
	public void into(float x)
	{
		System.out.println("....."+x);
		
	}
}
public class Methodoverloading extends another {
	public void showoff()
	{
		System.out.println("show off......");
	}
	public void showoff(int x)
	{
		System.out.println(x);
	}
	public void showoff(float x)
	{
		System.out.println(x);
	}
	public void showoff(float a,float b,float c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public void showoff(String a,boolean s)
	{
		System.out.println(a);
		System.out.println(s);
	}
	public static void main(String[] args) {
		Methodoverloading me=new Methodoverloading();
		another me1=new another();
		me.showoff(43.0f,23.56f,78.0f);
		me.showoff();
		me.showoff(1000.43547f);
		me.showoff(4365);
		me1.into(34);
		me1.into(0.5f);

	}

}
