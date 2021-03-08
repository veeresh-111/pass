package scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Composite {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","./softwares1/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		WebElement ele=driver.findElement(By.xpath("//a[.='Downloads']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		//act.sendKeys(Keys.CONTROL).click(ele).perform();
		act.sendKeys(Keys.SHIFT).click(ele).perform();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
