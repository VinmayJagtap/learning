package CrossBrowserTest;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing extends BaseTest{
	
	
	@Test
	public void testingweb() {
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Admin");;
		
	}

}
