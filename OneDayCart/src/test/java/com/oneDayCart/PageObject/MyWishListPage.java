package com.oneDayCart.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.GenericLib.Utility;

public class MyWishListPage {
	@FindBy(xpath="//span[.='Add to Cart']")
	private WebElement addtocartButton;
	@FindBy(xpath="//span[.='Update Wishlist']")
	private WebElement updateWishlistBT;
	@FindBy(xpath="//span[.='Add All to Cart']")
	private WebElement addallToCartBT;
	@FindBy(xpath="//span[.='Share Wishlist']")
	private WebElement shareWishlistBT;
	@FindBy(xpath="//a[.='Remove item']")
	private WebElement removeitemIcon;
	
	@FindBy(name="emails")
	private WebElement emailTB;
	
	@FindBy(id="message")
	private WebElement messagaeTB;
	
	@FindBy(xpath="//span[.='Share Wishlist']")
	private WebElement shareWishBT;
	
	
	public WebElement getEmailTB() {
		return emailTB;
	}
	public WebElement getMessgaeTB() {
		return messagaeTB;
	}
	public WebElement getShareWishBT() {
		return shareWishBT;
	}
	public WebElement getAddtocartButton() {
		return addtocartButton;
	}
	public WebElement getUpdateWishlistBT() {
		return updateWishlistBT;
	}
	public WebElement getAddallToCartBT() {
		return addallToCartBT;
	}
	public WebElement getShareWishlistBT() {
		return shareWishlistBT;
	}
	public WebElement getRemoveitemIcon() {
		return removeitemIcon;
	}
	public void removeItem() {
		Reporter.log("click on remove item", true);
		removeitemIcon.click();
		Base.staticDriver.switchTo().alert().accept();
		Reporter.log("Handling alert", true);
	}
	public void addAllToCart() {
		Utility.scrollBy(addallToCartBT.getLocation().getY());
		addallToCartBT.click();
		Reporter.log("click on add all to cart button", true);
	}
	public void shareWishList(String emails, String message) {
		shareWishlistBT.click();
		Reporter.log("click on share wish list button", true);
		emailTB.sendKeys(emails);
		Reporter.log("enter emails", true);
		messagaeTB.sendKeys(message);
		Reporter.log("enter message", true);
		Utility.scrollBy(shareWishBT.getLocation().getY()+100);
		shareWishBT.click();
		Reporter.log("click on share wishlist", true);
	}
}
