package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Ecplise wrkspc\\Ass_2\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		driver.manage().window().maximize();
		// text boxes
		driver.findElement(By.name("fName")).sendKeys("Hari");
		driver.findElement(By.name("lName")).sendKeys("haran");
		driver.findElement(By.name("mobNo")).sendKeys("1234567890");
		driver.findElement(By.name("address1")).sendKeys("abcd");
		driver.findElement(By.name("address2")).sendKeys("efgh");
		driver.findElement(By.name("cityS")).sendKeys("Tamilnadhu");
		driver.findElement(By.name("zipCode")).sendKeys("000000");
		driver.findElement(By.name("proofId")).sendKeys("0000000");
		driver.findElement(By.name("emailId")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("repassword")).sendKeys("12345");
		driver.findElement(By.name("password")).sendKeys("12345");
		// drop downs
		Select country = new Select(driver.findElement(By.name("countryS")));
		country.selectByVisibleText("India");
		Select state = new Select(driver.findElement(By.name("stateS")));
		state.selectByVisibleText("Tamil Nadu");
		Select id = new Select(driver.findElement(By.name("proofS")));
		id.selectByVisibleText("Driving License");
		// continue button
		driver.findElement(By.id("regi_continue")).click();
	}
}
