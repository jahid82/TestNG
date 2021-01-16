package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SecondClass {
	@BeforeSuite
	void BeforeSuite() {
		
		System.out.println("2nd Test case-Before Suite");
	}
	@BeforeClass
	void BeforeClass() {
		
		System.out.println("2nd Test case-Before Class");
	}

	@org.testng.annotations.AfterClass
	void AfterClass() {
		
		System.out.println("2nd Test case-Afetr Class");
	}
	
	@BeforeMethod
	void BeforeTest() {
		
		System.out.println("2nd Test case-Before Method");
	}
	@Test(priority=1)
	void setup() {
		
		System.out.println("2nd Test case-opening");
	}
	
	@Test(priority=2)
	void login() {
		System.out.println("2nd Test case-Login");
	}
	
	@Test(priority=3,enabled=true)
	void register() {
		System.out.println("2nd Test case-register-10");
	}
	
	
	@Test(priority=4)
	void task1() {
		System.out.println("2nd Test case-Task-1");
	}
	
	@Test(priority=3)
	void task2() {
		System.out.println("2nd Test case-Task-3");
	}
	
	@Test(priority=5)
	void tearDown(){
		System.out.println("2nd Test case-Closing");
	}

	@AfterMethod
	void AfterTest() {
		
		System.out.println("2nd Test case-Afetr Method");
	}
	
}
