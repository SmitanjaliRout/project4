package chr.project;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebookScreenshot44 {

	public static void main(String[] args) {
		//to initialize browser
				System.setProperty("webdriver.gecko.driver","D:\\Selenium//LiveTech Selenium Software\\Drivers\\geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
				driver.get("https://facebook.com");
				driver.manage().window().maximize();
				//to capture screenshot
				File fi=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Date dt=new Date();
				System.out.println(dt);
				//Date format df=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
				//System.out.println(df.format(dt));
				//to save into specified location
				//FileHandler.copy(fi,new File("E:\\film\\bollywood"+df.format(dt)+".png"));
				
				
				

	}

}
