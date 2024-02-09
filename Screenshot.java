package shadi.com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException, Exception{
	System.setProperty("webdriver.chrome.driver","D://predator//chromedriver-win32//chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.shaadi.com/join-now");
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   //full page screenshot   
          //TakesScreenshot ts=(TakesScreenshot)driver;
		  //File src=   ts.getScreenshotAs(OutputType.FILE);
	      //FileHandler.copy(src, new File(".\\screenshot\\homepage.png"));
		
		   // halfpage or section
		   // WebElement section=driver.findElement(By.xpath("//div[@class='row ']"));
		   //File src=section.getScreenshotAs(OutputType.FILE);
		   // FileHandler.copy(src,new File(".\\screenshot\\section.png"));
		   
		   
		
		     WebElement element= driver.findElement(By.xpath("//img[@data-testid='shaadi_logo']"));
		     File src=element.getScreenshotAs(OutputType.FILE);
		 
		     FileHandler.copy(src,new File(".\\screenshot\\elemnt.png"));
		 
		 
		driver.close();
		   
		   
		   
		   
	}

}
