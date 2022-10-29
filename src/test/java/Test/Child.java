package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver de = new ChromeDriver();
		de.get("https://demo.guru99.com/popup.php");
		de.manage().window().maximize();
		
		String parentwindoadd = de.getWindowHandle();
//		System.out.println(parentwindoadd);
		
		de.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> alladd = de.getWindowHandles();
//		System.out.println(alladd);
		
		Iterator<String> it = alladd.iterator();
		
		while(it.hasNext()){
			
			String childadd = it.next();
			if(!parentwindoadd.equals(childadd)) {
				de.switchTo().window(childadd);
				de.findElement(By.xpath("//input[@name='emailid']")).sendKeys("123456");
				de.close();
			}
			
		}
		
		de.switchTo().window(parentwindoadd);
		
		

	}

}
