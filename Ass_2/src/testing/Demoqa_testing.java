package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_testing {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(8000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		String k = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(k);
		
	}

}
