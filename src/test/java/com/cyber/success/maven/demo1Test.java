package com.cyber.success.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo1Test {
	WebDriver driver=null;
	@Test
	public void demo1()
	{
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.quit();
	}

}
