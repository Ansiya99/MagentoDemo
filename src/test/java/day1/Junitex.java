package day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitex {
	WebDriver driver=new ChromeDriver();
	@Before
	public void beforemet()

	{
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		}
	@Test
	public void agesourc()
{
	String s=driver.getPageSource();
	if(s.contains("page")) {
		System.out.print("hello page");
	
	}
		
	}
	@Test
	public void login()
{
driver.findElement(By.name("email")).sendKeys("REDTDHHG@HGFH.COM");
driver.findElement(By.name("pass")).sendKeys("SDFGHHJ");
driver.findElement(By.name("login")).click();
System.out.print("kusu");
	
		
	}
	@After
	public void aftermet()
	{
		driver.quit();
	}

}
