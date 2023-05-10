package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class DataImplementation {
	@Given("User is sending the datas at the step level")
	public void user_is_sending_the_datas_at_the_step_level(DataTable data) throws InterruptedException {
		
		List<List<String>> asLists = data.asLists();
		
//		List<String> list = asLists.get(2);
	//	
//		for(String l:list)
//		{
//			System.out.println(l);
//		}
		
		
		System.out.println("To print all the datas ");
		
		for(int i =0;i<asLists.size();i++)
		{
			for(int j=0;j<asLists.get(i).size();j++)
			{
				System.out.println(asLists.get(i).get(j));
			}
			
		}
		
		
	}
}
