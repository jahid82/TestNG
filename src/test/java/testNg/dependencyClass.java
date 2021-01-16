package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class dependencyClass {

	
	//@Test(alwaysRun=true), if you want to execute any test always
	
	@Test(priority = 1)
	void setup() {

		System.out.println("Dependency- Test case-opening");
	}

	@Test(priority = 3, enabled = true)
	void register() {
		System.out.println("Dependency- Test case-register-10");
	}

	@Test(priority = 4)
	void task1() {
		System.out.println("Dependency- Test case-Task-1");
	}

	@Test(priority = 3)
	void task2() {
		System.out.println("Dependency- Test case-Task-3");
	}

	@Test(priority = 5)
	void tearDown() {
		System.out.println("Dependency- Test case-Closing");
	}

	@Test(dependsOnMethods = { "setup" })
	void login() {
		System.out.println("Dependency- Test case-Login");
	}

}
