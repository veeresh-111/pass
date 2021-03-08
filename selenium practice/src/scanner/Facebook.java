package scanner;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./softwares1/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		/*WebElement ele=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();//right click
		Thread.sleep(3000);*/
		Robot r=new Robot();
		/*r.keyPress(KeyEvent.VK_T);
		//r.keyRelease(KeyEvent.VK_T);
		//r.keyPress(KeyEvent.VK_W);
		//r.keyRelease(KeyEvent.VK_W);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);*/
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_C);
				r.keyRelease(KeyEvent.VK_ALT);
				r.keyRelease(KeyEvent.VK_SPACE);
				r.keyRelease(KeyEvent.VK_C);

	}

}
