package testing;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_testing {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.Booking.com/");
		
		Date l = new Date();
		//System.out.println(l);
		
		DateFormat df = new SimpleDateFormat("HH_mm_ss");
		String n=df.format(l);
		//System.out.println(n);
		
		File k = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(k,new File("./Screen_shot/Booking"+n+".PNG"));

	}

}
