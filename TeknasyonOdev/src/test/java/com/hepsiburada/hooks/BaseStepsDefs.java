package com.hepsiburada.hooks;

import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import java.net.MalformedURLException;

public class BaseStepsDefs extends BaseTest {

    @Before
    public void setupDefs(Scenario scenario) throws MalformedURLException {
        String platformName = String.valueOf(scenario.getSourceTagNames());
        if (platformName.contains("Android")) androidSetup();
         else{
        System.out.println("platform tag name error");
    }
}
 /*  @After
    public void closeApp(){
        tearDown();
    }
*/
    @CucumberOptions(
            features = {"src/test/resources/features"},
            glue={"com/trendyol/steps"},
            tags="@login",
            monochrome = true,
            plugin = {"pretty", "html:target/cucumber"}
    )
    public static class Runner extends AbstractTestNGCucumberTests {
    }}
