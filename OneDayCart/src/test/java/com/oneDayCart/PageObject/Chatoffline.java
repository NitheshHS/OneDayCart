package com.oneDayCart.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Chatoffline 
{
	
	@FindBy(xpath="//input[@id='offline0Field']")
	private WebElement nameTF;
	
	@FindBy(xpath="//input[@id='offline1Field']")
	private WebElement emailTF;
	
	@FindBy(xpath="//button[@id='formSubmit']")
	private WebElement submitButton;
	
	@FindBy(xpath="//textarea[@id='offline2Field']")
	private WebElement textareaTF;

	public WebElement getTextareaTF() {
		return textareaTF;
	}

	public WebElement getNameTF() {
		return nameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	public void chatoffline(String name,String email,String message)
	{
		nameTF.sendKeys(name);
		emailTF.sendKeys(email);
		textareaTF.sendKeys(message);
		
	}

}
