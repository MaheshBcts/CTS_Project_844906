package com.pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IncreaseCartPage {
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
	//To click the view cart
	public void clickViewcart() throws Exception {
		WebElement a = driver.findElement(By.xpath("//span[@class='cartcontents']"));
		Actions act = new Actions(driver);
		act.moveToElement(a).click().build().perform();
		
	}
	//To increase the cart item
	public void IncreaseCart() {
		WebElement b = driver.findElement(By.xpath("//input[@title='Qty']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(b).click().build().perform();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys(Keys.ARROW_UP);
	}
	//To update the cart 
	public void clcikUpadte() {
		driver.findElement(By.xpath("//input[@value='Update Basket']")).click();
	}
	//To check the item is increased or not
	public void AssertIncrease() throws Exception {
		String b = driver.findElement(By.xpath("//div[@class='woocommerce-message']")).getText();
		Assert.assertEquals("Basket updated.",b);
		System.out.println("Increased Successfully");
	}
	//To take the screenshot after increasing
	public void Screenshot() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\IncreasedCart.png"));
	}
}
