package testing;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Booking_testing {

	public static void main1(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "./browserdrivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for (WebElement webElement : link) {
			System.out.println(webElement.getText());
			
		}
		
	}

	public static void main(String[] args) {
		
	}

}
