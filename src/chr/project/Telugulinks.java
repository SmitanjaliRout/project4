package chr.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Telugulinks {

	public static void main(String[] args) throws InterruptedException {
		//to Initialize browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
				
		System.out.println("Before click on Telugu link");
		//to check Telugu link availability
		List<WebElement> links=driver.findElements(By.linkText("??????"));
		int n= links.size();
		if(n != 0) {
			System.out.println("Number of Telugu links are: "+n);
		}
		else {
			System.out.println("There are no telugu links");
		}
		
		//to click on Telugu link
		driver.findElement(By.linkText("??????")).click();
		Thread.sleep(5000);
		
		System.out.println("After click on Telugu link");
		n=driver.findElements(By.linkText("??????")).size();
		if(n != 0) {
			System.out.println("Number of Telugu links are: "+n);
		}
		else {
			System.out.println("There are no telugu links");
		}
}
}
