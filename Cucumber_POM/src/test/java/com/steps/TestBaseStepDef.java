package com.steps;

import org.openqa.selenium.WebDriver;

import com.pages.LandingPage;
import com.utils.SetUp;
import com.utils.TestBase;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestBaseStepDef {

	Steps steps;
	
	public TestBaseStepDef(Steps steps) {
	this.steps=steps;
	}
	
	@Given("user launch browser")
	public void user_Launch_Browser() {
		steps.testBase=new TestBase();
		steps.testBase.intilizeDriver();
	}

	@When("user enter url")
	public void enter_Url() {
		steps.landingPage=steps.testBase.enterURL(SetUp.AUTOMATION_URL);
	}
	
	@When("user passed {int} age value")
	public void passedIntValue(int age) {
		System.out.println("AGE :::::::: "+age);
	}
	
	@Then("user should see expected test as {string}")
	public void strinValue(String text) {
		System.out.println("Text ::::: "+text);
	}

}
