package ControlExample;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	@Before
	public void LaunchApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
	}
	
	
	@After
	public void CloseApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	

}
