package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification{
    public static void main(String[] args) {
    //Webdrivermanager.chromedriver().setup();	
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com/");
	String expp="Google";
	String actual=driver.getTitle();
	if(actual.equals(expp)) {
		System.out.println("correct");
	}
	else {
		System.out.println("not correct");

	}
	
	driver.quit();
	}

}
