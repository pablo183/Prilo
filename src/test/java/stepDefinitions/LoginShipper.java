package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.Before;
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
    @Given("The login shipper")
    public void the_login_shipper() {
        the_user_is_on_the_prilo_login_page();
        the_user_enters_a_valid_email_and_password("pablo183testy@gmail.com", "!Pablo183");
    }
    */

    @Given("The user is on the Prilo login page")
    public void the_user_is_on_the_prilo_login_page() {
        open("https://pilot.prilo.com/sign-in?returnUrl=%2Fdashboard");
    }

    @Given("The user closes the cookie information popup")
    public void the_user_closes_the_cookie_information_popup() {
        $(By.xpath("//body/app-root[1]/app-cookie-bar[1]/div[1]/div[1]/div[2]/p-button[1]/button[1]")).click();

    }

    @When("The user enters a valid email {string} and password {string}")
    public void the_user_enters_a_valid_email_and_password(String email, String password) {
        $(By.xpath("//input[@id='email-input']")).sendKeys(email);
        $(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-sign-in[1]/div[2]/div[1]/form[1]/adamp-input-password[1]/div[1]/p-password[1]/div[1]/input[1]")).sendKeys(password);

    }

    @When("The user clicks the login button")
    public void the_user_clicks_the_login_button() {
        sleep(3000);
        $("[type='submit']").click();


    }

    @Then("The user is redirected to the homepage")
    public void the_user_is_redirected_to_the_homepage() {
        SelenideElement element = $x("//app-section-header/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]");
        element.shouldBe(visible);
        sleep(3000);

    }

}
