package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class NewUser {

/*
    @Given("The user closes the cookie information popup new user")
    public void the_user_closes_the_cookie_information_popup_new_user() {
        $(By.cssSelector("p-button[styleclass='ok-button']")).click();
    }
 */

    @Given("The user changes the language to English")
    public void the_user_changes_the_language_to_English() {
        SelenideElement languageDropdown = $(By.xpath("(//img[@class='flag flag-pl'])[1]"));
        languageDropdown.click();
        SelenideElement englishOption = $(By.xpath("//div[contains(text(),'English')]"));
        englishOption.click();
    }

    @When("The user clicks the Sign Up button")
    public void the_user_clicks_the_Sign_Up_button() {
        $(By.cssSelector("a[routerlink='/role-selection']")).click();
    }

    @When("The user clicks Register as a shipper button")
    public void the_user_clicks_Register_as_a_shipper_button() {
        $(By.xpath("(//div[@class='checkbox-button-container'])[1]")).click();
    }

    @When("The user clicks the Next button to enter company data")
    public void the_user_clicks_the_Next_button_to_enter_company_data() {
        $(By.cssSelector("button[type='button']")).click();
    }

    @When("The user enters the following company details:")
    public void the_user_enters_the_following_company_details(Map<String, String> companyDetails) {
        $(byCssSelector("input[placeholder='Select your country']")).setValue(companyDetails.get("Country"));
        SelenideElement optionElement = $(By.xpath("//li[@role='option']"));
        optionElement.click();
        $(By.xpath("(//input[@id='tax-id-input'])[1]")).setValue(companyDetails.get("Company VAT No."));
        $(By.xpath("//input[@id='company-name-input']")).setValue(companyDetails.get("Company name"));
        $(By.xpath("//input[@id='street-name-and-number-input']")).setValue(companyDetails.get("Street name and No."));
        $(By.xpath("//input[@id='post-code-input']")).setValue(companyDetails.get("Postal Code"));
        $(By.xpath("//input[@id='city-input']")).setValue(companyDetails.get("City"));
    }

    @When("The user clicks the Next button to enter user data")
    public void the_user_clicks_the_Next_button_to_enter_user_data() {
        SelenideElement submitButton = $(By.cssSelector(".p-element.thin-yellow"));
        Selenide.actions().doubleClick(submitButton).perform();
    }

    @When("The user enters the following user details:")
    public void the_user_enters_the_following_user_details(Map<String, String> userDetails) {
        $(By.xpath("//input[@id='fullname']")).setValue(userDetails.get("Full name"));
        $(By.xpath("//input[@id='email']")).setValue(userDetails.get("E-mail address"));
        $(By.xpath("//input[@id='repeatEmail']")).setValue(userDetails.get("Repeat e-mail address"));
        $(By.xpath("//input[@id='number']")).setValue(userDetails.get("Phone number"));
        $(By.xpath("//input[@class='p-inputtext p-component p-element ng-tns-c123-5']")).setValue(userDetails.get("Password"));
        $(By.xpath("//input[@class='p-inputtext p-component p-element ng-tns-c123-6']")).setValue(userDetails.get("Repeat password"));
    }

    @When("The user clicks the Next button to read and accept contract conditions")
    public void the_user_clicks_the_Next_button_to_read_and_accept_contract_conditions() {
        $(By.xpath("(//button[@type='submit'])[1]")).click();
    }

    @When("The user checks the Select all checkbox")
    public void the_user_checks_the_Select_all_checkbox() {
        $(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
    }

    @When("The user clicks the Create an account button")
    public void the_user_clicks_the_Create_an_account_button() {
        $(By.xpath("(//button[@type='submit'])[1]")).click();
    }

    @Then("The user sees the message {string} on the registration success page")
    public void the_user_sees_the_message_on_the_registration_success_page(String message) {
        $(By.xpath("//h4[contains(text(),'Confirm your e-mail address')]")).shouldBe(Condition.visible);
    }
}