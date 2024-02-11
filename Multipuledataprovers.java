package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multipuledataprovers {
    @Test(dataProvider="test1")
	public void login(String s) {
		System.out.println(s);
	}
	@DataProvider()
	public String[] test1() {
		String[] sj=new String[] {
			"hari",
			"babu",
			"gopi",
			"gh"
		};
		return sj;
	}
	@DataProvider()
	public String[] test2() {
		String[] sj=new String[] {
			"hmmmmmmm",
			"hahuu",
			"dopiiiii",
			"hj"
		};
		return sj;
}
}

