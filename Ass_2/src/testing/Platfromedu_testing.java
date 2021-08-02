package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Platfromedu_testing {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.platformqedu.com/");
		driver.manage().window().maximize();
		Actions k = new Actions(driver);
		WebElement mto = driver.findElement(By.id("menu-item-6027"));
        k.moveToElement(mto).build().perform();
		Thread.sleep(5000);
		WebElement com = driver.findElement(By.xpath("//a[@title='Compare']"));
		k.moveToElement(com).click().build().perform();

	}

}
