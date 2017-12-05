package com.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class dataProvider1 {
	WebDriver driver;
	WebDriverWait wait;
	 @BeforeMethod
	    public void openBrowser() {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
			driver.manage().window().maximize();
            wait=new WebDriverWait(driver, 10);
            driver.get("https://www.facebook.com/");
	    }
     @DataProvider(name="TestData")
     public Object[][] getData(){
    	 Object[][] data=new Object[3][2];
    	 
    	 data[0][0]="user1";
    	 data[0][1]="password1";
    	 
    	 data[1][0]="user2";
    	 data[1][1]="password2";
    	 
    	 data[2][0]="user3";
    	 data[2][1]="password3";
    	 
    	 return data;
     }
     @DataProvider(name="TestData")
     public void login(String un,String pw) {
    	 driver.findElement(By.id("email")).clear();
    	 driver.findElement(By.id("email")).sendKeys(un);
    	 driver.findElement(By.id("pass")).clear();
    	 driver.findElement(By.id("pass")).sendKeys(pw);
         driver.findElement(By.id("loginbutton")).click();
         driver.close();
     }
}
