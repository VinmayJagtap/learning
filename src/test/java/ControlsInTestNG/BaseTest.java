package ControlsInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	@BeforeTest
	public void LaunchApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
	}
	
	@AfterTest
	public void CloseApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	

}
