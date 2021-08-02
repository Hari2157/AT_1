package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TTD_testNG {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.id("regdob")).click();
	  driver.findElement(By.xpath("/html/body/div[18]/div/div[2]/div/div/select[1]/option[12]")).click();
	  driver.findElement(By.xpath("/html/body/div[18]/div/div[2]/div/div/select[2]/option[23]")).click();
	  driver.findElement(By.xpath("/html/body/div[18]/div/div[2]/div/table/tbody/tr[4]/td[5]/a")).click();
	  Thread.sleep(10000);
	  //driver.quit();
	  
	  
  }
}
