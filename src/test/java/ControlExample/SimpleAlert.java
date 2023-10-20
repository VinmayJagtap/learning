package ControlExample;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import junit.framework.Assert;

public class SimpleAlert extends BaseTest{
	
	@Test
	public void simpleAlert() throws InterruptedException {
		
	driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();	
	
	Thread.sleep(3000);
	
	Alert alert = driver.switchTo().alert();
	
	Assert.assertEquals("Hi.. This is alert message!", alert.getText());
	
	Assert.assertTrue(alert.getText().contains("Hi.. This is alert message!"));
	
	Assert.assertFalse(alert.getText().contains("google"));
	
	alert.accept();
	
	
		
	}

}
