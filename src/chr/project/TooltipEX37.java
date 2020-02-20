package chr.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TooltipEX37 {

	public static void main(String[] args) {
		//to initialize browser
		System.setProperty("webdriver.gecko.driver", "D:\\\\Selenium\\\\LiveTech Selenium Software\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
        driver.get("https://rediffmail.com");
        driver.manage().window().maximize();
        //to read toooltip
        
        String eleTooltip=driver.findElement(By.linkText("Business Email")).getAttribute("title");
        System.out.println(eleTooltip);
	}

}
