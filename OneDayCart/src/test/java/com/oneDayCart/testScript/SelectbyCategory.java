package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.Groceriesandstaples;

public class SelectbyCategory extends Base
{
	
	@Test
	public void Selectbycategry()
	{
		Groceriesandstaples gac = PageFactory.initElements(driver, Groceriesandstaples.class );
		gac.addbyCatogry(driver);
	}

}
