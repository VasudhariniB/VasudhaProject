package TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPara1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe");
		
        WebDriver para = new ChromeDriver();
        
        para.get("http://www.greenstechnologys.com/oracle-training.html");
        
        String text1 = para.getTitle();
        System.out.println(text1);
        
        String text2 = para.getCurrentUrl();
        System.out.println(text2);
        
        WebElement para1 = para.findElement(By.xpath("//p[contains(text ()='Awarded as the ')])"));
        
       String text3 = para1.getText();
       System.out.println(text3);
        
        
	}

}
