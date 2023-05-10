
public class Daughter extends father {
	public void favItalianFood()
	{
		System.out.println("PIZZA");
	}
	public static void main(String args[])
	{
		System.out.println("Daughter");
		Daughter d = new Daughter();
		d.favItalianFood();//daughter
		d.favIndianFood();
		System.out.println();
		System.out.println("Son");
		son s = new son();
		s.favChineseFood();  //son
		
		System.out.println();
		System.out.println("Father");
		father f = new father();
		f.favIndianFood();
		System.out.println();
		System.out.println("Grandpa");
		Grandpa g = new Grandpa();
		g.favDessert();
		
	}
	}

