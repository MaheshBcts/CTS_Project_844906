package com.stepdefinitions;

import com.pages.ShopPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shopstepdefinition {
	//To ShopPage with reference object
	ShopPage page = new ShopPage();
	
	@Given("^open the url in a browser(\\d+)$")
	public void open_the_url_in_a_browser(int arg1) {
		page.LaunchUrl("chrome","http://practice.automationtesting.in/");
	}

	@When("^login to the application$")
	public void login_to_the_application() {
		page.loginCredentials("maheshctsselenium", "7013167813@mahesh");
	}

	@When("^click on shop from then menu$")
	public void click_on_shop_from_then_menu()  {
		page.clickShop();
	}

	@When("^click any item add to basket$")
	public void click_any_item_add_to_basket() {
		page.addtoBasket();
	}

	@Then("^Assert number of items is displaying in basket icon$")
	public void assert_number_of_items_is_displaying_in_basket_icon() throws Exception {
		page.shopAssert();
		Thread.sleep(300);
		page.Screenshot();
		Thread.sleep(300);
		page.quit();
	}

}
