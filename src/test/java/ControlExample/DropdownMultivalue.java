package ControlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownMultivalue extends BaseTest {
	
	public void dropdownmulti() {
		WebElement countryList = driver.findElement(By.xpath(""));
		
		Select dropdownContry = new Select(countryList);
		
		dropdownContry.selectByIndex(2);
		
		dropdownContry.selectByValue("Japan");
		
		dropdownContry.selectByVisibleText("Mexico");
				
	}
	
	

}
