package chr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FflipkartJacket41 {

	public static void main(String[] args) throws InterruptedException {
	//to initialize browser
			System.setProperty("webdriver.gecko.driver","D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			//Thread.sleep(3000);
			//to close html popup
			driver.findElement(By.xpath("//button[@class='_2AkmmA __29YdH8']")).click();
			Actions act=new Actions(driver);
			WebElement menMenu=driver.findElement(By.xpath("//span[text()='men']"));
			
			act.moveToElement(menMenu).build().perform();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Jacket")).click();
	}
			
}