package com.cyber.success.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo2Test {
	WebDriver driver=null;
	@Test
	public void demo2()
	{
		driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.quit();
	}
}
