package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.NullPointerException;


public class Dropdown {
	static ChromeDriver driver;
	@Before
	public void launchdrive() {
		System.setProperty("webdriver.chrome.driver", "../Assignment/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
	}
	@Ignore
	public void dropdownHandle(WebElement element, String VisibleTextValue) {
		Select s= new Select(element);
		s.selectByVisibleText(VisibleTextValue);
	}

	
	@Test
	public void signup() throws InterruptedException, NullPointerException {
		Dropdown d = new Dropdown();
		WebElement signup= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		signup.click();
		Thread.sleep(2000);
		WebElement firstname= driver.findElement(By.name("firstname"));
		firstname.sendKeys("Test Firstname");
		WebElement lastname= driver.findElement(By.name("lastname"));
		lastname.sendKeys("Test Lastname");
		WebElement user = driver.findElement(By.name("reg_email__"));
		user.sendKeys("manishachauhan56784@gmail.com");
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("Maa@1234");
		WebElement day = driver.findElement(By.id("day"));
		d.dropdownHandle(day,"20");
		WebElement month = driver.findElement(By.id("month"));
		d.dropdownHandle(month,"Jan");
		WebElement year = driver.findElement(By.id("year"));
		d.dropdownHandle(year,"1996");
		WebElement gender = driver.findElement(By.cssSelector("input[value='1']"));
		gender.click();
		WebElement submit = driver.findElement(By.cssSelector("button[name='websubmit']"));
		submit.click();
	}
	@After
	public void closemethod() throws InterruptedException,NullPointerException {
		Thread.sleep(10000);
		driver.close();
			}
}
