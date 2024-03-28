package testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class FlipkartXpaths {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

//		driver.findElement(By.xpath("//span[text()='Fashion']")).click(); //// div[@aria-label='Fashion']/div/div/span/span[position()=1]
//		driver.findElement(By.xpath("//a[text()='Women Ethnic']")).click(); //// div[@id='toast-ctn']/following::a[3]

		Actions a = new Actions(driver);
		
		RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Fashion']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Women Ethnic']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Women Dress Materials']"))).build().perform();
		
//		a.moveToElement(driver.findElement(By.xpath("//a[text()='Women Sarees']"))).build().perform();
//		
//		a.contextClick(driver.findElement(By.xpath("//a[text()='Women Sarees']"))).build().perform();
//		
//		a.contextClick(driver.findElement(By.xpath("//a[text()='Women Sarees']"))).build().perform();

//		driver.findElement(By.xpath("//a[text()='Women Sarees']")); // (//div[@id='toast-ctn']/following::div/div/object/a[3])[position()=2]
		String out = driver.findElement(By.xpath("//a[text()='Women Dress Materials']")).getText();
		System.out.println("Value is " + out);

	}

}
