package chr.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitlyWaitprgrm {

	public static void main(String[] args) throws InterruptedException {
		        //To initialize Browser
				System.setProperty("webdriver.gecko.driver","D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
				driver.get("https://www.apsrtconline.in/oprs-web/");
				driver.manage().window().maximize();
				//using Implicit wait
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				//to enter "NLR" in "From" dropdown
				driver.findElement(By.name("source")).sendKeys("NLR");
				
				//to pause execution
				//Thread.sleep(5000);
				
				//to select value "BRAHMADEVI-NLR"
				driver.findElement(By.linkText("BRAHMADEVI-NLR")).click();

				

	}

}
