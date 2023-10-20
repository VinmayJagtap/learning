package ControlsInTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Alert extends BaseTest {
	
	@Test
	public void testalert() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Show Me Prompt']")).click();
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
		String name = "Vinmay";
		alert.sendKeys(name);
		
		Thread.sleep(3000);
		
		
		
		
	}
	

}
