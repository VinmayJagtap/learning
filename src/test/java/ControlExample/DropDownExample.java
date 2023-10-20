package ControlExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample extends BaseTest {
	
	@Test
	public void dropdownexample() throws InterruptedException {
		WebElement Carlist = driver.findElement(By.xpath("//select[@id='Carlist']"));
		
		Select dropdown = new Select(Carlist);
		
		dropdown.selectByValue("BMW Car");
		Thread.sleep(3000);
		
		dropdown.selectByIndex(4);
		Thread.sleep(3000);
		
		dropdown.selectByVisibleText("Opel");
				
	}

}
