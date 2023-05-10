package practice;
public class StringPractice {
String s ="String";
String s1="String";
String s2= new String("String");
String s3="Immutable";
String s4="   STRING IS IMMUTABLE   ";
String s5="string is immutable";
public void practiceString()
{   System.out.println("###REPLACE AND HASHCODE###");
	System.out.println(s);
	System.out.println(s+" is immutable");
	System.out.println(s.replace('g','G'));
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	System.out.println("###EQUALS AND ==###");
	System.out.println(s.equals(s1));              //true
	System.out.println(s.equals(s2));              //true
	System.out.println(s.equals(s3));              //false
	System.out.println(s==s1);                     //true
	System.out.println(s==s2);                     //false
	System.out.println(s==s3);                     //false
	System.out.println(s2==s3);                    //false
	System.out.println("###UPPER AND LOWER CASE###");
	System.out.println(s.toUpperCase());           //STRING
	System.out.println(s4.toLowerCase());          //   string is immutable
	System.out.println(s4);                        //   STRING IS IMMUTABLE
	System.out.println(s4.trim());                 //STRING IS IMMUTABLE [removes leading&tailing space]
	System.out.println(s3.indexOf('t'));           //4[first occurrence of char]
	System.out.println(s3.lastIndexOf('m'));       //2[immutable][last occurrence of char]
	System.out.println(s3.charAt(5));              //a
	System.out.println(s3.startsWith("Imm"));      //true
	System.out.println(s3.endsWith("ble"));        //true
	System.out.println(s3.startsWith("mm"));       //false
	System.out.println(s3.contains("mut"));        //true
	System.out.println(s.concat(s3));              //StringImmutable
	System.out.println(s.substring(2));            //ring
	System.out.println(s.substring(2,3));          //first(inclusive)last(exclusive)
	char[]c=s.toCharArray();
	for(char a:c)
	{
		System.out.println(a);
	}
	System.out.println();
	String[]split=s5.split(" ");
	for(String spl:split)
	{
		System.out.println(spl);
	}
	String revstring="";
	for(int i=s3.length()-1; i>=0; i--)
	{
		revstring= revstring + s3.charAt(i); 
	}
	System.out.println(revstring);
}
public static void main (String args[])
{
	StringPractice d = new StringPractice();
	d.practiceString();
}
}
