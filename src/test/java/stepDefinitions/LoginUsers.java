package stepDefinitions;

import com.codeborne.selenide.SelenideElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefinitions.pageObjects.LoginPage;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class LoginUsers {

    private final LoginPage loginPage = new LoginPage();

    @When("The users enters a valid email {string}")
    public void the_user_enters_a_valid_email(String email) {
        loginPage.enterEmail(email);
    }

    @When("The users enters a valid password {string}")
    public void the_user_enters_a_valid_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("The users clicks the login button")
    public void the_user_clicks_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("The users is redirected to the homepage")
    public void the_user_is_redirected_to_the_homepage() {
        SelenideElement element = $("img[src='assets/icons/avatar.svg']");
        element.shouldBe(visible);
    }
}
