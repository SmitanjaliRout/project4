package chr.project;

import java.awt.Frame;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofFrames {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
	driver.manage().window().maximize();
	//to fine numer  of frmes
	 List<WebElement>pgFrames=driver.findElements(By.tagName("frame"));
     System.out.println("Number of frames are:"+pgFrames.size());
     //to read each frame name
     for(WebElement frame:pgFrames)
     System.out.println(frame.getAttribute("name"));
     
	}

}
