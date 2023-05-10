package Statements;

public class LoopingStatement {
public void loopingForStatement()
{
	for (int a=10; a>=1; a--)   //for (initialization; condition; increment/decrement;)
	{
		System.out.println(a);//statement
	}
}
	public static void main(String args[])
	{
		LoopingStatement s=new LoopingStatement();
		s.loopingForStatement();
	}

}
