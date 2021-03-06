package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterExercise {

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })
	void setup(String browser, String app) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/jahid_5psu063/Downloads/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/jahid_5psu063/Downloads/Drivers/geckodriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		driver.get(app);

	}

	@Test
	void testLogo() throws InterruptedException {
		WebElement logo = driver.findElement(By.xpath("/html/body/nav/div/div[1]/a/img"));
		Assert.assertTrue(logo.isDisplayed(), "No logo found");

	}

	@Test
	void testTitle() throws InterruptedException {
		String title = driver.getTitle();
		Assert.assertEquals(title, "HR Management System | HR Management Software | OrangeHRM", "Title Not Matched");

	}

	@AfterClass
	void tearDown() {

		driver.quit();
	}
}
