package com.stepdefinitions;



import com.pages.LoginFromExcelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdefinition {
	//To call LoginFromExcelPage with reference object
	LoginFromExcelPage page = new LoginFromExcelPage();
	@Given("^open the url in a browser$")
	public void open_the_url_in_a_browser() {
		page.LaunchUrl("chrome","http://practice.automationtesting.in/");
	}

	@When("^url is launched click the MyAccount button$")
	public void url_is_launched_click_the_MyAccount_button() {
		page.clickMyAccount();
	}

	@When("^enter the email id and password in the excel sheet (\\d+) sets to click login and assert$")
	public void enter_the_email_id_and_password_in_the_excel_sheet_sets_to_click_login_and_assert(int arg1) throws Exception {
		
		/*
		 * page.loginCredentials(1); page.clickLogin(); page.Assert();
		 * page.Screenshot1(); page.logout();
		 */
		 
		 
		for(int i=1;i<=7;i++) {
		page.loginCredentials(i);
		page.clickLogin();
		page.Assert();
		if(i==1) 
			page.Screenshot1(); 
		else if(i==2) 
			page.Screenshot2(); 
		else if(i==3)
			page.Screenshot3();
		else if(i==4)
			page.Screenshot4();
		else if(i==5)
			page.Screenshot5();
		else if(i==6)
			page.Screenshot6();
		else
			page.Screenshot7();
		page.logout();
		}
		for(int i=8;i<=15;i++) {
			page.loginCredentials(i);
			page.clickLogin();
			page.Assert();
			if(i==8) 
				page.Screenshot8(); 
			else if(i==9) 
				page.Screenshot9(); 
			else if(i==10)
				page.Screenshot10();
			else if(i==11)
				page.Screenshot11();
			else if(i==12)
				page.Screenshot12();
			else if(i==13)
				page.Screenshot13();
			else
				page.Screenshot14();
			page.logout();
			
		}
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		page.quit();
	}

}
