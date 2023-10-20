package ControlsInTestNG;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class workflow {

    //pre-condition

    //Test

    //post-condition

    //workflow
   
    @BeforeTest

    public void launchApp() {

        System.out.println("launching an application");

    }

    @AfterTest

    public void closeApp() {
        System.out.println("================closeApp =============");

    }

    @Test

    public void login() {

        

        System.out.println("login test case");

    }

    

    

    @Test

    public void logout() {

        

        System.out.println("logout test case");

    }

    



    @Test

    public void addItem() {

        

        System.out.println("addItem test case");

    }

    

    @Test

    public void payment() {

        

        System.out.println("payment test case");

    }



}

