package day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontest {
	
	WebDriver driver;
	@Before
	public void set() {
	driver=new ChromeDriver();
	driver.get("https://amazon.com/");	
	}
	@Test
	public void testcase() {
		driver.findElement(By.xpath("//*[@id='nav-xshop']/ul/li[5]/div/a")).click();
		WebElement search=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		search.sendKeys("electronics");
		search.submit();
		driver.findElement(By.xpath("//*[@id='nav-link-accountList\']/a/span")).click();
		driver.findElement(By.xpath("//*[@id='ap_email_login']")).sendKeys("asfg@gmail.com");
		driver.findElement(By.xpath("//*[@id='continue']/span/input")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
	}
	@After
	public void aftertest() {
		//driver.quit();
	}
	}
