package com.steps;

import org.openqa.selenium.WebDriver;

import com.pages.SigninPage;

import io.cucumber.java.en.And;

public class SigninPageStepDef {
	
	Steps steps;
	
	public SigninPageStepDef(Steps steps) {
		this.steps=steps;
	}

	@And("^user enter emailaddress as \"([^\"]*)\"$")
	public void enter_Email_Address(String emailAddress) {
		steps.signinPage.enterEmailAddrss(emailAddress);
		
	}
	
	@And("^user click on create account button$")
	public void click_Create_Account_Button() {
	steps.createAccountPage=steps.signinPage.clickCreateAccountButton();
		
	}
}
