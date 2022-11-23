package com.kelompoksatu.hris.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
                "src/main/resources/features/02.UploadData.feature",
                "src/main/resources/features/03.DistributeData.feature",
                "src/main/resources/features/04.EditData.feature",
//                "src/main/resources/features/06.PhoneApprove.feature",
//                "src/main/resources/features/08.TaskAgentFollowUp.feature",
//                "src/main/resources/features/08.TaskAgentDataAll.feature",
//                "src/main/resources/features/08.TaskAgentFinal.feature",
//                "src/main/resources/features/09.ReportAgree.feature",
//                "src/main/resources/features/09.ReportActivity.feature"
        },
        glue = "com.kelompoksatu.hris.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
