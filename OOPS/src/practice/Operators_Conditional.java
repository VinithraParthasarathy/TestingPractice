package practice;

public class Operators_Conditional {
int a=10, b=20;
public void conditionalOperator()
{
	System.out.println("###Conditional 1###");
	System.out.println(a<b?"A is less than B" : "A is not less than B");
	System.out.println("###Conditional 2###");
	System.out.println(a>b?"A is greater than B" : "A is not greater than B");
	System.out.println("###Conditional 3###");
	System.out.println(a==b?"A is equal to B" : "A is not equal to B");
}
public static void main(String args[])
{
	Operators_Conditional d = new Operators_Conditional();
	d.conditionalOperator();
}

}
