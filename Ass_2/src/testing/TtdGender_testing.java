package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TtdGender_testing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "./browserdrivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='form-group col-md-2 col-sm-2 gender reg_gender sm-offset']/span[@class='Female rdb_cnt']")).click();
	}

	
}

