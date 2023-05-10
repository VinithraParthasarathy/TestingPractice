package Statements;

public class ControlStatementJumping {
public void jumpingContinue()
{for(int num=1; num<=10; num++)
{
	if (num==4)
{
	continue;
	}

{
	if (num==10)
	{
		break;
	}
	{
		System.out.println(num);
	}
	}
}

}
public static void main(String args[])
{
	ControlStatementJumping l =new ControlStatementJumping();
	l.jumpingContinue();
}
}
