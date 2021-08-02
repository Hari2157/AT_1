package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_testing {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "D:\\Ecplise wrkspc\\Ass_2\\browserdrivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");

	}

}
