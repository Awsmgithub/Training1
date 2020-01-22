package SE_Class1.SE_Class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maryam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
      driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
      
      
      List <WebElement> links=driver.findElements(By.tagName("a"));
      System.out.println(links.size());
		
		
         
      Select dropdownmonth=new Select(driver.findElement(By.id("month")));
      Select dropdownday=new Select(driver.findElement(By.id("day")));
      Select dropdownyear=new Select(driver.findElement(By.id("year")));
      
      
      driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
      
      
            
      
      
      dropdownmonth.selectByVisibleText("Jul");    
      dropdownday.selectByVisibleText("27");
      dropdownyear.selectByVisibleText("1982");
      
      
      
      
      
      
		
		
	}

}
