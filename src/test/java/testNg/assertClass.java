package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class assertClass {

	WebDriver driver;
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/jahid_5psu063/Downloads/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
			
	}
	
	@Test
	void testLogo() throws InterruptedException {
		WebElement logo=driver.findElement(By.xpath("/html/body/nav/div/div[1]/a/img"));
		Assert.assertTrue(logo.isDisplayed(),"No logo found");
		
	}
	
	@Test
	void testTitle() throws InterruptedException {
		String title=driver.getTitle();
		Assert.assertEquals(title,"HR Management System | HR Management Software | OrangeHRM","Title Not Matched");
		
	}
	
	@Test
	void testText() throws InterruptedException {
		Thread.sleep(10000);
		String Countries = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/h3[2]")).getText();
		System.out.println("Countries-----------"+Countries);
		Assert.assertEquals(Countries,"A global HR solution aspiring to grow with initiative HR teams","Word Not Matched");
		
	}
	
	
	@AfterClass
	void tearDown() {
		
		driver.quit();
	}
}
