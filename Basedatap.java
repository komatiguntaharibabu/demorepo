package sample;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Basedatap {
	
	
	   @Test(dataProvider="testlogin")
		public void login(Integer i)
		{
			System.out.println(i);
			
		}
		@DataProvider()
		public Integer[] testlogin() {
			Integer[] data=new Integer[] { 
					
					1,
					2,
					3,4
			
			};
			return data;
	
	}
}

