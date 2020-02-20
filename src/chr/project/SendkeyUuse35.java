package chr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SendkeyUuse35 {

	public static void main(String[] args) throws InterruptedException {
	//To initialize browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		//create reference object for "From "drpdown
		WebElement fromList=driver.findElement(By.name("source"));
		//to enter "NLR" in "from" dropdown
		fromList.sendKeys("NLR");
		//to pause execution
		Thread.sleep(3000);
		fromList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		fromList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		fromList.sendKeys(Keys.ENTER);
		
		
		
		

	}

}
