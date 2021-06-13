package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multipletabonclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Assignment/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Actions ac= new Actions(driver);
		WebElement video = driver.findElement(By.id("video-title"));
		ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		String currentwindow= driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for(String s:all) {
			driver.switchTo().window(s);
		}
		
}
}
