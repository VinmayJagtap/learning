package test;



import org.testng.annotations.Test;




import utility.constant;



public class orangeHRM extends BaseTest{

    

    @Test

    public void verifyLoginfeature() throws Exception {





        

        

        lp.enterusername(constant.hrm_username);

        lp.enterpassword(constant.hrm_password);

        lp.clickLoginButton();
        
       System.out.println("title for page is : "+driver.getTitle());

        

        

        lp.verifyApplicationTitle(driver.getTitle(), "OrangeHRM");

        

        

        lp.clickUserDropdown();

        lp.clickLogout();

        

        lp.verifyApplicationTitle(driver.getTitle(), "OrangeHRM");
        

        

    }



}