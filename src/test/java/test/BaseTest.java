package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import utility.constant;

public class BaseTest {
	public WebDriver driver;
	public LoginPage lp;
	 
	
	@BeforeTest
	public void LaunchApp() {
		ChromeOptions test = new ChromeOptions();
		
		test.addArguments("--headless");
		
		
		driver = new ChromeDriver(test);
		driver.manage().window().maximize();
		driver.get(constant.hrm_app);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		lp = new LoginPage(driver);
	}
	
	
	@AfterTest
	public void CloseApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	

}
