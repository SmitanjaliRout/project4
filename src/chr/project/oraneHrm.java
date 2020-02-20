package chr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oraneHrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.className("nyoS7c UzCXuf EIlDfe")).click();
		//driver.findElement(By.name("userName")).sendKeys("mercury");
		//driver.findElement(By.name("password")).sendKeys("mercury");
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		
		

	}

}