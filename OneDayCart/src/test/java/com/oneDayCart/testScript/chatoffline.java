     package com.oneDayCart.testScript;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.Chatoffline;
import com.oneDayCart.PageObject.HomePage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class chatoffline extends Base
{
	@DataProvider
	public Object[][] readData() 
	{
		return fi.readAlldataFromExcel("offlinechat");
	
	}
	@Test(dataProvider="readData")
	public void offlinechat(String name,String email,String message)
	{
		HomePage off = PageFactory.initElements(driver, HomePage.class);
		off.getChatoff().click();
		Chatoffline chat = PageFactory.initElements(driver, Chatoffline.class);
		chat.chatoffline(name, email, message);
		
	}

}

