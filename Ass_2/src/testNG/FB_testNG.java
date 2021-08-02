package testNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class FB_testNG {

	WebDriver driver;
	String url = "https://en-gb.facebook.com/";
	String dp = "./browserdrivers/chromedriver.exe";
	String Dp = "./browserdrivers/msedgedriver.exe";

	@Test
	public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", dp);
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}

	@Parameters("browsename")
	@BeforeClass
	public void beforeClass(@Optional("Chrome") String browsername) {
		if (browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", dp);
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("Edge")) {

			System.setProperty("webdriver.chrome.driver", Dp);
			driver = new EdgeDriver();

		} else {
			System.out.println("hai");

		}

	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}
