package shadi.com;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Applogin {
	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver","D://predator//chromedriver-win32//chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.shaadi.com/join-now");
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("window.scroll(0,2000)");
	   
	   driver.close();
	
	
	
}
}
