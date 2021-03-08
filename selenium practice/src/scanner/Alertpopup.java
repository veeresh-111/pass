package scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpopup {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./softwares1/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//div[.='Travel']"));
		ele.click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		Thread.sleep(3000);
		a.dismiss();
		//a.accept();

	}

}
