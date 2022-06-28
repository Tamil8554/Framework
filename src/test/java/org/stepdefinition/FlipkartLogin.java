package org.stepdefinition;
import org.junit.Assert;
import org.runnerclass.BaseClass1;
import com.pojo.FlipkartPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartLogin extends BaseClass1 {
 public static FlipkartPojo fl;
@Given("To get Flipkart url")
public void to_get_Flipkart_url() {
    
    launchUrl("https://www.flipkart.com/");} 

@When("To enter value in email field")
public void to_enter_value_in_email_field() {
    fl =new FlipkartPojo();
    fill(fl.getTxtEmail(), "Tamil123@gmail.com");}

@When("To enter value in password field")
public void to_enter_value_in_password_field() {
    fl =new FlipkartPojo();
    fill(fl.getTxtPass(), "Raja@123");}

@When("To click signin button")
public void to_click_signin_button() {
    fl =new FlipkartPojo();
    click(fl.getBtnLogin());}

@Then("To get pagetitle")
public void to_get_pagetitle() {
	Assert.assertTrue(false);
    gettitle();
    currentUrl();}}
