package com.hepsiburada.hooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.hepsiburada"},
        //tags="@login",
        monochrome = true,
        plugin ={"pretty","html:target/cucumber"}
)



public class Runner extends AbstractTestNGCucumberTests {
}
