package TrainingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchChTwo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe");
		
		WebDriver launch = new ChromeDriver();
		
		launch.get("http://gmail.com/");
		
		String title = launch.getTitle();
		System.out.println(title);
		
		String current = launch.getCurrentUrl();
		System.out.println(current);
		
		//launch.quit();

	}

}
