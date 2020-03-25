package com.pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShopPage {
	WebDriver driver;
	//To launch browser in either firefox or chrome
	public void LaunchUrl(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","src\\test\\resources\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
	}catch (WebDriverException e) {
		System.out.println(" browser could not be launched");
	}
	}
	//To close the browser window
	public void quit() {
		driver.close();
	}
	//To click Myaccount and enter username and password the login
	public void loginCredentials(String user, String password) {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}
	//To click the shop button
	public void clickShop() {
		driver.findElement(By.linkText("Shop")).click();
	}
	//To add the shopped item
	public void addtoBasket() {
		driver.findElement(By.xpath("//img[@alt='Selenium Ruby']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	//To check item is added successfully
	public void shopAssert() throws Exception {
		String b = driver.findElement(By.xpath("//a[@class='button wc-forward']")).getText();
		Assert.assertEquals("VIEW BASKET",b);
		System.out.println("Added Successfully");
	}
	//To take the screenshot while shop
	public void Screenshot() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Shop.png"));
	}
}
