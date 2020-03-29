package com.pages;

import org.openqa.selenium.WebDriver;

import com.objectrepo.SigninPageProp;
import com.utils.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SigninPageProp {

	WebDriver driver;
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void enterEmailAddrss(String emailAddress) {
		enterText(emailLocator, emailAddress);
		
	}
	
	public CreateAccountPage clickCreateAccountButton() {
		click(createAccountLocator);
		return new CreateAccountPage(driver);
	}
}
