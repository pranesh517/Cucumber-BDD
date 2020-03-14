package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:com/feature/ApplicationLogin.feature" },
glue = "com/stepDefination", format = {"html:target/Destination" }, tags = {"@smoke"})
public class RunLoginTest {

}
