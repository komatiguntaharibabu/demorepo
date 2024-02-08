package shadi.com;



import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginapp {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver","D://predator//chromedriver-win32//chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.shaadi.com/join-now");
  
   
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   
		   
    driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//a[@data-testid='sign_up_free'] ")).click();
    
    driver.findElement(By.xpath("//span[text()='Myself']")).click();
    Thread.sleep(1000);
    
     driver.findElement(By.xpath("//span[text()='Male']")).click();

 

     WebElement element= driver.findElement(By.xpath("//input[@type='text']"));
     element.sendKeys("haribabu",Keys.TAB,"komatigunta",Keys.ENTER);
      
     
     
      
          driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("11");
      

         driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("02");
   
    
             
              
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1990");
        
           driver.findElement(By.xpath("(//p[text()='Continue'])[2]")).click();
     
     
      driver.findElement(By.id("mui-component-select-community")).click();
       
       Robot r=new Robot();
       r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
  
      
      // driver.findElement(By.xpath("//li[@data-value='Hindu']")).click();
       
       
       
        driver.findElement(By.xpath("(//div[@role='button'])[11]")).click();
       
        
        
       driver.findElement(By.xpath("//li[@data-value='Telugu']")).click();
   
       driver.findElement(By.xpath("//label[text()='Country']")).click();
       driver.findElement(By.xpath("//li[@data-value='India']")).click();
       driver.findElement(By.xpath("(//p[text()='Continue'])[2]")).click();
       
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("komatiguntaharibabu5759@gmail.com",Keys.TAB,"9182283691",Keys.ENTER);

       driver.findElement(By.xpath("//p[text()='Submit']")).click();
       
       
       driver.quit();
       
       

       

	}

}
