package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSexecutor_testing {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();

		// Creating the JavascriptExecutor interface object by Type casting
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launching the Site.
		driver.get("https://forms-uat.toyotabeta.co.uk/brochure");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.id("tgbgdpr-overlay-agree"));
		js.executeScript("arguments[0].click();", button);
		Thread.sleep(3000);
		WebElement cBox = driver.findElement(By.id("brochure_rav4-phev"));
		WebElement text = driver.findElement(By.xpath("//*[@id=\"car_models\"]/div/ul/li[11]/label"));
		System.out.println(text.getText());
		String k= text.getText();
		js.executeScript("arguments[0].click();", cBox);
		WebElement surname = driver.findElement(By.xpath("//input[@name='surname']"));
		surname.sendKeys(k);
		//driver.quit();

	}

}
