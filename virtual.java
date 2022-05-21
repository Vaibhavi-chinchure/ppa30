import java.lang.*;
class base
{
	public int i,j;
	public void fun()
	{
		System.out.println("base fun");	
	}
	public void gun()
	{
		System.out.println("base gun");	
	}
	public void sun()
	{
		System.out.println("base sun");	
	}
}
class derived extends base
{
	public int x,y;
	
	public void fun()
	{
		System.out.println("derived fun");	
	}
	public void sun()
	{
		System.out.println("derived sun");	
	}
	public void run()
	{
		System.out.println("derived run");	
	}
}



class virtual
{
	public static void main(String a[])
	{
		//base bobj=new base(); //no casting
		//derived dobj=new derived();//no casting
		base obj1=new derived(); //upcasting
		//derived obj2=new base();//downcasting
		obj1.fun();
		obj1.gun();
		obj1.sun();
		//obj.run();
	}
}