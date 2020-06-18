package com.oneDayCart.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Myaccount 
{
	@FindBy(xpath="//a[.='Account Dashboard']")
	private WebElement accountDash;
	
	@FindBy(xpath="//a[.='Account Information']")
	private WebElement accountInfo;
	
	@FindBy(xpath="//a[.='Address Book']")
	private WebElement addBook;
	
	@FindBy(xpath="//a[.='My Orders']")
	private WebElement myOrder;
	
	public WebElement getAccountDash() {
		return accountDash;
	}

	public WebElement getAccountInfo() {
		return accountInfo;
	}

	public WebElement getAddBook() {
		return addBook;
	}

	public WebElement getMyOrder() {
		return myOrder;
	}

	public WebElement getRecurringProf() {
		return recurringProf;
	}

	public WebElement getBillingAggreem() {
		return billingAggreem;
	}

	public WebElement getMywalletCash() {
		return mywalletCash;
	}

	@FindBy(xpath="//strong[.='Recurring Profiles']")
	private WebElement recurringProf;
	
	@FindBy(xpath="//a[.='Billing Agreements']")
	private WebElement billingAggreem;
	
	@FindBy(xpath="//a[.='My Wallet Cash']")
	private WebElement mywalletCash;
 

	
	public void Mywallet(WebDriver driver)
	{
		int z=mywalletCash.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+z+");");
		mywalletCash.click();
		String tex = mywalletCash.getText();
	    Assert.assertEquals("MY WALLET CASH", tex);
	}
	
	public void Myorder(WebDriver driver)
	{
		int z = myOrder.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+z+");");
		myOrder.click();
		String text = myOrder.getText();
		Assert.assertEquals("MY ORDERS", text);
	}
}
