package chr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetbankingHDFC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com");
		driver.manage().window().maximize();
		//to  switch to frame
		driver.switchTo().frame("login_page");
		//to click on continue
		driver.findElement(By.xpath("//img[@alt=\"continue\"]")).click();
		Thread.sleep(2000);
		//to readmsg from pop up
		String eMSG =driver.switchTo().alert().getText();
		//to close pop up
		driver.switchTo().alert().accept();
		//to enter value in editbox
		driver.findElement(By.name("fldLoginUserId")).sendKeys("123456");
		
	}

}
