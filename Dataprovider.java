package sample;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	@DataProvider()
	public Object[][] testapp() {
		Object[][] oj=new Object[][] {
			{"hari",1234,"babu"},
			{"khb",123,"venky"},
		{"kp",234,567,890,"hr"}
		};
		return oj;

}
	}

