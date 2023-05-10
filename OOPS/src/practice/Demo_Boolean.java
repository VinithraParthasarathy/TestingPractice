package practice;

public class Demo_Boolean {                           //class classname
     boolean b = true;                           //variable   //data type varname=data;
	  public void displayWord()                        //method //public void method Name()
	{
		System.out.println(b);                        //statements //System.out.println();
	}
	  public static void main (String args[])           //main method  //public static void main (String args[])
	  {
	  Demo_Boolean d= new Demo_Boolean();                  //object    //class name object name = new constructor();
	  d.displayWord();                        //method call using object   //object name.methodName();
}
}

