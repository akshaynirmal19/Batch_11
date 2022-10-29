package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver de = new ChromeDriver();
		de.get("https://www.facebook.com/");
		de.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) de;
//		js.executeScript("window.scrollBy(0,500)"," " );
//		
//		Thread.sleep(3000);
//		
//		js.executeScript("window.scrollBy(0, -500)"," " );
		
		
		WebElement element = de.findElement(By.xpath("//li[text()='English (UK)']"));
		js.executeScript("arguments[0].scrollIntoView()",element);

	}

}
