package Statements;

public class StatementLoop {
public void loopingWhileStatements()
{
    int num =10;                 //initialization
	while(num>=1)              //while(condition)
{
  System.out.println(num);      //statement
	     num--;                //increment/decrement
}
int a = 1;
while(a<=10)
{
	System.out.println(a);
	a++;
}
}
public void doWhileLooping()
{
	int a=10;                        //initialization
	do                                //do()
	{
	 System.out.println(a);        	//statement
	     a-- ;              	         //increment/decrement
	}
	     while(a>=1);                  //while(condition);
}
public void loopingForStatement()
{
	for (int a=10; a>=1; a--)          //for (initialization; condition; increment/decrement;)
	{
		System.out.println(a);         //statement
	}
}
public static void main (String args[])
{
StatementLoop l= new StatementLoop();
l.loopingWhileStatements();
l.doWhileLooping();
l.loopingForStatement();
}

}
