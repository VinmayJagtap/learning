package ScenarioExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class npmcommonTest {
	
	
	
	@Test
	public void verifysearchfeature() {
		System.out.println("verify search feature execution");
		
		
		//launch google chrome
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		
		//Launching URL
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//Click
		
		WebElement CHeck_Rem = driver.findElement(By.id("RememberMe"));
		
		CHeck_Rem.click();
		
		//Clearing text from testbox
		
		driver.findElement(By.name("Email")).clear();
		
		//Enter Text
		
		driver.findElement(By.name("Email")).sendKeys("admin@test.com");
		
		driver.close();
		
	}

}
