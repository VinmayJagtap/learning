package locators;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	

	WebDriver driver;
	
	@Before
	public void launchApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@After
	public void closeApp() {
		
		driver.quit();
	}
	
	
	@Test
	public void testOrange() throws InterruptedException {
		//by name
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//by class
		
		driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("admin123");
		
		//by Tag name
		
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		//By Class
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		Thread.sleep(3000);
		//LinkText
		driver.findElement(By.linkText("Logout")).click();
		
		//Partial Link Text
		//driver.findElement(By.partialLinkText("out")).click();
		
	}
	
	
	
}
