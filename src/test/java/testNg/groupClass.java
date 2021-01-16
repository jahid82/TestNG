package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class groupClass {

	
	//@Test(alwaysRun=true), if you want to execute any test always
	
	@Test(groups = {"sanity"})
	void setup() {

		System.out.println("Grouping-- Test case-1");
	}

	@Test(groups = {"sanity"})
	void task1() {
		System.out.println("Grouping-- Test case-Task-2");
	}

	@Test(groups = {"sanity","regression"})
	void task2() {
		System.out.println("Grouping-- Test case-Task-3");
	}

	@Test(groups = {"sanity"})
	void tearDown() {
		System.out.println("Grouping-- Test case-4");
	}

	@Test(groups = {"regression"})
	void login() {
		System.out.println("Grouping-- Test case-4");
	}

}
