package com.kelompoksatu.hris.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
                "src/main/resources/feature/01.Login.feature",
               "src/main/resources/feature/02.UploadData.feature",
                "src/main/resources/feature/03.DistributeData.feature",
                "src/main/resources/feature/04.EditData.feature",
                "src/main/resources/feature/05.Logout.feature",
        },
        glue = "com.kelompoksatu.hris.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
