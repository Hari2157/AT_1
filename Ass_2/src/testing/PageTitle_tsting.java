package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle_tsting {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://www.facebook.com/");
		driver.navigate().to("https://tirupatibalaji.ap.gov.in/#/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String url_1 = driver.getCurrentUrl();
		System.out.println("Login_page URL:"+url_1);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign Up")).click();
		System.out.println(driver.getTitle());
		String url_2 = driver.getCurrentUrl();
		System.out.println("Registeration_page URL:"+url_2);
		if (url_1.equals(url_2)) {
			
			System.out.println("Page redirection was not successfull");
      } else {
			System.out.println("Login_page redirected to Registeration_page successfully");

		}
	}

	
}
