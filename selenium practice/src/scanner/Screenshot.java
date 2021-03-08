package scanner;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Screenshot 
{

	public static void main(String[] args) throws  InterruptedException 
	{
  System.setProperty("webdriver.gecko.driver","./softwares1/geckodriver.exe");
          WebDriver driver= new FirefoxDriver();
          driver.get("https://www.facebook.com");
          Thread.sleep(3000);
          TakesScreenshot ts= (TakesScreenshot)driver;
          File src=ts.getScreenshotAs(OutputType.FILE);
          File dst= new File("E:\\veeresh\\Pictures\\facebook.jpeg");
          
		

	}

}
