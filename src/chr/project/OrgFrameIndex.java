package chr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrgFrameIndex {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
	driver.manage().window().maximize();
	//switch to frame
	driver.switchTo().frame("classFrame");
	//to click on link
	driver.findElement(By.linkText("org.openqa.selenium")).click();

	}

}
