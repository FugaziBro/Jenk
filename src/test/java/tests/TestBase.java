package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Epic("Big")
public class TestBase {

    @Description("Just Some Test 1")
    @Severity(SeverityLevel.CRITICAL)
    @Step("Step one")
    @Test(dataProvider = "someData")
    public void test(String s){
        open("https://www.google.ru/webhp?client=opera&sourceid=opera");
                $(By.name("q")).val(s);
    }

    @DataProvider(parallel = true)
    public Object[][] someData() {
        return new Object[][]{
                {"Text1"},
                {"Text2"}
        };
    }

    @Description("Just Some Test")
    @Severity(SeverityLevel.CRITICAL)
    @Step("Step two")
    @Test(threadPoolSize = '2')
    public void testing(){
        open("https://www.google.ru/webhp?client=opera&sourceid=opera");
    }
}