package sel4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetSalary {
		@Test
		public void testDemo()
		{
			String currentDir = System.getProperty("user.dir");
		 	System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe"); 	
			WebDriver driver=new ChromeDriver(); 
	 	   	driver.get("https://www.ultimateqa.com/simple-html-elements-for-automation/");
		    driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
			
			String TableName = "HTML Table with no id";
			String jobTittleInTable = "Quality Assurance Engineer";
			
			String Dynamic_XPath = "//h2[text()='"+TableName+"']/parent::div/child::table/child::tbody/child::tr/child::td[text()='"+jobTittleInTable+"']/following-sibling::td[2]";
			WebElement webelement = driver.findElement(By.xpath(Dynamic_XPath));
			System.out.println(webelement.getText());
			
			driver.close();
		}
}
