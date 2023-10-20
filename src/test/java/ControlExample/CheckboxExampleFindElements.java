package ControlExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxExampleFindElements extends BaseTest{

	
	@Test
	public void checkbox() {
		WebElement chk_bike = driver.findElement(By.xpath("//input[@value='Bike']"));
		
		System.out.println("***Before Selection*********"+chk_bike.isSelected());
		
		chk_bike.click();
		
		System.out.println("***Before Selection*********"+chk_bike.isSelected());

				
	}
}
