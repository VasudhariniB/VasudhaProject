package TrainingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserLaunchIeOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\IEDriverServer.exe");
		
		WebDriver ie = new InternetExplorerDriver();
		
		ie.get("http://www.greenstechnologys.com/");
		
		String greens = ie.getTitle();
		System.out.println(greens);
		
		String greens1 = ie.getCurrentUrl();
		System.out.println(greens1);
		
	}
	
}