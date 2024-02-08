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

	public static void main(String[] args) throws AWTException, Exception {
		
		System.setProperty("webdriver.chrome.driver","D://predator//chromedriver-win32//chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.shaadi.com/join-now");
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
		   
		   
		 //  driver.findElement(By.xpath("//a[@data-testid='sign_up_free']")).click();
      
		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9182283691",Keys.TAB,"Hari@1111",Keys.ENTER);
		 //driver.findElement(By.xpath("//input[@value='Login']")).click();
		   Thread.sleep(2000);
		   //driver.findElement(By.xpath("//span[text()='Myself']")).click();
          WebElement element= driver.findElement(By.xpath("//input[@name='places']"));
		   element.sendKeys("Bangalore, Karnataka, India");
		   
		  driver.findElement(By.xpath("//div[text()='Yes']")).click();
		   
		  
		 
		  
		  driver.findElement(By.xpath("//input[@value='Never Married']")).click();
		   
		  driver.findElement(By.xpath("//div[text()='Non-Veg']")).click();
		  driver.findElement(By.xpath("(//button[@direction='down'])[2]"));
		  
		  //robot r=new robot();
		  //r.keypress(keyevent.vk_down);
		  //r.keyrelese(keyevent.vk_down);
		  //r.keypress(keyevent.vk_enter);
		 // r.keyrelese(keyevent.vk_enter);
		  
		  
		  
		  driver.findElement(By.xpath("//div[@value='5ft 2in - 157cm'] ")).click();
		  
		  driver.findElement(By.xpath("(//button[@direction='down'])[3]")).click();
		 //robot n=new robot();
		  //n.keypress(keyevent.vk_down);
		  //n.keyrelese(keyevent.vk_down);vk_enter
		  //n.keypress(keyevent.vk_enter);
		 // n.keyrelese(keyevent.vk_enter);
		  
		  driver.findElement(By.xpath("//input[@value='Bhatraju']")).click(); 
		  driver.findElement(By.xpath("//input[@id='casteNoBar']")).click();
		  
		  
		  driver.findElement(By.xpath("//span[text()='Continue']")).click();
		  
		  
		  driver.findElement(By.xpath("(//button[@direction='down'])[1]")).click();
		  Robot m=new Robot();
		  m.keyPress(KeyEvent.VK_DOWN);
		  m.keyRelease(KeyEvent.VK_DOWN);
		  m.keyPress(KeyEvent.VK_ENTER);
		  m.keyRelease(KeyEvent.VK_ENTER);
		  driver.findElement(By.xpath("(//button[@direction='down'])[2]")).click();
		  driver.findElement(By.xpath("//input[@placeholder='Enter your college name']")).click();
		  Robot k=new Robot();
		  k.keyPress(KeyEvent.VK_DOWN);
		  k.keyRelease(KeyEvent.VK_DOWN);
		  k.keyPress(KeyEvent.VK_ENTER);
		  k.keyRelease(KeyEvent.VK_ENTER);
		 
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("(//button[@direction='down'])[3]")).click();
		  Robot s=new Robot();
		  s.keyPress(KeyEvent.VK_DOWN);
		  s.keyRelease(KeyEvent.VK_DOWN);
		  s.keyPress(KeyEvent.VK_ENTER);
		  s.keyRelease(KeyEvent.VK_ENTER);
		  
	driver.findElement(By.xpath("//input[@placeholder='Enter your company name ']")).click();
	
		  
	    Robot q=new Robot();
	     q.keyPress(KeyEvent.VK_DOWN);
	     q.keyRelease(KeyEvent.VK_DOWN);
	     q.keyPress(KeyEvent.VK_ENTER);
	     q.keyRelease(KeyEvent.VK_ENTER);
		  
		  driver.findElement(By.xpath("(//button[@direction='down'])[4]")).click();
		  
		  
		  Robot p=new Robot();
		  p.keyPress(KeyEvent.VK_DOWN);
		  p.keyRelease(KeyEvent.VK_DOWN);
		  p.keyPress(KeyEvent.VK_DOWN);
		  p.keyRelease(KeyEvent.VK_DOWN);
		  p.keyPress(KeyEvent.VK_DOWN);
		  p.keyRelease(KeyEvent.VK_DOWN);
		  p.keyPress(KeyEvent.VK_ENTER);
		  p.keyRelease(KeyEvent.VK_ENTER);
		  
		   
      driver.findElement(By.xpath("//span[text()='Create Profile']")).click();
      
      
      driver.findElement(By.xpath("//img[@id='profileImgSmall']")).click();
      driver.findElement(By.xpath("//span[text()='Logout']")).click();
		   driver.quit();
      
      
      
	}

}
