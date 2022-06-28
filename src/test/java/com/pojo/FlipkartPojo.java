package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.runnerclass.BaseClass1;

public class FlipkartPojo extends BaseClass1 {
	public FlipkartPojo() {
		PageFactory.initElements(driver, this);	}
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement txtEmail;
	
	 @FindBy (xpath = "//input[@type='password']")
	 private WebElement txtPass;
	 
	 @FindBy (xpath = "(//button[@type='submit'])[2]")
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
