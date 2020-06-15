package com.oneDayCart.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(linkText="Register")
	private WebElement registerLink;
	@FindBy(linkText="Log In")
	private WebElement logInlink;
	@FindBy(linkText="Checkout")
	private WebElement checkoutlink;
	@FindBy(xpath="//a[contains(@title,'My Cart')]")
	private WebElement mycartLink;
	@FindBy(xpath="//a[contains(@title,'My Wishlist')]")
	private WebElement mywishlistLink;
	@FindBy(linkText="My Account")
	private WebElement myAccountLink;
	@FindBy(xpath="//input[contains(@placeholder,'Search ')]")
	private WebElement searchBar;
	@FindBy(linkText="GROCERY")
	private WebElement grocerylink;
	@FindBy(linkText="FRUITS & VEG")
	private WebElement fruitsvegLink;
	@FindBy(linkText="FISH & MEAT")
	private WebElement fishmeatLink;
	@FindBy(linkText="FOOD")
	private WebElement foodLink;
	@FindBy(linkText="PERSONAL CARE")
	private WebElement personalcareLink;
	@FindBy(linkText="STATIONERY")
	private WebElement stationaryLink;
	@FindBy(linkText="HOUSEHOLD")
	private WebElement householdLink;
	@FindBy(linkText="ELECTRONICS & LED")
	private WebElement electronicsLink;
	@FindBy(linkText="SPORTS")
	private WebElement sportsLink;
	@FindBy(linkText="RICE & RICE PRODUCTS")
	private WebElement riceproductLink;
	@FindBy(linkText="FLOURS & ATTA")
	private WebElement floursattaLink;
	@FindBy(linkText="DALS & PULSES")
	private WebElement dalspulsesLink;
	@FindBy(linkText="SPICES & MASALAS")
	private WebElement spicesmasalaLink;
	@FindBy(linkText="SALT, SUGAR & JAGGERY")
	private WebElement saltsugarLink;
	@FindBy(linkText="EDIBLE OILS")
	private WebElement edibleoilLink;
	@FindBy(linkText="VEGETABLES")
	private WebElement vegetableLink;
	@FindBy(linkText="FRUITS")
	private WebElement fruitLink;
	@FindBy(linkText="FROZEN MEAT")
	private WebElement frozenmeatLink;
	
	
	
	
	
	
	
}
