package day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	WebDriver driver;
	@Before
	public void beforemet()

	{
		driver=new ChromeDriver();

		driver.get("https://google.com/");
		
	}
	@Test
	public void Search()
{
WebElement search=driver.findElement(By.name("q"));
search.sendKeys("facebook");
search.submit();
	}
	@After
	public void aftermet()
	{
	//	driver.quit();
	}

}
