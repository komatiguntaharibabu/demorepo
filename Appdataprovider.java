  package sample;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Appdataprovider {
	
	@Test(dataProvider="testapp" , dataProviderClass=Dataprovider.class)
	public void login(Object[] o) {
		System.out.println(o);
		
	}
	
			
	}


