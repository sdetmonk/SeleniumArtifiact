package testPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Test1 {

	public static void main(String[] args) throws InterruptedException, IOException {
//		No need to use WebDriverManager from 4.6.0 version Selenium Manager will help 
//		you directly download and match the browser driver version, upgrade your selenium to 4.11.0		
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		// How to run in Headless mode		    
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless=new");
//		WebDriver driver2 = new ChromeDriver(options);
//		driver2.get("https://selenium.dev");
		
				
//		This was depreciated, can use this Duration.ofSeconds(secs);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
		driver.manage().window().maximize();
	
		WebElement e = driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
		
		driver.switchTo().frame(e);
		
		driver.findElement(By.xpath("//input[@id='query']")).sendKeys("MRF",Keys.ENTER);
		
//		Thread.sleep(10000);
		ArrayList<String> ar= new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(ar.get(1));
//		driver.switchTo().activeElement();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='srchword']")).click();
		
		WebElement pageScreen = driver.findElement(By.xpath("//input[@id='query']"));
		
		File src = pageScreen.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\P7166915\\OneDrive - Ness Digital Engineering\\Desktop\\TestFile.png");
		FileUtils.copyFile(src, Dest);
		
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		wt.until(ExpectedConditions.visibilityOfElementLocated(null));
		    
		    
		    
		    
	}

}
