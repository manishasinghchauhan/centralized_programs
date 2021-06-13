package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class makemytripassign {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Assignment/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Actions ac= new Actions(driver);
		ac.sendKeys(Keys.ESCAPE);
		driver.findElement(By.id("fromCity")).click();
		WebElement from= driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("BLR");
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("toCity")).click();
		WebElement To= driver.findElement(By.xpath("//input[@placeholder='To']"));
		To.sendKeys("PNQ");
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
}
}
