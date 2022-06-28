$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Flipkart.feature");
formatter.feature({
  "name": "To validate flipkart login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate invalid mailid and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To get Flipkart url",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartLogin.to_get_Flipkart_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter value in email field",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartLogin.to_enter_value_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter value in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartLogin.to_enter_value_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click signin button",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartLogin.to_click_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To get pagetitle",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartLogin.to_get_pagetitle()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.FlipkartLogin.to_get_pagetitle(FlipkartLogin.java:34)\r\n\tat ✽.To get pagetitle(file:src/test/resources/FeatureFiles/Flipkart.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "To validate Login Functionality in Facebook Application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using invalid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter valid username in email field",
  "rows": [
    {
      "cells": [
        "Tamil123@gmail.com",
        "Raja123@gmail.com",
        "TR123@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_enter_valid_username_in_email_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid passord in password field",
  "rows": [
    {
      "cells": [
        "12345",
        "67890",
        "09876"
      ]
    },
    {
      "cells": [
        "54321",
        "09876",
        "65432"
      ]
    },
    {
      "cells": [
        "raja123",
        "tamil123",
        "tr123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_enter_valid_passord_in_password_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_click_login_button()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.LoginStepDefinition.user_click_login_button(LoginStepDefinition.java:46)\r\n\tat ✽.User click login button(file:src/test/resources/FeatureFiles/Login.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});