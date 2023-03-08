package Abstraction;
interface y
{
	void public2();
}
interface x extends y
{
	void private3();
}
public interface z extends x,y
{
void show();
void knowledgePark();
int x=20;
}







package Abstraction;
class m implements z
{

	public void show() {
		
		System.out.println("shoe........");
	}

	public void knowledgePark(int s) {
		
		System.out.println("knowledge park.....");
		System.out.println(s);
	}

	public void private3() {
		// TODO Auto-generated method stub
		System.out.println("last put");
	}

	public void public2() {
		// TODO Auto-generated method stub
		System.out.println("las5t last last put in");
	}

	public void knowledgePark() {
		// TODO Auto-generated method stub
		System.out.println("again method override");
	}
	
}
abstract class n implements y
{
	abstract void show();
}
class p extends n
{

	public void public2() {
		System.out.println("public233......");
		
	}

	void show() {
		
		System.out.println("show.....");
	}
	
}


<<<<<<< HEAD
class Hello{
	how are you;
}
=======
	public void private3() {
		
		System.out.println("private3,,,,,");
	}

	public static void main(String args[])
	{
		try
		{
			Class c=Class.forName(args[0]);
		 m de=(m)c.newInstance();
		de.public2();
		de.private3();
		 de.show();
		de.knowledgePark(56);
		de.knowledgePark();
		// de.public2();
		 //de.private3();
		 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class demo2
{
	void show()
	{
		System.out.println("Hello World!");
	}
}

>>>>>>> upstream/main
