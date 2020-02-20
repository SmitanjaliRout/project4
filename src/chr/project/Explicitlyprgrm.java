package chr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlyprgrm {

	public static void main(String[] args) {
		//To initialize Browser
				System.setProperty("webdriver.gecko.driver","D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
				driver.get("https://www.apsrtconline.in/oprs-web/");
				driver.manage().window().maximize();
				//using Implicit wait
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//to enter "NLR" in "From" dropdown
				driver.findElement(By.name("source")).sendKeys("NLR");
				
				//to pause execution
				//Thread.sleep(5000);
				//using ExplicitWait
				Wait<WebDriver> wt= new WebDriverWait(driver, 30);
				wt.until(ExpectedConditions.presenceOfElementLocated(By.linkText("BRAHMADEVI-NLR")));
				
				//to select value "BRAHMADEVI-NLR"
				driver.findElement(By.linkText("BRAHMADEVI-NLR")).click();
						

	}

}
