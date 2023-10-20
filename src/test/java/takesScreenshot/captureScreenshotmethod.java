package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class captureScreenshotmethod {
	
	WebDriver driver;

	@Test
	public void verifyAmazonHomePage() throws Exception {
			
		
		//launch google chrome
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		
		captureScreenshot("amazontest");
		
	}
		public void captureScreenshot(String filename) throws Exception {
			
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File targetlocation = new File(".\\ScreenshotFolder\\"+filename+".png");

		FileUtils.copyFile(screenshot, targetlocation);
}
}