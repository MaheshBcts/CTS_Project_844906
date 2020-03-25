package com.stepdefinitions;

import com.pages.DecreaseCartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DecreaseCartstepdefinition {
//To call DecreaseCartPage with reference object
DecreaseCartPage Dpage = new DecreaseCartPage();
@Given("^open the url in browser$")
public void open_the_url_in_browser() {
	Dpage.LaunchUrl("chrome","http://practice.automationtesting.in/");
}

@When("^login to application(\\d+)$")
public void login_to_application(int arg1) {
	Dpage.loginCredentials("maheshctsselenium", "7013167813@mahesh");
}

@When("^click the view cart$")
public void click_the_view_cart() throws Exception {
	Dpage.clickViewcart();
}

@When("^decrease the quantity in cart$")
public void decrease_the_quantity_in_cart() {
	Dpage.DecreaseCart();
}

@When("^click the update basket$")
public void click_the_update_basket() {
	Dpage.clcikUpadte();
}

@Then("^Assert number of items decreased$")
public void assert_number_of_items_decreased() throws Exception {
	Dpage.AssertDecrease();
	Thread.sleep(3000);
	Dpage.Screenshot();
	Thread.sleep(300);
	Dpage.quit();
}

}
