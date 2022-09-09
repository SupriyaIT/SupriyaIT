package automationJuly;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverMethodTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\utility\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Point p = new Point(400, 400);
		driver.manage().window().setPosition(p);
		
		
		Dimension d = new Dimension(800, 400);
		driver.manage().window().setSize(d);
//		Options opt = driver.manage();
//		Window w =	opt.window();
//		w.maximize();
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.amazon.in/");
 
	//	driver.manage().window().fullscreen();
		
				
	//	Thread.sleep(2000);	
	//	driver.manage().window().minimize();
		
		
	}

}
