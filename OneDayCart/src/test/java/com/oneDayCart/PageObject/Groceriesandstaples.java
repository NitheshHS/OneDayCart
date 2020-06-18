package com.oneDayCart.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Groceriesandstaples 
{
   @FindBy(xpath="(//a[.='RICE & RICE PRODUCTS'])[2]")
   private WebElement riceProductsLink;
   
   @FindBy(xpath="(//a[.='FLOURS & ATTA'])[2]")
   private WebElement attalink;
   
   @FindBy(xpath="(//a[.='SPICES & MASALAS'])[2]")
   private WebElement spicesMasalaLink;
   
   @FindBy(xpath="(//a[.='EDIBLE OILS'])[2]")
   private WebElement edibleOilLink;
   
   @FindBy(xpath="(//a[.='DALS & PULSES'])[2]")
   private WebElement pulsesLink;
   
   @FindBy(xpath="(//a[.='TEA AND COFFEE'])[2]")
   private WebElement teaandcoffeeLink;
   
   @FindBy(xpath="//a[.='APPAM POWDER']")
   private WebElement appampowderLink;
   
   @FindBy(xpath="//a[.='BRANDED RICE']")
   private WebElement brandedLink;
   
   @FindBy(xpath="//a[.='BOILED RICE']")
   private WebElement boiledLink;
   
   @FindBy(xpath="//span[.='Rs 0.00']")
   private WebElement rs0Link;
   
   @FindBy(xpath="//span[.='Rs 100.00']")
   private WebElement rs100Link;
   
   @FindBy(xpath="(//span[.='Rs 200.00']")
   private WebElement rs200Link;
   
   @FindBy(xpath="//span[.='Rs 300.00']")
   private WebElement rs300Link;
   
   @FindBy(xpath="/button[@title='Add to Cart']")
   private WebElement addToCart;
   
   @FindBy(xpath="//img[@alt='tick']")
   private WebElement tickMark;
   
   public WebElement getTickMark() {
	return tickMark;
}

public WebElement getAppampowderLink() {
   return appampowderLink;
}

public WebElement getBrandedLink() {
	return brandedLink;
}

public WebElement getBoiledLink() {
	return boiledLink;
}

public WebElement getAddToCart() {
	return addToCart;
}

public WebElement getRiceProductsLink() {
	return riceProductsLink;
}

public WebElement getSpicesMasalaLink() {
	return spicesMasalaLink;
}

public WebElement getAttalink() {
	return attalink;
}

public WebElement getEdibleOilLink() {
	return edibleOilLink;
}

public WebElement getPulsesLink() {
	return pulsesLink;
}

public WebElement getTeaandcoffeeLink() {
	return teaandcoffeeLink;
}

public WebElement getRs0Link() {
	return rs0Link;
}

public WebElement getRs100Link() {
	return rs100Link;
}

public WebElement getRs200Link() {
	return rs200Link;
}

public WebElement getRs300Link() {
	return rs300Link;
}
   
   public void addbyCatogry(WebDriver driver)
   {
	   HomePage home = PageFactory.initElements(driver, HomePage.class);
	   home.getGroceryAndSaples().click();
	   int y = riceProductsLink.getLocation().getY();
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,"+y+");");
	   riceProductsLink.click();
	   int a = brandedLink.getLocation().getY();
	   js.executeScript("window.scrollBy(0,"+a+");");
	   brandedLink.click();
	   int b=rs200Link.getLocation().getY();
	   js.executeScript("window.scrollBy(0,"+b+");");
	   rs200Link.click();
	   int c=addToCart.getLocation().getY();
	   js.executeScript("window.scrollBy(0,"+c+");");
	   addToCart.click();
	   Assert.assertTrue(tickMark.isDisplayed());
	   
	   
   }
   
   
   


}
