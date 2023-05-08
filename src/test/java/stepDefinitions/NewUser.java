package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class NewUser {

    @Given("The user is on the Prilo homepage")
    public void the_user_is_on_the_Prilo_homepage() {
        open("https://pilot.prilo.com/sign-in?returnUrl=%2Fdashboard");
    }

    @Given("The user closes the cookie information popup new user")
    public void the_user_closes_the_cookie_information_popup_new_user() {
        $(By.xpath("//body/app-root[1]/app-cookie-bar[1]/div[1]/div[1]/div[2]/p-button[1]/button[1]")).click();
    }

    @Given("The user changes the language to English")
    public void the_user_changes_the_language_to_English() {
        SelenideElement languageDropdown = $(By.xpath("(//img[@class='flag flag-pl'])[1]"));
        languageDropdown.click();
        SelenideElement englishOption = $(By.xpath("//div[contains(text(),'English')]"));
        englishOption.click();
    }

    @When("The user clicks the Sign Up button")
    public void the_user_clicks_the_Sign_Up_button() {
        $(By.xpath("//body/app-root[1]/div[1]/div[1]/main[1]/app-sign-in[1]/div[2]/p[1]/a[1]")).click();
    }

    @When("The user clicks Register as a shipper button")
    public void the_user_clicks_Register_as_a_shipper_button() {
        sleep(3000);
        $(By.xpath("//body/app-root[1]/div[1]/div[1]/main[1]/app-role-selection[1]/div[2]/div[2]/div[1]/app-checkbox-button[1]/div[1]/div[1]")).click();
    }

    @When("The user clicks the Next button to enter company data")
    public void the_user_clicks_the_Next_button_enter_company_data() {
        $(By.xpath("//body/app-root[1]/div[1]/div[1]/main[1]/app-role-selection[1]/div[2]/div[3]/p-button[1]/button[1]")).click();
    }

    @When("The user enters Country as {string}")
    public void the_user_enters_Country_as(String country) {
        $(byCssSelector("input[placeholder='Select your country']")).setValue(country);
        SelenideElement optionElement = $(By.xpath("//li[@role='option']"));
        optionElement.click();
    }

    @When("The user enters Company VAT No. as {string}")
    public void the_user_enters_Company_VAT_No_as(String vatNumber) {
        $(By.xpath("(//input[@id='tax-id-input'])[1]")).setValue(vatNumber);
    }

    @When("The user enters Company name as {string}")
    public void the_user_enters_Company_name_as(String companyName) {
        $(By.xpath("//input[@id='company-name-input']")).setValue(companyName);
    }

    @When("The user enters Street name and No. as {string}")
    public void the_user_enters_Street_name_and_No_as(String streetNameAndNumber) {
        $(By.xpath("//input[@id='street-name-and-number-input']")).setValue(streetNameAndNumber);
    }

    @When("The user enters Postal Code as {string}")
    public void the_user_enters_Postal_Code_as(String postalCode) {
        $(By.xpath("//input[@id='post-code-input']")).setValue(postalCode);
    }

    @When("The user enters City as {string}")
    public void the_user_enters_City_as(String city) {
        $(By.xpath("//input[@id='city-input']")).setValue(city);
    }

    @When("The user clicks the Next button to enter user data")
    public void the_user_clicks_the_Next_button_enter_user_data() {
        SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));
        Selenide.actions().doubleClick(submitButton).perform();
    }

    @When("The user enters Full name as {string}")
    public void the_user_enters_Full_name_as(String fullName) {
        $(By.xpath("//input[@id='fullname']")).setValue(fullName);
    }

    @When("The user enters E-mail address as {string}")
    public void the_user_enters_E_mail_address_as(String emailAddress) {
        $(By.xpath("//input[@name='email_address']")).setValue(emailAddress);
    }

    @When("The user enters Repeat e-mail address as {string}")
    public void the_user_enters_Repeat_e_mail_address_as(String repeatEmailAddress) {
        $(By.xpath("//input[@name='repeat_email_address']")).setValue(repeatEmailAddress);
    }

    @When("The user enters Phone number as {string}")
    public void the_user_enters_Phone_number_as(String phoneNumber) {
        $(By.xpath("//input[@name='phone_number']")).setValue(phoneNumber);
    }

    @When("The user enters Password as {string}")
    public void the_user_enters_Password_as(String password) {
        $(By.xpath("//input[@name='password']")).setValue(password);
    }

    @When("The user enters Repeat password as {string}")
    public void the_user_enters_Repeat_password_as(String repeatPassword) {
        $(By.xpath("//input[@name='repeat_password']")).setValue(repeatPassword);
    }

    @When("The user clicks the Next button to read and accept contract conditions")
    public void the_user_clicks_the_Next_button_read_and_accept_contract_conditions() {
        $(By.xpath("//button[contains(text(), 'Next')]")).click();
    }

    @When("The user checks the Select all checkbox")
    public void the_user_checks_the_Select_all_checkbox() {
        $(By.xpath("//input[@id='select-all']")).click();
    }

    @When("The user clicks the Create an account button")
    public void the_user_clicks_the_Create_an_account_button() {
        $(By.xpath("//button[contains(text(), 'Create an account')]")).click();
    }

    @Then("The user sees the message {string} on the registration success page")
    public void the_user_sees_the_message_on_the_registration_success_page(String message) {
        $(By.xpath("//div[contains(text(), '" + message + "')]")).shouldBe(Condition.visible);
    }
}