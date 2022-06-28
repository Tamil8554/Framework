package org.runnerclass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles"
,glue ="org.stepdefinition",dryRun = false,
snippets = SnippetType.CAMELCASE,
plugin = {"html:target","junit:JUnitReport\\junit.xml","json:JsonReport\\report.json"})
public class TestRunner {
}
  