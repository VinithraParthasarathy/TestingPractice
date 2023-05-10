package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapDemo {
public static void main(String[] args) {
	HashMap<String,Integer> i= new HashMap<>();
	i.put("VEGGIE", 12);
	i.put("FRUIT", 10);  //DUPLICATE KEY
	i.put("TOYS", 5);
	i.put("NULL", 0);
	i.put("SNACKS", 15);
	i.put("FRUIT", 11);  //VALUE
	System.out.println(i);
	System.out.println();
	System.out.println("## ONLY KEYS ##");
	Set<String> f= i.keySet();
	{
		System.out.println(f);
	}
	System.out.println();
	System.out.println(i.get("VEGGIE")); //value
	System.out.println();
	System.out.println(i.get("snacks")); //duplicate key //null
	System.out.println();
Collection <Integer> values=i.values();{
for(Integer v:values)
{
	System.out.println(v);
}
}
System.out.println();
Set<Entry<String,Integer>> p= i.entrySet();
for(Entry<String,Integer>s:p)
{
	System.out.println(s.getKey()+ "=="+ s.getValue());
}
System.out.println();

Set<Entry<String,Integer>> s= i.entrySet();
for(Entry<String,Integer>l:s)
  if (l.getKey()== "VEGGIE")
{
System.out.println(l.getKey()+ "=="+ l.getValue());
}

}
}

