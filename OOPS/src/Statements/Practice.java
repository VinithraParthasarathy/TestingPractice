package Statements;

public class Practice {
 int mark=45;

	public void statementPractice()
	{
		if(mark<50) 
		{
		System.out.println(" Mark scored below 50 = FAIL");
		}
		else if(mark>50&&mark<60) 
		{
		System.out.println(" Mark scored 51-60 = E grade");
		}
		else if(mark>60&&mark<70) 
		{
		System.out.println(" Mark scored 61-70 = D grade");
		}
		else if(mark>70&&mark<80)
		{ 
		System.out.println(" Mark scored 71-80 = C grade");
		}
		else if(mark>80&&mark<90)
		{
		System.out.println(" Mark scored 81-90 = B grade");
		}
		else if(mark>90&&mark<100) 
		{
		System.out.println(" Mark scored 91-100 = A grade");
		}
	
	}
	int marks=45;
	char c;
	public void statementsPractice()

	{
		if(marks<50) {
		c = 'F';}
		else if(marks>50&&marks<60) {
		c = 'E';	}
		else if(marks>60&&marks<70) {
			c = 'D';}
		else if(marks>70&&marks<80) { 
			c = 'C';}
		else if(marks>80&&marks<90) {
			c = 'B';}
		else if(marks>90&&marks<100) {
			c = 'A';}
	
	}
	public static void main(String args[])
	{
		Practice d = new Practice();
		d.statementPractice();
		d.statementsPractice();
	}
	
}



