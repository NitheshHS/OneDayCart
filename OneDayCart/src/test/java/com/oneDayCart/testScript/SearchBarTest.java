package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.Grocery;
import com.oneDayCart.PageObject.HomePage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class SearchBarTest extends Base {
@Test
public void searchProductTest() {
	home=PageFactory.initElements(driver, HomePage.class);
	home.search("Rice products");
	Grocery gross = PageFactory.initElements(driver, Grocery.class);
	gross.addAllprodToCart();
}
}
