package org.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.runnerclass.BaseClass1;

import com.pojo.LoginPojo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition extends BaseClass1 {
	LoginPojo l;
	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
	    
	    launchUrl("https://www.facebook.com/");
	    maximize();
	}

	@When("User enter valid username in email field")
	public void user_enter_valid_username_in_email_field(io.cucumber.datatable.DataTable d) {
		l=new LoginPojo();
		List<String> li = d.asList();
		fill(l.getTxtEmail(), li.get(1));
		
	}
	@When("User enter valid passord in password field")
	public void user_enter_valid_passord_in_password_field(io.cucumber.datatable.DataTable d) {
		l =new LoginPojo();
		List<List<String>> li = d.asLists();
		fill(l.getTxtPass(), li.get(1).get(2));
	}

	

	@And("User click login button")
	public void user_click_login_button() throws InterruptedException {
		Assert.assertTrue(false);
	   click(l.getBtnLogin());
	     Thread.sleep(3000);
	  
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	    gettitle();
	    currentUrl();
	   
	}
}
