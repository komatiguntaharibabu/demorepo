package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basedata1 {
     @Test(dataProvider="testlogin")
	public void login(String s)
	{
		System.out.println(s);
		
	}
	@DataProvider()
	public String[]testlogin() {
		String[] data=new String[] {
				"hello",
				"string",
				"data"
		};
		return data;
	}
	
}
