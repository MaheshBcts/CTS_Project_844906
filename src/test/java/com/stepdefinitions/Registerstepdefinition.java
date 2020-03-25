package com.stepdefinitions;



import com.pages.RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registerstepdefinition {
	//To call RegisterPage with reference object
	RegisterPage Rpage = new RegisterPage();
	
	@Given("^open the url in a browser_(\\d+)$")
	public void open_the_url_in_a_browser_(int arg1) {
		Rpage.LaunchUrl("chrome","http://practice.automationtesting.in/");
	}

	@When("^url is launched click the MyAccount button_(\\d+)$")
	public void url_is_launched_click_the_MyAccount_button_(int arg1) {
		Rpage.clickMyAcc();
	}

	@When("^Enter the email and password to register$")
	public void enter_the_email_and_password_to_register() {
		Rpage.RegDetails();
		
	}

	@When("^click register button$")
	public void click_register_button() throws Exception {
		Rpage.clickReg();
		Thread.sleep(3000);
	}

	@Then("^assert the registration is successful$")
	public void assert_the_registration_is_successful() throws Exception {
		Rpage.AssertRegister();
		Rpage.Screenshot();
		Thread.sleep(300);
		Rpage.quit();
	}

	


}
