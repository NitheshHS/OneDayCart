package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;
import com.oneDayCart.PageObject.MyCartPage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class ClearCartTest extends Base{
	@Test
	public void clearcartTest() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.clickOnMycart();
		MyCartPage mycart = PageFactory.initElements(driver, MyCartPage.class);
		mycart.clearShoppingCart();
	}
}
