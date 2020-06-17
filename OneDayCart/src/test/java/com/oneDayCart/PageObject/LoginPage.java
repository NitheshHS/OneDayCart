package com.oneDayCart.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="email")
	private WebElement emailTF;
	@FindBy(id="pass")
	private WebElement passwordTF;
	@FindBy(xpath="//span[.='Login']")
	private WebElement loginButton;
	public WebElement getEmailTF() {
		return emailTF;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void login(String email, String password) {
		emailTF.sendKeys(email);
		passwordTF.sendKeys(password);
		loginButton.click();
	}
}
