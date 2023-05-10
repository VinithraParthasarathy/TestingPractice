package abstraction;

public class Son implements Father, Grandpa{
public void friedRice()
{
	System.out.println("FRIED RICE");
}
@Override
public void idly() 
{
System.out.println("IDLY");
	
}
public void icecream()
{
	System.out.println("ICECREAM");
}
public static void main(String args[])
{
	System.out.println("#MULTIPLE#");
	Son s= new Son();
	s.friedRice();
	s.idly();
	System.out.println(Father.gadgets);
	System.out.println(Grandpa.a);
	s.icecream();
	
}
}
