package TrainingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchChThree {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe");
	
		WebDriver flip = new ChromeDriver();
		
		flip.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		String flip1 = flip.getTitle();
		System.out.println(flip1);
		
		String flip2 = flip.getCurrentUrl();
		System.out.println(flip2);
		
	}
	
}