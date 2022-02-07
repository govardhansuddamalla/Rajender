package com.org.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"classpath:com.org/project"},
        glue = {"com.org.project"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber-reports/Cucumber.xml"},
        tags = "@task11"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}