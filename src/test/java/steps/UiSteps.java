package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UiSteps {
    @Given("some url")
    public void someUrl() {
        open("https://www.twitch.tv/directory");
    }

    @When("click")
    public void click() {
        $(By.xpath("//div[@class='tw-flex-grow-0']")).click();
    }

    @Then("then redirect")
    public void thenRedirect() {
        $(By.cssSelector("#modal-root-header")).shouldHave(text("Войти в Twitch"));
    }
}
