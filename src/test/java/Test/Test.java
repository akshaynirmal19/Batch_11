package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
//		String rm = RandomString.make(5);
//		
//		String path= "C:\\Users\\Public\\Automation\\Batch_11\\ScreenShot";
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File(path+"\\"+rm+".png");
//		
//		FileUtils.copyFile(src, des);

	}
	
	public static void getCapture(WebDriver driver) throws IOException {
            String rm = RandomString.make(5);
		String path= "C:\\Users\\Public\\Automation\\Batch_11\\ScreenShot";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path+"\\"+rm+".png");
		
		FileUtils.copyFile(src, des);
	}

}
