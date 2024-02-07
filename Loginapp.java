package shadi.com;



import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Loginapp {

	public static void main(String[] args) throws Exception {
	
System.setProperty("webdriver.chrome.driver","D://predator//chromedriver_win32");
   
   ChromeDriver driver=new ChromeDriver();
   driver.get("https://www.shaadi.com/join-now");
   
    
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
    
    driver.findElement(By.xpath("//a[@data-testid='sign_up_free'] ")).click();
    driver.findElement(By.xpath("//span[text()='Myself']")).click();
    
     driver.findElement(By.xpath("//span[text()='Male']")).click();

 

      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("haribabu",Keys.TAB,"komatigunta",Keys.TAB,"12",Keys.TAB,"02",Keys.TAB,"1997",Keys.ENTER);

     
       driver.findElement(By.xpath("//label[text()='Religion']")).click();
      
       driver.findElement(By.xpath("//li[@data-value='Hindu']")).click();
       
        driver.findElement(By.xpath("//div[@id='mui-component-select-mother_tongue']")).click();
       
       driver.findElement(By.xpath("//li[@data-value='Telugu']")).click();
   
       driver.findElement(By.xpath("//label[text()='Country']")).click();
       driver.findElement(By.xpath("//li[@data-value='India']")).click();
       driver.findElement(By.xpath("(//p[text()='Continue'])[2]")).click();
       
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("komatiguntaharibabu5759@gmail.com",Keys.TAB,"9182283691",Keys.ENTER);

       driver.findElement(By.xpath("//p[text()='Submit']")).click();
       
       
       driver.quit();
       
       

       

	}

}
