package chr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumUpperprgrm40 {

	public static void main(String[] args) {
		////to initialize browser
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		//create reference obj for searchbox
		WebElement SearchTxt=driver.findElement(By.name("srchword"));
		Actions act=new Actions(driver);
		act.moveToElement(SearchTxt).click().keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).build().perform();

}
}
