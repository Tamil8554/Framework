package org.stepdefinition;
import org.runnerclass.BaseClass1;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass1 {	
@Before
 public void before() {
	launchBrowser();
}
@After
 public void after() {
	close();
	}
}
