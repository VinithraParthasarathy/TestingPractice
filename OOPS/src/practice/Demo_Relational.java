package practice;

public class Demo_Relational {                     //class ClassName
	int a=10; int b=20;                        //variable  //data type varname = "data";
   public void relational()                    //method  //public void methodName()
{
 System.out.println(a<b);                      //statements //System.out.println();
 System.out.println(a>b);
 System.out.println(a<=b);
 System.out.println(a>=b);
 System.out.println(a!=b);
 System.out.println(a==b);
}
 public static void main(String args[])             //main method  //public static void main (String args[])
{
	 Demo_Relational d = new Demo_Relational();     //object  //class name object name = new constructor();
    d.relational();                                 //method call using object  //object name.method name();
}

}
