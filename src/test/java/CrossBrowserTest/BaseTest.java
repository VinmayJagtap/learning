package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeTest
	public void LaunchApp(String browserdetails) {
		
		String browser = browserdetails;
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if (browser.equals("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		//driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
	}
	
	@AfterTest
	public void CloseApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	

}
