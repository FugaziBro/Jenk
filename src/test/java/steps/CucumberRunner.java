package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features ="src/test/resources/",
        glue ={"steps"},
        plugin={"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm"}


)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
