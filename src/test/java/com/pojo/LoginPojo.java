package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.raja.BaseClass;
import org.runnerclass.BaseClass1;

public class LoginPojo extends BaseClass1 {
 public LoginPojo() {
	PageFactory.initElements(driver, this);
}
	@FindBy (id="email")
	private WebElement txtEmail;
	
	@FindBy (id="pass")
	private WebElement txtPass;
	
	@FindBy (name="login")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	

}
