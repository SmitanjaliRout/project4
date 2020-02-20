package chr.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Composemail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\LiveTech Selenium Software\\Drivers\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		System.out.println("Gmail opened successfully");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
		//to perform login operation
		driver.findElement(By.id("identifierId")).sendKeys("1997.smitanjali@gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		//to enter pwd
		driver.findElement(By.name("password")).sendKeys("9114113378");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		//Thread.sleep(8000);
		
		//to read page title
		String pgTitle=driver.getTitle();
		if(pgTitle.contains("https://www.google.com/search?client=firefox-b-d&q=gmail"))
				{
				System.out.println("Successful login operation");
		}
		else {
			System.out.println("Unsuccessful login operation");
		
		//compose mail
			driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
			Thread.sleep(2000);
			//enter"to"mail id
		}
	}
}
			
			
			
			
			
