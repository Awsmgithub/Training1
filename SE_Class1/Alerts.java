package SE_Class1.SE_Class1;

import org.openqa.selenium.By;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maryam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverException driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		
		
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
