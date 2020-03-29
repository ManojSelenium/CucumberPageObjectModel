package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LandingPage;

public class TestBase implements SetUp{

	WebDriver driver;
	/**
	 * starting point of creating a driver
	 * @return driver 
	 */
	public WebDriver intilizeDriver() {
		
		System.setProperty(CHROME_KEY, CHROME_PATH);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize(); 
		 return driver;
	}
	
	public LandingPage enterURL(String url) {
		driver.get(url);
		return new LandingPage(driver);
	}
}
