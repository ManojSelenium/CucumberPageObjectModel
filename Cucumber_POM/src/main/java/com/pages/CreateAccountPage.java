package com.pages;

import org.openqa.selenium.WebDriver;

import com.objectrepo.CreateAccountProp;
import com.utils.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountProp{
	WebDriver driver;
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void enter_FirstName(String firstname)
	{
		enterText(FIRSTNAME_LOCATOR, firstname);
	}
	public void enter_LastName(String lastName)
	{
		enterText(LASTNAME_LOCATOR, lastName);
	}
	public void enter_Password(String password)
	{
		enterText(PASSWORD_LOCATOR, password);
	}
	public void enter_Adress(String address)
	{
		enterText(ADDRESS_LOCATOR, address);

	}
	public void enter_City(String city)
	{
		enterText(CITY_LOCATOR, city);
	}
	public void enter_Zipcode(String zipcode)
	{
		enterText(POSTALCODE_LOCATOR, zipcode);
	}
	public void select_State(String state)
	{
		selectValueFromDropDown(STATE_LOCATOR, state);
	}
	public void enter_MobileNo(String mobileno)
	{
		enterText(PHONENUMBER_LOCATOR, mobileno);
	}
	public void enter_Alias(String alias)
	{
		enterText(ALIAS_LOCTOR, alias);
	}
	public MyAccountPage click_RegisterButton()
	{
		click(REGISTER_LOCATOR);
		return new MyAccountPage(driver);
	}

}
