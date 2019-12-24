package TrainingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchChOne {

	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe");
		
		WebDriver greens = new ChromeDriver();
		
		greens.get("http://www.greenstechnologys.com/");
		
		String tech = greens.getTitle();
		
		System.out.println(tech);
		
		String tech1 = greens.getCurrentUrl();
		
		System.out.println(tech1);
		
	}
	
}
