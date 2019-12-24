package TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe");
		
		WebDriver text = new ChromeDriver();
		
		text.get("http://www.greenstechnologys.com");
		
		String tit = text.getTitle();
		System.out.println(tit);
		
		String tit1 = text.getCurrentUrl();
		System.out.println(tit1);
		
		WebElement print = text.findElement(By.xpath("//h2[contains(text(),'Overall Reviews')]"));
		
		String text1 = print.getText();
		System.out.println(text1);
		
	}
}
		
				
