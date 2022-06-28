
  package org.stepdefinition;
  
  import org.runnerclass.BaseClass1;
  
  import com.pojo.LoginPojo;
  
  import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
  io.cucumber.java.en.When;
  
  public class ScenarioOutline extends BaseClass1 { LoginPojo l=new
  LoginPojo();
  
  @Given("To launch the browser") public void to_launch_the_browser() {
  launchBrowser(); launchUrl("https://www.facebook.com/"); }
  
  @When("To pass value {string} in email field") public void
  to_pass_value_in_email_field(String email) { l=new LoginPojo();
  fill(l.getTxtEmail(), email);
  
  }
  
  @When("To pass the value {string} in password field") public void
  to_pass_the_value_in_password_field(String pass) { l =new LoginPojo();
  fill(l.getTxtPass(), pass);
  
  }
  
  @When("To click the login button") public void to_click_the_login_button() {
  l =new LoginPojo(); click(l.getBtnLogin()); }
  
  @Then("To close the browser") public void to_close_the_browser() {
  System.out.println("Test Done"); close(); }
  
  
  
  }
 