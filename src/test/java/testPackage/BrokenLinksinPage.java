package testPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinksinPage {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links= driver.findElements(By.xpath("//*[contains(@href,'https')]"));
//		SoftAssert a = new SoftAssert();
		Thread.sleep(5000);
		
		System.out.println("No of links are: "+links.size());
		
		for(WebElement link:links) {
			
			String url= link.getAttribute("href");
			
			HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			
			if(responseCode>400) {
				System.out.println("The Link with text "+link.getText()+" is broken in the code "+conn.getResponseCode());
//				Assert.assertTrue(false);
			}
					
		}
		driver.close();
	}
	
	

}
