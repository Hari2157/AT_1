package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_testing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("promtButton")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Hariharan");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());

	}

}
