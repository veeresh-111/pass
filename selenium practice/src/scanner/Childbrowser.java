package scanner;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Childbrowser 
{

	public static void main(String[] args) throws Exception 
	{
	
			System.setProperty("webdriver.gecko.driver","./softwares1/geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://www.naukri.com/");
			Thread.sleep(3000);
			String parent_id=driver.getWindowHandle();
			System.out.println(parent_id);
			Thread.sleep(3000);
			Set<String> allids=driver.getWindowHandles();
			int count=allids.size();
			System.out.println(count);
			//allids.remove(parent_id);
			//int count1=allids.size();
			//System.out.println(count1);
			for(String id:allids)
			{
				driver.switchTo().window(id);
				String title=driver.getTitle();
				System.out.println(title);
				Thread.sleep(3000);
				if(title.equals("LNT"));
				{
				driver.close();
				}
				
			}

	}

}
