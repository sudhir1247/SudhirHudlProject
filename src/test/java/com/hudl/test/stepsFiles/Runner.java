package com.hudl.test.stepsFiles;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = ".", tags = {"@mytest"}, monochrome = true, plugin = {
        "pretty", "html:target/cucumber-report/runwebat",
        "json:target/cucumber-report/runwebat/cucumber.json",
        "rerun:target/rerun.txt"},
        glue = "com.hudl.test.stepsFiles")
public class Runner extends AbstractTestNGCucumberTests {
}
