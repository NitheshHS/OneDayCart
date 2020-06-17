package com.oneDayCart.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.oneDayCart.PageObject.HomePage;
import com.oneDayCart.PageObject.LoginPage;

public class Base {
	public WebDriver driver;
	public static WebDriver staticDriver;
	public FileLib fi=new FileLib();
	public HomePage home;
	@BeforeClass
	public void configBC() 
	{
		if(fi.getCommonKeyValue("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Resources\\chromedriver.exe");
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--disable-notification");
			driver=new ChromeDriver(op);
			staticDriver=driver;
		}
		else if(fi.getCommonKeyValue("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Resources\\geckodriver.exe");
			driver=new FirefoxDriver();
			staticDriver=driver;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("Browser is launched", true);
		driver.get(fi.getCommonKeyValue("url"));
		Reporter.log("enter url", true);
	}
	@BeforeMethod
	public void configBM() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.clickOnlogin();
		Reporter.log("click on logIn link", true);
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.login(fi.getCommonKeyValue("email"), fi.getCommonKeyValue("password"));
		Reporter.log("enter email and password", true);
	}
	@AfterMethod
	public void configAM() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.clickOnLogout();
		Reporter.log("click on logOut Link", true);
	}
	
	
	@AfterClass
	public void configAC() {
		driver.close();
		Reporter.log("browser closed");
	}
}
