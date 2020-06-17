package com.oneDayCart.PageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.GenericLib.Utility;

public class Grocery {
	@FindBys({
		@FindBy(xpath="//span[.='Add to Cart']")
	})
	private List<WebElement> addcartButtons;
	@FindBy(id="select_6995")
	private WebElement selectQTYdrop;
	@FindBy(name="qty")
	private WebElement qtyTF;
	@FindBy(xpath="//span[.='Add to Cart']")
	private WebElement addtocartButton;
	@FindBy(xpath="RICE & RICE PRODUCTS")
	private WebElement riceproductInfo;
	@FindBy(xpath="//img[@alt='tick']")
	private WebElement checkmarkMSG;
	
	public WebElement getSelectQTYdrop() {
		return selectQTYdrop;
	}
	public WebElement getQtyTF() {
		return qtyTF;
	}
	public WebElement getAddtocartButton() {
		return addtocartButton;
	}
	public WebElement getRiceproductInfo() {
		return riceproductInfo;
	}

	public WebElement getCheckmarkMSG() {
		return checkmarkMSG;
	}
	
	public List<WebElement> getAddcartButtons() {
		return addcartButtons;
	}
	public void addGrocery(WebDriver driver,String search, String kGgrams) {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.search(search);
		Utility.selectByVisibletext(selectQTYdrop, kGgrams);
		addtocartButton.click();
		Assert.assertTrue(checkmarkMSG.isDisplayed());

	}
	public void addAllprodToCart() {
		for(int i=0;i<addcartButtons.size();i++)
		{
			Reporter.log("click on add to cart",true);
			addcartButtons.get(i).click();
			int y = addcartButtons.get(i).getLocation().getY();
			JavascriptExecutor js=(JavascriptExecutor)Base.staticDriver;
			js.executeScript("window.scrollBy(0,"+y+")");
		}
	}
}
