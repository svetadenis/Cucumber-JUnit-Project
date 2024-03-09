package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//it makes our class runnable
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = true, // true -> only runs feature file to get unimplemented snippets
        // false -> it runs both feature file and step def.
        tags = "@vytrackLogin",
        publish = true //generating a report with public link
)
public class CukesRunner {}