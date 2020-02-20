package chr.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilemailApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.filemail.com/");
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         //To enter email
         driver.findElement(By.xpath("//li[@class='tagit-new']//input[@placeholder='To (email)']")).sendKeys("seleniumuser15@gmail.com");
         //to click on adda file button
         driver.findElement(By.id("addBtn")).click();
         Thread.sleep(3000);
         //Step 2:
        	 //create script in "AutoIT Script Editor" to perform operations on Windows based components 
        	 // Script in AutoIT Editor
         
         
	}
	
}
