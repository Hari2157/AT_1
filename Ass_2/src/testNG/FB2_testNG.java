package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class FB2_testNG {
	WebDriver driver;
	String url = "https://en-gb.facebook.com/";
	String dp = "./browserdrivers/chromedriver.exe";

	@Test(dataProvider = "dp")
	public void f(String A, String B) throws Exception {
		System.setProperty("webdriver.chrome.driver", dp);
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(A);
		driver.findElement(By.id("pass")).sendKeys(B);
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", dp);
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { "a@gmail.com", "a" },
			new Object[] { "b@gmail.com", "b" }, 
			};
	}
}
