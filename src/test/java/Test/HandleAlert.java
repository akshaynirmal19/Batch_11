package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		Thread.sleep(2000);
		
		System.out.println(alt.getText());
		alt.accept();
		
		
		

	}

}
