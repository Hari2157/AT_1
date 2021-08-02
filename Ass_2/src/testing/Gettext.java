package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".//browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(5000);
		driver.findElement(By.id("submit")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='firstNameError']/span[@class='formValidationMessage']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='lastNameError']/span[@class='formValidationMessage']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='emailAddressError']/span[@class='formValidationMessage']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='phoneNumberError']/span[@class='formValidationMessage']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='passwordError']/span[@class='formValidationMessage']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='ConfirmPasswordError']/span[@class='formValidationMessage']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='nationalityError']/span[@class='formValidationMessage']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='attendeeTypeError']/span[@class='formValidationMessage']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='questions_137Error']/span[@class='formValidationMessage']")).getText());
	}

}
