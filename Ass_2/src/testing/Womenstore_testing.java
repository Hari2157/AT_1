package testing;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Womenstore_testing {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		WebElement item = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
		Actions act = new Actions(driver);
		act.moveToElement(item).build().perform();
		Thread.sleep(10000);

		WebElement cart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
		js.executeScript("arguments[0].click();", cart);

		Thread.sleep(10000);
		WebElement text = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));
		System.out.println(text.getText());
		Thread.sleep(8000);
		driver.quit();

	}
}
