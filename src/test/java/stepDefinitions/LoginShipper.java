package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginShipper {

    /*
    @Given("The user is on the Prilo login page")
    public void the_user_is_on_the_prilo_login_page() {
        open("https://pilot.prilo.com/sign-in?returnUrl=%2Fdashboard");
       }
    */


    @Given("The user closes the cookie information popup")
    public void the_user_closes_the_cookie_information_popup() {
        $(By.cssSelector("p-button[styleclass='ok-button']")).click();
    }

    @When("The user enters a valid email {string}")
    public void the_user_enters_a_valid_email(String email) {
        $(By.xpath("//input[@id='email-input']")).sendKeys(email);
    }

    @When("The user enters a valid password {string}")
    public void the_user_enters_a_valid_password(String password) {
        $(By.cssSelector("input[type='password']")).sendKeys(password);
    }

    @When("The user clicks the login button")
    public void the_user_clicks_the_login_button() {
        $("[type='submit']").click();
    }

    @Then("The user is redirected to the homepage")
    public void the_user_is_redirected_to_the_homepage() {
        sleep(3000);
        SelenideElement element = $("img[src='assets/icons/avatar.svg']");
        element.shouldBe(visible);
    }
}
