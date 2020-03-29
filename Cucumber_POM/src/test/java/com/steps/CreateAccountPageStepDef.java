package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pages.CreateAccountPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateAccountPageStepDef {
	
	Steps steps;
	
	public CreateAccountPageStepDef(Steps steps) {
		this.steps=steps;
	}
	
	
	@And("user enter firstname as \"([^\"]*)\"")
	public void enter_First_Name(String firstName) {
		steps.createAccountPage.enter_FirstName(firstName);

	}
	@And("user enter lastname as \"([^\"]*)\"")
	public void enter_Last_Name(String lastName )
	{
		steps.createAccountPage.enter_LastName(lastName);
		
	}
	@And("^user enter password as \"([^\"]*)\"$")
	public void enter_Password(String password )
	{
		steps.createAccountPage.enter_Password(password);
		
	}
	@And("^user enter address as \"([^\"]*)\" and city as \"([^\"]*)\"$")
	public void enterAddressandCity(String address,String city) {
		steps.createAccountPage.enter_Adress(address);
		steps.createAccountPage.enter_City(city);
		
		
	}
	@And("^user select state as \"([^\"]*)\"$")
	public void selectState(String state )
	{
		steps.createAccountPage.select_State(state);
	}
	@And("^user enter zipcode as \"([^\"]*)\"$")
	public void enter_Zipcode(String zipcode )
	{
		steps.createAccountPage.enter_Zipcode(zipcode);
		
	}
	@And("^user enter phonenumber as \"([^\"]*)\"$")
	public void enter_PhoneNumber(String phoneNumber )
	{
		steps.createAccountPage.enter_MobileNo(phoneNumber);
		
	}
	@And("^user enter alias as \"([^\"]*)\"$")
	public void enter_AliasName(String alias )
	{
		steps.createAccountPage.enter_Alias(alias);
		
	}
	@And("^user click on register button$")
	public void click_RegisterButton( )
	{
		steps.myAccountPage=steps.createAccountPage.click_RegisterButton();
		
	}
	
	  
	 
	
}
