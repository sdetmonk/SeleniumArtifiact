package testPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Multi-dimention Selector		
//		Actions a = new Actions(driver);
//		WebElement ele1 = driver.findElement(By.xpath("autocomplete"));	
//		
//		a.click(ele1).build().perform();
//		a.sendKeys("India").build().perform();
//		
//		driver.findElement(By.xpath("(//li[@class='ui-menu-item']/div)[2]")).click();
		
//Dropdown Example:
		WebElement drp = driver.findElement(By.xpath("dropdown-class-example"));
		
		Select s = new Select(drp);
		
		s.selectByIndex(1);
		
		
		

	}

}
