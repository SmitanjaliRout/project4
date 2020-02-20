package chr.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeProject {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
String pgTitle = driver.getTitle();
System.out.println("page title is :"+pgTitle);
String pgUrl = driver.getCurrentUrl();
System.out.println("page Url is :"+pgUrl);
driver.navigate().to("https://mail.google.com/");
driver.navigate().back();
driver.navigate().refresh();
driver.navigate().forward();
}

}