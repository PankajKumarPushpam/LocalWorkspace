package com.ScreenShot;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CaptureScreenShotTest extends MainTest{
	@Test
	public void captureScreenShot() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("http://automationtesting.in/");
		String title=driver.getTitle();
		Assert.assertEquals("Home-Selenium Webdriver Appium Complete Tutorial", title);
		driver.close();
	}
}
