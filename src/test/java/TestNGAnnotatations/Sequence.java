package TestNGAnnotatations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequence {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("##########Before Suite##################");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("##########After Suite##################");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("##########Before class##################");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("##########After Class##################");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("##########Before method##################");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("##########After Method##################");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("##########Before Test##################");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("##########After Test##################");
	}
	@Test(priority=-1)
	public void login() {
		System.out.println("##########Login Test##################");
	}
	@Test
	public void logout() {
		System.out.println("##########logout Test##################");
	}
	@Test
	public void addItem() {
		System.out.println("##########Add Item Test##################");
	}

}
