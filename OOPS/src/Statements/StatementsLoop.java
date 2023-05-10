package Statements;

public class StatementsLoop {
	public void doWhileLooping()
	{
		int a= 5;                        //initialization
		do                        //do()
		{
		 System.out.println(a);                   	//statement
		     a-- ;              	//increment/decrement
		}
		     while(a>=0);                  //while(condition);
	}
public static void main(String args[])
{
	StatementsLoop d=new StatementsLoop();
	d.doWhileLooping();
}
}
