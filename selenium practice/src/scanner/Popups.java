package scanner;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popups 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","./softwares1/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[.='Java']/..//td[6]//a[1]")).click();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(3000);
       // r.keyPress(KeyEvent.VK_ENTER);
      //  r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CANCEL);
		r.keyRelease(KeyEvent.VK_CANCEL);
		
		/*driver.findElement(By.xpath("//i[.='Cal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='10']")).click();*/
		
		
		
		
		
	}

}
