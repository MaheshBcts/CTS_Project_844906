package com.stepdefinitions;

import com.pages.IncreaseCartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncreaseCartstepdefinition {
	//To call IncreaseCartPage with reference object
	IncreaseCartPage page = new IncreaseCartPage(); 
	@Given("^open the url$")
	public void open_the_url() {
		page.LaunchUrl("chrome","http://practice.automationtesting.in/");
	}

	@When("^login to the application(\\d+)$")
	public void login_to_the_application(int arg1) throws Throwable {
		page.loginCredentials("maheshctsselenium", "7013167813@mahesh");
	}

	@When("^click view cart$")
	public void click_view_cart() throws Exception {
		page.clickViewcart();
	}

	@When("^increase the quantity in cart$")
	public void increase_the_quantity_in_cart() throws Exception {
		page.IncreaseCart();
		Thread.sleep(300);
	}

	@When("^click update basket$")
	public void click_update_basket() throws Exception {
		page.clcikUpadte();
	}

	@Then("^Asssert number of items increased$")
	public void asssert_number_of_items_increased() throws Exception {
		page.AssertIncrease();
		Thread.sleep(3000);
		page.Screenshot();
		Thread.sleep(300);
		page.quit();
	}


}
