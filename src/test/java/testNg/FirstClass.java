package testNg;

import org.testng.annotations.Test;

public class FirstClass {
	
	@Test
	void setup() {
		
		System.out.println("1st Test case- opening");
	}
	@Test
	void login() {
		System.out.println("1st Test case-Login");
	}
	
	@Test
	void tearDown(){
		System.out.println("1st Test case-Closing");
	}

}
