package keywords;

public class  KeyStatic{
	static int companyposition= 1;  //static variable
	int employeeid ;
	String employeename ;
   static  String companyname ;  //STATIC
   
	public KeyStatic(int employeeid,String employeename,String companyname)
	{                   
		this.employeeid = employeeid;        
		this.employeename = employeename;
		KeyStatic.companyname = companyname;  

System.out.println("### Static block ###");
System.out.println();
		System.out.println("Id of the employee is " + employeeid);
		System.out.println("Name of the employee is " + employeename);
		System.out.println("Name of the company is " + companyname);
	}
	public static void position()       //static method
	{
		System.out.println();
		System.out.println();
		System.out.println("### Static var and method ###");
		System.out.println("COMPANY POSITION");
	}
	public static void main (String args[])
	{
		new KeyStatic(14765,"Mr.D","xyz");
		new KeyStatic(14766,"Mr.A","xyz");
		new KeyStatic(14767,"Mr.S","xyz");
		KeyStatic.position();
	System.out.println(KeyStatic.companyposition);
		
	}
	}


