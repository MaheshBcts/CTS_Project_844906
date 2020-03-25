$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/testcases.feature");
formatter.feature({
  "line": 2,
  "name": "Practice_Automation_Testing_1 website",
  "description": "",
  "id": "practice-automation-testing-1-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Practice.AutomationTesting.in"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login in to the web application",
  "description": "",
  "id": "practice-automation-testing-1-website;login-in-to-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TS_01_Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the url in a browser_01",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "url is launched click the MyAccount button_01",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter the email and password to register",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click register button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "assert the registration is successful",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "01",
      "offset": 26
    }
  ],
  "location": "Registerstepdefinition.open_the_url_in_a_browser_(int)"
});
formatter.result({
  "duration": 18402688700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01",
      "offset": 43
    }
  ],
  "location": "Registerstepdefinition.url_is_launched_click_the_MyAccount_button_(int)"
});
formatter.result({
  "duration": 1326247800,
  "status": "passed"
});
formatter.match({
  "location": "Registerstepdefinition.enter_the_email_and_password_to_register()"
});
formatter.result({
  "duration": 1551490000,
  "status": "passed"
});
formatter.match({
  "location": "Registerstepdefinition.click_register_button()"
});
formatter.result({
  "duration": 6835745500,
  "status": "passed"
});
formatter.match({
  "location": "Registerstepdefinition.assert_the_registration_is_successful()"
});
formatter.result({
  "duration": 1989950900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login in to the web application",
  "description": "",
  "id": "practice-automation-testing-1-website;login-in-to-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TS_02_Login"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "open the url in a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "url is launched click the MyAccount button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "enter the email id and password in the excel sheet 15 sets to click login and assert",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstepdefinition.open_the_url_in_a_browser()"
});
formatter.result({
  "duration": 16644181600,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.url_is_launched_click_the_MyAccount_button()"
});
formatter.result({
  "duration": 1528425900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 51
    }
  ],
  "location": "Loginstepdefinition.enter_the_email_id_and_password_in_the_excel_sheet_sets_to_click_login_and_assert(int)"
});
formatter.result({
  "duration": 156436077600,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 4271230000,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Shop items",
  "description": "",
  "id": "practice-automation-testing-1-website;shop-items",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@TS_03_Shop"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "open the url in a browser1",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "login to the application",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "click on shop from then menu",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "click any item add to basket",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Assert number of items is displaying in basket icon",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 25
    }
  ],
  "location": "Shopstepdefinition.open_the_url_in_a_browser(int)"
});
formatter.result({
  "duration": 16853446400,
  "status": "passed"
});
formatter.match({
  "location": "Shopstepdefinition.login_to_the_application()"
});
formatter.result({
  "duration": 5584341700,
  "status": "passed"
});
formatter.match({
  "location": "Shopstepdefinition.click_on_shop_from_then_menu()"
});
formatter.result({
  "duration": 1223660400,
  "status": "passed"
});
formatter.match({
  "location": "Shopstepdefinition.click_any_item_add_to_basket()"
});
formatter.result({
  "duration": 5251958700,
  "status": "passed"
});
formatter.match({
  "location": "Shopstepdefinition.assert_number_of_items_is_displaying_in_basket_icon()"
});
formatter.result({
  "duration": 3166168900,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Increase the quantity in added cart",
  "description": "",
  "id": "practice-automation-testing-1-website;increase-the-quantity-in-added-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@TS_04_increase_cart"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "open the url",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "login to the application2",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "click view cart",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "increase the quantity in cart",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "click update basket",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Asssert number of items increased",
  "keyword": "Then "
});
formatter.match({
  "location": "IncreaseCartstepdefinition.open_the_url()"
});
formatter.result({
  "duration": 17464959400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 24
    }
  ],
  "location": "IncreaseCartstepdefinition.login_to_the_application(int)"
});
formatter.result({
  "duration": 6596185500,
  "status": "passed"
});
formatter.match({
  "location": "IncreaseCartstepdefinition.click_view_cart()"
});
formatter.result({
  "duration": 2158571300,
  "status": "passed"
});
formatter.match({
  "location": "IncreaseCartstepdefinition.increase_the_quantity_in_cart()"
});
formatter.result({
  "duration": 2508221900,
  "status": "passed"
});
formatter.match({
  "location": "IncreaseCartstepdefinition.click_update_basket()"
});
formatter.result({
  "duration": 139568300,
  "status": "passed"
});
formatter.match({
  "location": "IncreaseCartstepdefinition.asssert_number_of_items_increased()"
});
formatter.result({
  "duration": 17405389900,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "decrease the quantity in the added cart",
  "description": "",
  "id": "practice-automation-testing-1-website;decrease-the-quantity-in-the-added-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@TS_05_decrease_cart"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "open the url in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "login to application3",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "click the view cart",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "decrease the quantity in cart",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "click the update basket",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "Assert number of items decreased",
  "keyword": "Then "
});
formatter.match({
  "location": "DecreaseCartstepdefinition.open_the_url_in_browser()"
});
formatter.result({
  "duration": 20010442200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 20
    }
  ],
  "location": "DecreaseCartstepdefinition.login_to_application(int)"
});
formatter.result({
  "duration": 6287202400,
  "status": "passed"
});
formatter.match({
  "location": "DecreaseCartstepdefinition.click_the_view_cart()"
});
formatter.result({
  "duration": 1632698200,
  "status": "passed"
});
formatter.match({
  "location": "DecreaseCartstepdefinition.decrease_the_quantity_in_cart()"
});
formatter.result({
  "duration": 263529200,
  "status": "passed"
});
formatter.match({
  "location": "DecreaseCartstepdefinition.click_the_update_basket()"
});
formatter.result({
  "duration": 2752947500,
  "status": "passed"
});
formatter.match({
  "location": "DecreaseCartstepdefinition.assert_number_of_items_decreased()"
});
formatter.result({
  "duration": 5357991300,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "delete item in cart",
  "description": "",
  "id": "practice-automation-testing-1-website;delete-item-in-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@TS_06_delete_cart"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "open the url in browser1",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "login to the automation application",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "click the view shopping cart",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "delete the item in the cart",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "Assert cart is empty",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 23
    }
  ],
  "location": "Deletecartstepdefinition.open_the_url_in_browser(int)"
});
formatter.result({
  "duration": 14343426200,
  "status": "passed"
});
formatter.match({
  "location": "Deletecartstepdefinition.login_to_the_automation_application()"
});
formatter.result({
  "duration": 5969139000,
  "status": "passed"
});
formatter.match({
  "location": "Deletecartstepdefinition.click_the_view_shopping_cart()"
});
formatter.result({
  "duration": 1728335100,
  "status": "passed"
});
formatter.match({
  "location": "Deletecartstepdefinition.delete_the_item_in_the_cart()"
});
formatter.result({
  "duration": 595268600,
  "status": "passed"
});
formatter.match({
  "location": "Deletecartstepdefinition.assert_cart_is_empty()"
});
formatter.result({
  "duration": 19531584600,
  "status": "passed"
});
});