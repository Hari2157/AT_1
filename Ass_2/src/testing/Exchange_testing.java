package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exchange_testing {

	public static void main(String[] args) {
		WebDriver  driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.xe.com/");
		driver.manage().window().maximize();
		String k=driver.findElement(By.xpath("//span/input[@class='amount-input__NumberInput-sc-1gq6pic-1 eIuRdk']")).getAttribute("value");
		System.out.println(k);
		String n=driver.findElement(By.xpath("//div[@class='polymorphic-carousel__Alignment-sc-11nc66i-0 emHSRu']/h2[@class='heading__Heading1-n07sti-0 heading__Heading2-n07sti-1 iXbZUl']")).getText();
		System.out.println(n);
		System.out.println(driver.findElement(By.xpath("(//p[@class='paragraph__Paragraph-sc-1y1xjre-0 fqOqID'])[2]")).getText());
		
	}

	

}
