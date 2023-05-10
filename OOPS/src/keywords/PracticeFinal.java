package keywords;

public final class PracticeFinal {    //cannot extend
final int a= 20;
char c= 'v';
public final void practice()  //cannot be overridden
{
	System.out.println(a+c); 
}
public static void main(String args[])
{
	PracticeFinal f = new PracticeFinal();
	f.practice();
	//f.a=10; //cannot modify
}
}
