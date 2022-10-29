package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
//	WebElement abc=	  driver.findElement(By.xpath("//select[@name='country']"));
//	
//	Select sc = new Select(abc);
//	sc.selectByIndex(4);
//	Thread.sleep(3000);
//	
//	sc.selectByValue("ANDORRA");
//	Thread.sleep(3000);
//	sc.selectByVisibleText("BHUTAN");
//	
//	System.out.println(sc.getFirstSelectedOption().getText());
		
		
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Akshay");	
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Nirmal");
		 driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8999610679");
		 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("nirmalakshay19@gmail.com");
		 driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Pune");
		 driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Mumbai");
		 driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharastra");
		 driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("411014");
		 
		 
		 WebElement abc=	  driver.findElement(By.xpath("//select[@name='country']"));
	        Select sc = new Select(abc);
			sc.selectByValue("INDIA");
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nirmalakshay19@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456789");
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			//Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[contains(text(),' sign-in ')]")).click();
			
			Thread.sleep(5000);
			
			
			 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("nirmalakshay19@gmail.com");
			 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
			 driver.findElement(By.xpath("//input[@name='submit']")).click();
			 
			WebElement aa=driver.findElement(By.xpath("//*[contains(text(),'Login Successfully')]"));
			Thread.sleep(5000);
			System.out.println(aa.getText());
			
			Test.getCapture(driver);
			
			
			
		 
		
	}

	

}
