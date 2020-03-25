package com.stepdefinitions;

import com.pages.DeletecartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Deletecartstepdefinition {
	//To call DeleteCartPage with reference object
	DeletecartPage Dlpage = new DeletecartPage();
	@Given("^open the url in browser(\\d+)$")
	public void open_the_url_in_browser(int arg1)  {
		Dlpage.LaunchUrl("chrome","http://practice.automationtesting.in/");
	}

	@When("^login to the automation application$")
	public void login_to_the_automation_application()  {
		Dlpage.loginCredentials("maheshctsselenium", "7013167813@mahesh");
	}

	@When("^click the view shopping cart$")
	public void click_the_view_shopping_cart() throws Exception  {
		Dlpage.clickViewcart();
	}

	@When("^delete the item in the cart$")
	public void delete_the_item_in_the_cart() {
		Dlpage.deletecart();
	}

	@Then("^Assert cart is empty$")
	public void assert_cart_is_empty() throws Exception  {
		Dlpage.AssertDelete();
		Dlpage.Screenshot();
		Thread.sleep(300);
		Dlpage.quit();
	}
	
}
