package com.trycloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {//"pretty",//consolda bazi ayrintilari gosteriyor parallel test zamani
        "html:target/cucumber-report.html",
        "rerun:target/rerun.txt",
         "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,  //false means it is off will be open
        tags = "@wip",//@wip(work in progress)
        publish = true
)
public class CukesRunner {
}
