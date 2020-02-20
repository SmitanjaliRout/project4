package chr.project;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.interactions.Action;


public class RightCLICK38 {

	public static void main(String[] args) {
	//to in
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new  ChromeDriver();
         driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
         driver.manage().window().maximize();
         //create object for Action class
         Actions act=new Actions(driver);
         //create reference object for webelement
        

}
}
