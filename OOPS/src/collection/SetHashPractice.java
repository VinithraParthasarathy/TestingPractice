package collection;

import java.util.*;

public class SetHashPractice {
	public static void main(String[] args) {
		HashSet<Integer> i =new HashSet<>();
		i.add(100);
		System.out.println(i);
		System.out.println();
		HashSet<Object> t = new HashSet<>();
		t.add("HASHSET");
		t.add('H');
		t.add(false);
		t.add(0.2);
		System.out.println(t);
		System.out.println();
		Boolean contains = t.contains('h');
		System.out.println(contains);
		System.out.println();
		int size = t.size();
		System.out.println(size);
		System.out.println();
		t.remove(0.2);
		System.out.println(t);
		System.out.println();
		System.out.println("## ENHANCED FOR LOOP ##");
		for(Object k:t)
		{
			System.out.print(k + "  ");
			System.out.println();
		}
		System.out.println();
		System.out.println("## ARRAY ##");
		Object[]a=t.toArray();
		for(int s=0; s<a.length; s++)
		{
			System.out.println(a[s]);		
		}
	System.out.println();
	System.out.println("## REV ARRAY ##");
		for(int s=a.length-1; s>=0; s--)
		{
			System.out.println(a[s]);	
		}
		System.out.println();
		System.out.println("## ITERATOR ##");
		Iterator<Object> r = t.iterator();
		while (r.hasNext())
			System.out.println(r.next());
		System.out.println();
		System.out.println("## LAMBDA ##");
	t.forEach(h->System.out.println(h)); 
		
	}
	
}
