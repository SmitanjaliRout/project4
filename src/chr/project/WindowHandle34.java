package chr.project;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle34 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		//to read page title
		String pgTitle01=driver.getTitle();
		System.out.println(pgTitle01);
		//to click on help
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		//to read window handles
		Set<String> pgHandles=driver.getWindowHandles();
       Iterator<String> winHandles= pgHandles.iterator();
       String w1=winHandles.next();
        String w2=winHandles.next();
        System.out.println(w1);
        System.out.println(w2);
        driver.switchTo().window(w2);
        //to read page2 title
        String pgTitle02=driver.getTitle();
        System.out.println(pgTitle02);
      
		
		
		
		
		

	}

}
