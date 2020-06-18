package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;
import com.oneDayCart.PageObject.MyWishListPage;

@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class AddAllWishListTest extends Base{
	@Test
	public void addAllToCartTest() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.clickOnMyWishlist();
		MyWishListPage mywish = PageFactory.initElements(driver, MyWishListPage.class);
		mywish.addAllToCart();
	}
}
