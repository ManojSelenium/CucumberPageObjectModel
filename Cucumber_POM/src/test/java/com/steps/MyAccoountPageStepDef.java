package com.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;

public class MyAccoountPageStepDef {
	
	Steps steps;
	public MyAccoountPageStepDef(Steps steps)
	{
		this.steps=steps;
	}
	@Then("^user should see account name as \"([^\"]*)\"$")
	public void verifyUserName(String createdUserName)
	{
		Assert.assertEquals(createdUserName, steps.myAccountPage.getCreatedAccountName());
	}
}
