package chr.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	

	}

}
