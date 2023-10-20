package ScenarioExample;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	
	
	@Test
	public void verifysearchfeature() {
		System.out.println("verify search feature execution");
		
		
		//launch google chrome
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}

}
