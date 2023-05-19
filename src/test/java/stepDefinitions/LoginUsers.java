package stepDefinitions;

import com.codeborne.selenide.SelenideElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class LoginUsers {

/*
    @When("The users closes the cookie information popup")
    public void the_users_closes_the_cookie_information_popup() {
        $(By.cssSelector("p-button[styleclass='ok-button']")).click();
    }

 */

    @When("The users enters a valid email {string}")
    public void the_user_enters_a_valid_email(String email) {
        $(By.xpath("//input[@id='email-input']")).sendKeys(email);
    }

    @When("The users enters a valid password {string}")
    public void the_user_enters_a_valid_password(String password) {
        $(By.cssSelector("input[type='password']")).sendKeys(password);
    }

    @When("The users clicks the login button")
    public void the_user_clicks_the_login_button() {
        $("[type='submit']").click();
    }

    @Then("The users is redirected to the homepage")
    public void the_user_is_redirected_to_the_homepage() {
        sleep(3000);
        SelenideElement element = $("img[src='assets/icons/avatar.svg']");
        element.shouldBe(visible);
    }
}


