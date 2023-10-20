package dataDriverTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class multipleData extends BaseTest{
	
	@Test (dataProvider = "regressionTestData")
	public void testingdataparameter(String email, String password) throws InterruptedException {
		
		System.out.println("user Credentials are email: "+email+" and password: "+password);
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#Email")).clear();

        driver.findElement(By.cssSelector("input#Email")).sendKeys(email);

        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("input#Password")).clear();;

        driver.findElement(By.cssSelector("input#Password")).sendKeys(password);

        Thread.sleep(3000);

        driver.findElement(By.tagName("button")).click();
        
        Assert.assertTrue(driver.getPageSource().contains("Login was unsuccessful"));
	}
	
	@DataProvider
	public Object[][] smoketestdata(){
		
		Object[][] data = { {"user1@gmail.com","password1"},{"user2@gmail.com","password2"},{"user3@gmail.com","password3"}};
		
		return data;
		
	}
	
	@DataProvider
	public Object[][] regressionTestData(){
		
		Object[][] data = { {"user1@gmail.com","password1"},{"user2@gmail.com","password2"},{"user3@gmail.com","password3"},{"user4@gmail.com","Password4"}};
		
		return data;
		
	}
	
	

}
