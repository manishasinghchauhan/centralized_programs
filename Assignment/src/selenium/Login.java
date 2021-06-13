package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../Assignment/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("manishachauhan5678@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input#pass"));
		password.sendKeys("Maa@1234");
	
		driver.findElement(By.name("login")).click();
		
	}
}
