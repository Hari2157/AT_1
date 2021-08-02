package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Blaze_testNG {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// Depart and Destination
		driver.findElement(By.xpath("//select[@name='fromPort']/option [@value='San Diego']")).click();
		driver.findElement(By.xpath("//select[@name='toPort']/option [@value='New York']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(5000);
		// User_details
		driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[4]")).click();
		driver.findElement(By.id("inputName")).sendKeys("Hari");
		driver.findElement(By.id("address")).sendKeys("lasvegas");
		driver.findElement(By.id("city")).sendKeys("california");
		driver.findElement(By.id("state")).sendKeys("US");
		driver.findElement(By.id("zipCode")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"cardType\"]/option[2]")).click();
		driver.findElement(By.id("nameOnCard")).sendKeys("Haritha");
		Thread.sleep(5000);
		driver.findElement(By.id("rememberMe")).click();
		// Results
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		String k = driver.findElement(By.xpath("/html/body/div[2]/div")).getText();
		System.out.println(k);
	}
}
