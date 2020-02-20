package chr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickRediffprgrm39 {

	public static void main(String[] args) {
	//to initialize browser
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.linkText(""));
		 WebElement btnObj=driver.findElement(By.name("Business Email"));
         Actions act=new Actions(driver);
         act.moveToElement(ele).contextClick().build().perform();
         

	}

}
