package pages;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	//Object identification
	By TextUser = By.name("username");
	By txt_pass = By.name("password");
    By btn_login = By.cssSelector("[type=submit]");
    By lnk_forgotPass = By.xpath("//p[text()='Forgot your password? ']");
    By img_logo = By.className("orangehrm-login-branding");
    By dropdown_user = By.className("oxd-userdropdown-name");
    By lnk_Logout = By.partialLinkText("Logo");
    
    
    
    //Methods
    
    public void enterusername(String username) {
    	
    	driver.findElement(TextUser).sendKeys(username);
    }
    
    public void enterpassword(String pwd) {
    	driver.findElement(txt_pass).sendKeys(pwd);
    }
    public void clickLoginButton() {

        driver.findElement(btn_login).click();
    }


    public void clickUserDropdown() throws Exception {

        driver.findElement(dropdown_user).click();;

        Thread.sleep(3000);

        

    }

    public void clickLogout() {

        driver.findElement(lnk_Logout).click();;

        

    }
    
 
    
    public void verifyApplicationTitle(String actualTitle, String expectedTitle) throws Exception {

        

        Thread.sleep(3000);

        Assert.assertEquals(actualTitle, expectedTitle);

        

    }

	
	
}
