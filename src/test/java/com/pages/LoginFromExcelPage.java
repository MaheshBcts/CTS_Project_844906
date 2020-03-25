package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ExcelUtility.ExcelRead;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;

public class LoginFromExcelPage {
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
	//To click MyAccount
	public void clickMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
	}
	//To enter username and password from excel sheet
	public void loginCredentials(int i) throws Exception {
		ExcelRead da = new ExcelRead();
		driver.findElement(By.id("username")).sendKeys(da.excel_username(i));
		driver.findElement(By.id("password")).sendKeys(da.excel_password(i));
	}
	//To clcik login button
	public void clickLogin() throws Exception {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	//To check login successful
	public void Assert() throws Exception {
		String a = driver.findElement(By.linkText("Dashboard")).getText();
		Assert.assertEquals("Dashboard",a);
		Thread.sleep(300);
		System.out.println("Logged Successfully");
	}
	//To logout from application
	public void logout() {
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")).click();
	}
	//To take all screenshots for each and every log in
	public void Screenshot1() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin1.png"));
	}
	public void Screenshot2() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin2.png"));
	}
	public void Screenshot3() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin3.png"));
	}
	public void Screenshot4() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin4.png"));
	}
	public void Screenshot5() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin5.png"));
	}
	public void Screenshot6() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin6.png"));
	}
	
	public void Screenshot7() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin7.png"));
	}
	public void Screenshot8() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin8.png"));
	}
	public void Screenshot9() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin9.png"));
	}
	
	public void Screenshot10() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin10.png"));
	}
	public void Screenshot11() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin11.png"));
	}
	public void Screenshot12() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin12.png"));
	}
	public void Screenshot13() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin13.png"));
	}
	
	public void Screenshot14() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin14.png"));
	}
	public void Screenshot15() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("src\\test\\resources\\Screenshots\\Loggedin15.png"));
	}
	
}
