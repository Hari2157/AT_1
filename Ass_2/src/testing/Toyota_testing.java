package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toyota_testing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://forms-uat.toyotabeta.co.uk/brochure");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement cookie = driver.findElement(By.id("tgbgdpr-overlay-agree"));
		js.executeScript("arguments[0].click();", cookie);
		Thread.sleep(3000);
		WebElement cBox = driver.findElement(By.id("brochure_rav4-phev"));
		js.executeScript("arguments[0].click();", cBox);
		Thread.sleep(3000);

		WebElement console = driver.findElement(By.xpath("//*[@id=\"car_models\"]/div/ul/li[11]/label"));
		String c = console.getText();
		System.out.println(c);

		WebElement dropDown = driver.findElement(By.xpath("//a[@class='dropdown-toggle  ']"));
		js.executeScript("arguments[0].click();", dropDown);
		Thread.sleep(5000);
		WebElement d1 = driver
				.findElement(By.xpath("//*[@id=\"order_brochure\"]/div/form/div[7]/div[1]/div[3]/div/div/ul/li[7]/a"));
		d1.click();
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Test");

		WebElement surname = driver.findElement(By.xpath("//input[@name='surname']"));
		surname.sendKeys("Reverend_Test_" + c);

	}
}
