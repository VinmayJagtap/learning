package ControlExample;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxExample extends BaseTest{

	
	@Test
	public void checkbox() throws InterruptedException {
		List<WebElement> chk_vehicle = driver.findElements(By.xpath("//input[@name='vehicle']"));
		
		System.out.println("Number of checboxes on page is "+chk_vehicle.size());
		
		for(int i=0;i<chk_vehicle.size();i++) {
			
			chk_vehicle.get(i).click();
			
			String chk_value = chk_vehicle.get(i).getAttribute("value");
			
			if(chk_value.equalsIgnoreCase("car")) {
				Thread.sleep(5000);
				chk_vehicle.get(i).click();
			}
			
		}
		
	}
}
