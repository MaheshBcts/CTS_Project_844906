package com.testrunners;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\main\\resources\\feature\\testcases.feature",
plugin = {"pretty:target/json-report.json","html:target/cucumber-html-report","junit:target/junit-xml-report.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
tags = {"@TS_01_Register,@TS_02_Login,@TS_03_Shop,@TS_04_increase_cart,@TS_05_decrease_cart,@TS_06_delete_cart"},
glue = {"com/stepdefinitions"},
monochrome = true
)
public class testrunner {

}
