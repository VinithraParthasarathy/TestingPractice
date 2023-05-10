package Statements;

public class PracticeDemo {
int num=100;
int a=10;
int mark=45;
int marks=85;
public void controlStatement()
{
	if(num<50)
	System.out.println (" Given number is NEGATIVE");
	else if (num>90)
		System.out.println (" Given number is POSITIVE");
}
{
if(a<15)
	System.out.println (" Given number is NEGATIVE");
	else if (a>10)
		System.out.println (" Given number is POSITIVE");
}
public void statementPractice()
{
	if(mark<50) {
	System.out.println(" Mark scored below 50 = FAIL");}
	else if(mark>50&&mark<60) {
	System.out.println(" Mark scored 51-60 = E grade");	}
	else if(mark>60&&mark<70) {
	System.out.println(" Mark scored 61-70 = D grade");}
	else if(mark>70&&mark<80) { 
	System.out.println(" Mark scored 71-80 = C grade");}
	else if(mark>80&&mark<90) {
	System.out.println(" Mark scored 81-90 = B grade");}
	else if(mark>90&&mark<100) {
	System.out.println(" Mark scored 91-100 = A grade");}

}
public void statementsPractice()
{
	if(marks<50) {
	System.out.println(" Mark scored below 50 = FAIL");}
	else if(marks>50&&marks<60) {
	System.out.println(" Mark scored 51-60 = E grade");	}
	else if(marks>60&&marks<70) {
	System.out.println(" Mark scored 61-70 = D grade");}
	else if(marks>70&&marks<80) { 
	System.out.println(" Mark scored 71-80 = C grade");}
	else if(marks>80&&marks<90) {
	System.out.println(" Mark scored 81-90 = B grade");}
	else if(marks>90&&marks<100) {
	System.out.println(" Mark scored 91-100 = A grade");}

}
public static void main (String args[])
{
	PracticeDemo l = new PracticeDemo();
	l.controlStatement();
	l.statementPractice();
	l.statementsPractice();
}
}
