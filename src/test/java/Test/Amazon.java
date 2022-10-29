package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Deal of the Day']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		
		Thread.sleep(2000);
		
		String rm = RandomString.make(5);
		String path = "C:\\Users\\Public\\Automation\\Batch_11\\ScreenShot";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path+"\\"+rm+".png");
		FileUtils.copyFileToDirectory(src, des);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		
		Thread.sleep(2000);
		
		String rms = RandomString.make(5);
		String paths = "C:\\Users\\Public\\Automation\\Batch_11\\ScreenShot";
		TakesScreenshot tss = (TakesScreenshot)driver;
		File srcs = tss.getScreenshotAs(OutputType.FILE);
		File dess = new File(paths+"\\"+rms+".png");
		FileUtils.copyFileToDirectory(srcs, dess);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
