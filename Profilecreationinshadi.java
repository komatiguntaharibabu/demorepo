package shadi.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Profilecreationinshadi {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D://predator//chromedriver_win32");
		   
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.shaadi.com/join-now");
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
      
		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9182283691",Keys.TAB,"Hari@1111",Keys.ENTER);
		   driver.findElement(By.xpath("//input[@value='Login']")).click();
		   
          WebElement element= driver.findElement(By.xpath("//input[@name='places']"));
		   element.sendKeys("Bangalore, Karnataka, India");
		   
		  driver.findElement(By.xpath("//div[text()='Yes']")).click();
		   
		 
		  
		  driver.findElement(By.xpath("//input[@value='Never Married']")).click();
		   
		  driver.findElement(By.xpath("//div[text()='Non-Veg']")).click();
		  driver.findElement(By.xpath("(//button[@direction='down'])[2]")).sendKeys("6ft 182cm");
		  
		  
		  
		  driver.findElement(By.xpath("")).click();
		  driver.findElement(By.xpath("")).click();
		  driver.findElement(By.xpath("")).click(); 
		  driver.findElement(By.xpath("")).click();
		   
      
		   driver.quit();
      
      
      
	}

}
