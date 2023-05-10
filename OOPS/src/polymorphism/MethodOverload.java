package polymorphism;

public class MethodOverload {
	public void argument()                   //without parameters
	{
		int a=10,b=20;
		System.out.println(a+b);
	}
public int arguments(int i,int j)           //number of argument
{
	return (i+j);
}

	public double arguments(int i,double j, int k)          //type of argument
	{
		return (i+j+k);
	}
	
	public double arguments(double j, int i)           //order of argument
	{
		return (i+j);
	}
	public double arguments(double k,double j,double i)         //order of argument
	{
		return (i+j+k);
	}
	public static void main(String args[])
	{
		MethodOverload m = new MethodOverload();
		m.argument();
		int arguments=m.arguments(20,30);
		System.out.println(arguments);
		double arguments1=m.arguments(5,5.3,2);
		System.out.println(arguments1);
		double arguments2=m.arguments(5.3,3);
		System.out.println(arguments2);
		double arguments3=m.arguments(2.2, 3.2, 3);
		System.out.println(arguments3);
	    
	}
}
