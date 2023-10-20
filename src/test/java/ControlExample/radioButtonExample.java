package ControlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class radioButtonExample extends BaseTest {
	
	@Test
	public void radiobutton() {
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	}

}
