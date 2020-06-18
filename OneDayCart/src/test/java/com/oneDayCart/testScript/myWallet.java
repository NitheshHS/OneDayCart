package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.Myaccount;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class myWallet extends Base
{
	
	@Test
	public void myWallet()
	{
		Myaccount myacc = PageFactory.initElements(driver, Myaccount.class);
		myacc.Mywallet(driver);
		Reporter.log("my wallet is opened",true);
	}

}
