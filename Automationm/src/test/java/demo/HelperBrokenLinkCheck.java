package demo;

import java.net.HttpURLConnection;
import java.net.URL;

public class HelperBrokenLinkCheck {
public static void brokenLinkChecker(String str) {
	int count =0;
	try {
		HttpURLConnection httpurl=null;

		URL url = new URL(str);
		
		httpurl=(HttpURLConnection)url.openConnection();
		
		httpurl.connect();
		
		int statuscode= httpurl.getResponseCode();
		
		if(statuscode>=400)
		{
			System.out.println("Given link is a broken link: " +str);
			count++;
		}
		else
		{
			System.out.println("Given link is a valid link: " +str);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}



}
}
