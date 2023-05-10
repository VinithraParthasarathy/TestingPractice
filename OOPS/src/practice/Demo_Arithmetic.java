package practice;

public class Demo_Arithmetic {     //class Class Name {
      int a=10, b=20;                   //variable //datatype varname= data;
	  public void Arithmetic()         //method //public void methodName()
	{
		System.out.println("Addition");
		System.out.println(a+b);         //statements //System.out.println();
		System.out.println("Subration");
		System.out.println(a-b);
		System.out.println("Multiplication");
		System.out.println(a*b);
		System.out.println("Division");
		System.out.println(a/b);
		System.out.println("Module");
		System.out.println(a%b);
	}
	  public static void main(String args[])     //main method  //public static void main (String args[])
	{
		  Demo_Arithmetic c= new Demo_Arithmetic();   //object //class name object name= new constructor();
	  c.Arithmetic();                               //method call using object //object name.methodName();
}
}
