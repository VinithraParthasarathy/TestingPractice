package practice;

public class StringBufferBuilder {
public static void main(String args[])
{ System.out.println("####STRING BUFFER####");
	StringBuffer sbb=new StringBuffer("#BUFFER#"); 
	System.out.println(sbb);
	System.out.println(sbb.hashCode());
	sbb.append("String");
	System.out.println(sbb);
	System.out.println(sbb.hashCode());
	sbb.insert(7, "#####");
	System.out.println(sbb);
	System.out.println(sbb.hashCode());
	sbb.reverse();
	System.out.println(sbb);
	System.out.println(sbb.hashCode());
	sbb.replace(6, 8, "O");
	System.out.println(sbb);
	System.out.println(sbb.hashCode());
	System.out.println("####STRING BUILDER####");
	StringBuffer sb=new StringBuffer("#BUILDER#");
	System.out.println(sb);
	System.out.println(sb.hashCode());
	sb.append("String");
	System.out.println(sb);
	System.out.println(sb.hashCode());
	sb.insert(7, "$$$$$$$$$");
	System.out.println(sb);
	System.out.println(sb.hashCode());
	sb.reverse();
	System.out.println(sb);
	System.out.println(sb.hashCode());
	sb.replace(7, 9, "#");
	System.out.println(sb);
	System.out.println(sb.hashCode());
	
}
}
