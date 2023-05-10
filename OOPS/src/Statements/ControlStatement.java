package Statements;


public class ControlStatement {
int age=12;
public void ifElseStatement()
{
	if(age>=18)
	{
	System.out.println("Eligible to vote");
	}
	else
	{
		System.out.println("Not Eligible to vote");	
	}
	if(age<=18)
	{
		System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not Eligible to vote");	
		}
}
 public static void main (String args[])
{
	ControlStatement IFELSE = new ControlStatement();
	IFELSE.ifElseStatement();
}

}

