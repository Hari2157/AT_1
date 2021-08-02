package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class College_weeklive {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Ecplise wrkspc\\Ass_2\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
	    Thread.sleep(20000);
	    driver.findElement(By.id("firstName")).sendKeys("Hari");
	    driver.findElement(By.id("lastName")).sendKeys("haran");
	    driver.findElement(By.id("emailAddress")).sendKeys("xyz@gmail.com");
	    driver.findElement(By.id("phoneNumber")).sendKeys("1234567890");
	    driver.findElement(By.id("password")).sendKeys("12345");
	    driver.findElement(By.id("ConfirmPassword")).sendKeys("12345");
	    Select country = new Select(driver.findElement(By.id("country")));
	    country.selectByVisibleText("UNITED STATES");
	    Select attendeeType = new Select(driver.findElement(By.name("attendeeType")));
	    attendeeType.selectByVisibleText("Current Undergraduate Student Looking to Transfer");
	    driver.findElement(By.id("submit")).click();
	    
	}

}
