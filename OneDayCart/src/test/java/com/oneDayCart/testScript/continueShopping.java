package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;
import com.oneDayCart.PageObject.MyCartPage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class continueShopping extends Base
{
	@Test
	public void continueShop()
	{
		HomePage hom = PageFactory.initElements(driver, HomePage.class);
		hom.continueShopping(driver);
		MyCartPage mycrt = PageFactory.initElements(driver, MyCartPage.class);
		mycrt.continueShopp(driver);
		
	}

}
