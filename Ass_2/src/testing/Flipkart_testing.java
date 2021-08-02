package testing;



import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Flipkart_testing {

	public static void main(String[] args) throws Exception {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","./browserdrivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	Actions k = new Actions(driver);
	WebElement Grocery = driver.findElement(By.xpath("//*[text()=\"Grocery\"]"));
	k.moveToElement(Grocery).click().build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_166SQN']")).sendKeys("500090",Keys.ENTER);
	Thread.sleep(2000);
	WebElement food = driver.findElement(By.xpath("//a[contains(text(),'Biscuits')]"));
	k.moveToElement(food).click().build().perform();
	Thread.sleep(5000);
	WebElement item = driver.findElement(By.xpath("//button[@class='_2KpZ6l GX4Kov']/span[contains(text(),'Add Item')]"));
	k.moveToElement(item).click().build().perform();
	WebElement cart = driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
	k.moveToElement(cart).click().build().perform();
	Thread.sleep(5000);
	
	Date l = new Date();
	
	DateFormat df = new SimpleDateFormat("HH_mm_ss");
	String n = df.format(l);
	
	File g = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(g, new File("./Screen_shot/flipkart"+n+".PNG"));
	
	
	
	

	

	
	
	
	
	

	}

}
