package Abstraction;
interface y
{
	void public2();
}
interface x extends y
{
	void private3();
}
public interface z extends	 x,y
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


class Hello{
	how are you;
}