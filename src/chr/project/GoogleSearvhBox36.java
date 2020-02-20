package chr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearvhBox36 {

	public static void main(String[] args) throws InterruptedException {
		//to initialize browser
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\LiveTech Selenium Software\\Drivers\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//create reference obj for search box
		WebElement mySearch=driver.findElement(By.name("q"));
		//to enter selenium
		mySearch.sendKeys("Selenium");
		Thread.sleep(3000);
		mySearch.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		mySearch.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		mySearch.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		mySearch.sendKeys(Keys.ENTER);
		
		
	

	}

}
