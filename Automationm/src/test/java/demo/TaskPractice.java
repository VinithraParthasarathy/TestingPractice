package demo;
import java.util.HashMap;
import java.util.Iterator;
public class TaskPractice {
	public static void main(String[] args) {
		HashMap<String, Integer> t = new HashMap<>();
		t.put("code 1", 2);
		t.put("code 2" , 5);
		t.put("code 3" , 12);
		t.put("NULL", 0);
		t.put("code 4", 10);
		System.out.println(t);
		System.out.println("# FOR LOOP #");
		for(int a=0; a<t.size(); a++);
		{
			System.out.println(t);
		}
		System.out.println("# ENHANCED LOOP #");
		for(Object c:t)
		{
			System.out.println(c);
		}
		System.out.println("## ITERATOR ##");
		Iterator<String, Integer> r = t.iterator();
		while (r.hasNext())
			System.out.println(r.next());
		System.out.println("## LAMBDA ##");
	t.forEach(h->System.out.println(h)); 
		
	}
	
}
