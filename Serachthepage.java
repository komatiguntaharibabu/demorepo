package shadi.com;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Serachthepage {
    public static void main(String args[]) throws Exception {
 
    	
    System.setProperty("webdriver.chrome.driver","D://predator//chromedriver-win32//chromedriver.exe");
        
        	
        
        ChromeDriver driver=new ChromeDriver();
        
        driver.get("https://www.google.com");
        
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//a[text()='Images']"));
       Actions act=new Actions(driver);
       act.moveToElement(element).contextClick().build().perform();
        
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        
        Thread.sleep(3000);
        driver.close();
        
        
        
        
     
        
        
        
    }
}