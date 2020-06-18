package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.Myaccount;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class myOrder extends Base
{
	@Test
	public void myorderpage()
	{
		Myaccount myord = PageFactory.initElements(driver, Myaccount.class);
		myord.Myorder(driver);
		Reporter.log("my order page is displayed",true);
	}

}
