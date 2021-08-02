package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99_testing {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions k= new Actions(driver);
		WebElement from = driver.findElement(By.id("credit2"));
		WebElement to = driver.findElement(By.id("bank"));
		k.dragAndDrop(from, to).build().perform();
		WebElement from1 = driver.findElement(By.id("fourth"));
		WebElement to1 = driver.findElement(By.id("amt7"));
		k.dragAndDrop(from1, to1).build().perform();
		WebElement from2 = driver.findElement(By.id("fourth"));
		WebElement to2 = driver.findElement(By.id("amt8"));
		k.dragAndDrop(from2, to2).build().perform();
		WebElement from3 = driver.findElement(By.id("credit1"));
		WebElement to3 = driver.findElement(By.id("loan"));
		k.dragAndDrop(from3, to3).build().perform();
		System.out.println(driver.findElement(By.id("equal")).getText());
		
		
	}

}
