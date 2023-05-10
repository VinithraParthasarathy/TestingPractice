package practice;

public class OopsConceptMethod {
	
	public void methodOopsType1 ()
    { 
		int a=1,b=2;
	System.out.println("###WITHOUT PARAMETERS###");
		System.out.println(a+b);
	}
	public void methodOopsType2 (int a, int b)
	{
		System.out.println("###WITH PARAMETERS###");
		System.out.println(a*b);
	}
	
	public int methodOopsType3 ()    //return(return type)
	{
		int a=20, b=12;
		System.out.println("###WITHOUT PARAMETERS WITH RETURNTYPE###");	
		return a-b ;
	}
	
	public int methodOopsType4 (int a, int b)
	{
		System.out.println("###WITH PARAMETERS WITH RETURNTYPE###");	
		return a+b;
	}
	public static void main(String args[])
	{
		OopsConceptMethod m=new OopsConceptMethod();
		m.methodOopsType1 ();
		m.methodOopsType2 (10, 20);
		int value = m.methodOopsType3 ();
		System.out.println(value);
		int sum = m.methodOopsType4 (1, 2);
		System.out.println(sum);
	
	}
}


