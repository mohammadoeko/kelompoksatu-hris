package com.kelompoksatu.hris.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
                "",
        },
        glue = "com.kelompoksatu.hris.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
