package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpathpractice {
	static ChromeDriver driver;

	@Before
	public void launchdrive() {
		System.setProperty("webdriver.chrome.driver", "../Assignment/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
	}

	public void dropdownHandle(WebElement element, String VisibleTextValue) {
		Select s = new Select(element);
		s.selectByVisibleText(VisibleTextValue);
	}

	@Test
	public void testmethod() throws InterruptedException {
		Xpathpractice xp = new Xpathpractice();
		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signup.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Test First");
		WebElement lastname = driver.findElement(By.xpath("//input[@*='lastname']"));
		lastname.sendKeys("Test Last");
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__' or @id='u_k_g_ng']"));
		email.sendKeys("8888888888");
		WebElement password = driver
				.findElement(By.xpath("//input[@name='reg_passwd__' and @id='password_step_input']"));
		password.sendKeys("Maa@1234");
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		xp.dropdownHandle(day, "20");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		xp.dropdownHandle(month, "Jan");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		xp.dropdownHandle(year, "1996");
		WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();
		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
	}

	@After
	public void closemethod() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

}
