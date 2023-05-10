package keywords;

public class AccessModifiesPractice {
protected int a =10;
protected void methodName()
{
	System.out.println("#public access modifiers#");
	System.out.println(a);
}
public static void main(String args[])
{
	AccessModifiesPractice am = new AccessModifiesPractice();
	am.methodName();
}


}
