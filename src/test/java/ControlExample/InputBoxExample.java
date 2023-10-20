package ControlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class InputBoxExample extends BaseTest {
	
	@Test
	public void inputbox() {
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Admin");;
	}

}
