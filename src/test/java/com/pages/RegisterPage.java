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

import com.ExcelUtility.ExcelRead;

public class RegisterPage {
	WebDriver driver;
	By MyAcc = By.linkText("My Account");
	By RegUser = By.id("reg_email");
	By RegPass = By.id("reg_password");
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
	//To click myAccount button
	public void clickMyAcc() {
		driver.findElement(MyAcc).click();
	}
	//To enter user name and password
	public void RegDetails() {
		driver.findElement(RegUser).sendKeys("mahselnium@gmail.com");
		driver.findElement(RegPass).sendKeys("7013167813@mahesh");
		driver.findElement(RegPass).click();
	
	}
	//To click theregister button
	public void clickReg() {
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}
	//To take the screenshot after registered
	public void Screenshot() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Registered.png"));
	}
	//To check registration is successful
	public void AssertRegister() throws Exception {
		String a = driver.findElement(By.linkText("Dashboard")).getText();
		Assert.assertEquals("Dashboard",a);
		System.out.println("Registered Successfully");
	}

}
