package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.Grocery;
import com.oneDayCart.PageObject.HomePage;

public class AddGrocery extends Base {
	@Test
	public void groceryAdd() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.grocesoryRiceProd(driver);
		home.getCloseNotification().click();
		Grocery grocery = PageFactory.initElements(driver, Grocery.class);
		grocery.addAllprodToCart();
	}
}
