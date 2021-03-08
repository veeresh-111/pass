package scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","./softwares1/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//h2[.='Best of Electronics']"));
		
		/*for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,50)");
			Thread.sleep(3000);
		}
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,-50)");
			Thread.sleep(3000);
		}*/
		Point loc=ele.getLocation();
		System.out.println(loc);
		int x=loc.getX();
		int y=loc.getY();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		driver.findElement(By.xpath("//div[.='Wired Earphones']")).click();

	}

}
