@Practice.AutomationTesting.in
Feature: Practice_Automation_Testing_1 website

@TS_01_Register
Scenario: Login in to the web application
Given open the url in a browser_01
When url is launched click the MyAccount button_01
When Enter the email and password to register
When click register button
Then assert the registration is successful 

@TS_02_Login
Scenario: Login in to the web application
Given open the url in a browser
When url is launched click the MyAccount button
When enter the email id and password in the excel sheet 15 sets to click login and assert
Then close the browser


@TS_03_Shop
Scenario: Shop items
Given open the url in a browser1
When login to the application
When click on shop from then menu
When click any item add to basket
Then Assert number of items is displaying in basket icon

@TS_04_increase_cart
Scenario: Increase the quantity in added cart
Given open the url
When login to the application2
When click view cart
When increase the quantity in cart
When click update basket
Then Asssert number of items increased

@TS_05_decrease_cart
Scenario: decrease the quantity in the added cart
Given open the url in browser
When login to application3
When click the view cart
When decrease the quantity in cart
When click the update basket
Then Assert number of items decreased

@TS_06_delete_cart
Scenario: delete item in cart
Given open the url in browser1
When login to the automation application
When click the view shopping cart
When delete the item in the cart
Then Assert cart is empty
