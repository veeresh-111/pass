package scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares1/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/veeresh/Desktop/xpath/page1.html");
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).sendKeys("abc");
		WebElement f=driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		//driver.switchTo().frame(f);
		//driver.findElement(By.id("t2")).sendKeys("xyz");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).clear();
		driver.findElement(By.id("t1")).sendKeys("123");

	}

}
