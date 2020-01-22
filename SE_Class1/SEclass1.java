package SE_Class1.SE_Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
System.setProperty("webdriver.chrome.driver","C:\\Users\\Maryam\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com");



	}

}
