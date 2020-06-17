package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.Grocery;

public class AddGroceryToCartTest extends Base{
	@DataProvider
	public Object[][] readData() {
		return fi.readAllDataFromExcel(fi.getCommonKeyValue("sheet"));
	
	}
	@Test(dataProvider="readData")
	public void addgroceryTocartTest(String search,String KGgrams) {
		Grocery grocery=PageFactory.initElements(driver, Grocery.class);
		grocery.addGrocery(driver, search, KGgrams);
	}
}
