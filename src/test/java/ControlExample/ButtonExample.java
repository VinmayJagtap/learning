package ControlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class ButtonExample extends BaseTest {
	
	@Test
	public void radiobutton() {
		driver.findElement(By.xpath("//input[@value='male']")).click();
	}

}
