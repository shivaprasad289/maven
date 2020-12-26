package maven2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo
{
	@Test
	public void test_01()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.out.println("Start");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("actiTIME - Login"));
		
		WebElement un = driver.findElement(By.id("username"));
		Assert.assertTrue(un.isDisplayed());
		un.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		Assert.assertTrue(pwd.isDisplayed());
		pwd.sendKeys("manager");
		
		WebElement lgnbtn = driver.findElement(By.xpath("//div[text()='Login ']"));
		Assert.assertTrue(lgnbtn.isEnabled());
		lgnbtn.click();
	}
}
