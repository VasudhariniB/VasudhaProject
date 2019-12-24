package TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysLvBank {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe");
				WebDriver bank = new ChromeDriver();
		
		bank.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		String heading = bank.getTitle();
		System.out.println(heading);
		
		String heading1 = bank.getCurrentUrl();
		System.out.println(heading1);
		
		WebElement user = bank.findElement(By.id("DUMMY1"));
		
		user.sendKeys("Vasudha");
		
		WebElement arrow = bank.findElement(By.id("user-id-goahead"));
		
		arrow.click();
		
		WebElement pwd = bank.findElement(By.name("AuthenticationFG.ACCESS_CODE"));

		pwd.sendKeys("123456");
		
	}
}
