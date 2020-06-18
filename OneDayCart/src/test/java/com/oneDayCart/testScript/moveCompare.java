package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class moveCompare extends Base
{
	@Test
	public void Comp()
	{
		HomePage hmo = PageFactory.initElements(driver, HomePage.class);
		hmo.moveComp();
		Reporter.log("compared the name",true);
	}

}
