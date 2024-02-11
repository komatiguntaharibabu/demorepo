package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Compasss {
	
		@Test(dataProvider="test")
	public void login(String s) {
		
		   
	System.setProperty("webdriver.chrome.driver","D://predator//chromedriver-win32//chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.flipkart.com/");
	   driver.manage().window().maximize();
	   
	 WebElement element= driver.findElement(By.xpath("//input[@name='q']"));
	 element.submit();
	   System.out.println(s);

	
		
	}
		@DataProvider()
	public Object[][] test() {
		Object[][] obj=new Object[][] 
				{
			       {"shoes"},
			       {"laptop"},
			       {"tshirts"},
			       {"jeans"}
		   
                 };
	return obj;
	
        }
		
	}

