package com.oneDayCart.PageObject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;
import org.testng.Reporter;

import com.oneDayCart.GenericLib.Utility;

public class MyCartPage {
	@FindBy(xpath="//span[.='Clear Shopping Cart']")
	private WebElement clearShopingCartBT;
	@FindBy(xpath="//span[.='Update Shopping Cart']")
	private WebElement updateShopingCartBT;
	@FindBy(xpath="//span[.='Continue Shopping']")
	private WebElement continueShoppigBT;
	@FindBys({
		@FindBy(xpath="//a[@title='Remove item']")
	})
	private List<WebElement> removeBT;
	
	@FindBy(xpath="//h1[.='Shopping Cart is Empty']")
	private WebElement emptyCart;
	
	@FindBy(xpath="//a[.='Move']")
	private WebElement moveLink;

	public WebElement getMoveLink() {
		return moveLink ;
	}
	public WebElement getEmptyCart() {
		return emptyCart;
	}
	public WebElement getClearShopingCartBT() {
		return clearShopingCartBT;
	}
	public WebElement getUpdateShopingCartBT() {
		return updateShopingCartBT;
	}
	public WebElement getContinueShoppigBT() {
		return continueShoppigBT;
	}
	public List<WebElement> getRemoveBT() {
		return removeBT;
	}
	
	public void removeProdOneByOne() {
		Reporter.log("removing items one by one from cart", true);
		for(int i=0;i<removeBT.size();i++) {
			removeBT.get(i).click();
			Utility.scrollBy(removeBT.get(i).getLocation().getY());
		}
			
		
	}
	public void clearShoppingCart() {
		int y=clearShopingCartBT.getLocation().getY();
		Utility.scrollBy(y);
		clearShopingCartBT.click();
		Reporter.log("cleared cart items", true);
		Assert.assertEquals(emptyCart.getText(), "Shopping Cart is Empty");
	}
	
	public void moveToWishList() {
		Reporter.log("move items to wishlist",true);
		moveLink.click();
	}
	public void continueShopp(WebDriver driver)
	{
		int y=continueShoppigBT.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+");");
		continueShoppigBT.click();
	}
}
