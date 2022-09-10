package Abstraction;
abstract class vechile
{
	abstract void run();
	abstract void petrol();
	abstract void deseal();
	abstract void driver();
}
class tata extends vechile
{

	void run() {
		// TODO Auto-generated method stub
		System.out.println("tata run on the road");
	}

	void petrol() {
		// TODO Auto-generated method stub
		System.out.println("tata vechile fill the petrol");
	}

	void deseal() {
		// TODO Auto-generated method stub
		System.out.println("tata vechile fill the deaseal");
	}

	void driver() {
		// TODO Auto-generated method stub
		System.out.println("driver can run on the tata vechile");
	}
	
}
class maruti extends vechile
{

	void run() {
		// TODO Auto-generated method stub
		System.out.println("maruti run on the road");
	}

	void petrol() {
		// TODO Auto-generated method stub
		System.out.println("maruti vechile fill the petrol");
	}

	void deseal() {
		// TODO Auto-generated method stub
		System.out.println("maruti vechile fill the deaseal");
	}

	void driver() {
		// TODO Auto-generated method stub
		System.out.println("driver can run on the maruti vechile");
	}
	 
}
class honda extends maruti
{
	void employee() 
	{
		System.out.println("honda employee is great.......");
	}
}

public class Fourwheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
honda f=new honda();
f.employee();
try
{
Class c=Class.forName(args[0]);
	vechile ve=(vechile)c.newInstance();
			ve.run();
			ve.petrol();
			ve.deseal();
			ve.driver();
}
catch(Exception e)
{
	e.printStackTrace();
}
	}

}
