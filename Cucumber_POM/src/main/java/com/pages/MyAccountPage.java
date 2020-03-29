package com.pages;

import org.openqa.selenium.WebDriver;

import com.objectrepo.MyAccountPageProp;
import com.utils.WebDriverUtils;

public class MyAccountPage extends WebDriverUtils implements MyAccountPageProp {
	WebDriver driver;
	public MyAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public String getCreatedAccountName()
	{
		return getText(ACCOUNTNAME_LOCATOR);
	}

}
