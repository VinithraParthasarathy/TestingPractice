
public class InheritanceSingle extends MultilevelInheritance {
String restaurant = "INDIAN FOOD";
public void dosa()
{   
	System.out.println("##SINGLE INHERITANCE##");
	System.out.println("#INDIAN FOOD -DOSA#");
}
public void idly()
{   
	System.out.println("#INDIAN FOOD -IDLY#");
}
public static void main(String args[])
{
	InheritanceSingle s = new InheritanceSingle();
	s.dosa();
	s.idly();
	System.out.println(s.restaurant);
	s.friedRice();
	s.noodles();
}
	
}
