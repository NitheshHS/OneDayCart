package com.oneDayCart.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	WebDriver driver;
	static WebDriver staticDriver;
	FileLib fi=new FileLib();
	@BeforeMethod
	public void configBM() {
		if(fi.getCommonKeyValue("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Resources\\chromedriver.exe");
			driver=new ChromeDriver();
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
		driver.get(fi.getCommonKeyValue("url"));
	}

	@AfterMethod
	public void configAM() {
		driver.close();
	}
}
