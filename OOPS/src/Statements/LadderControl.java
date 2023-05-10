package Statements;

public class LadderControl {
int val= 8;
String weeks= "tue";
String months= "feb";
public void ladderStatementControl()
{
	if(val%2==0)
	{
	System.out.println(val+" is completely divisible by 2");
}
	if(val%3==0)
	{
		System.out.println(val+" is completely divisible by 3");
	}
	else
	{
		System.out.println(val+" is not completely divisible by 3");
	}
}
public void ladderWeek()
{
	if(weeks=="mon")
	{
		System.out.println("1");	
}
	else if(weeks=="tue")
{
	System.out.println("3");
}
	
}
public void ladderMonths()
{
 if(months=="jan")
	{
		System.out.println("1");
	}
else if(months=="feb")
	{
		System.out.println("2");
	}


}
public static void main(String args[])
{
	LadderControl d= new LadderControl();
	d.ladderStatementControl();
	d.ladderWeek();
	d.ladderMonths();
}
}