package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import stepDefinitions.pageObjects.NewUserPage;

import java.util.Map;
public class NewUser {
    private final NewUserPage newUserPage = new NewUserPage();

    @Given("The user changes the language to English")
    public void the_user_changes_the_language_to_English() {
        newUserPage.changeLanguageToEnglish();
    }

    @When("The user clicks the Sign Up button")
    public void the_user_clicks_the_Sign_Up_button() {
        newUserPage.clickSignUpButton();
    }

    @When("The user clicks Register as a shipper button")
    public void the_user_clicks_Register_as_a_shipper_button() {
        newUserPage.clickRegisterAsShipperButton();
    }

    @When("The user clicks the Next button to enter company data")
    public void the_user_clicks_the_Next_button_to_enter_company_data() {
        newUserPage.clickNextButtonCompanyData();
    }

    @When("The user enters the following company details:")
    public void the_user_enters_the_following_company_details(Map<String, String> companyDetails) {
        newUserPage.enterCompanyDetails(companyDetails);
    }

    @When("The user clicks the Next button to enter user data")
    public void the_user_clicks_the_Next_button_to_enter_user_data() {
        newUserPage.clickNextButtonUserData();
    }

    @When("The user enters the following user details:")
    public void the_user_enters_the_following_user_details(Map<String, String> userDetails) {
        newUserPage.enterUserDetails(userDetails);
    }

    @When("The user clicks the Next button to read and accept contract conditions")
    public void the_user_clicks_the_Next_button_to_read_and_accept_contract_conditions() {
        newUserPage.clickNextButtonAcceptContractConditions();
    }

    @When("The user checks the Select all checkbox")
    public void the_user_checks_the_Select_all_checkbox() {
        newUserPage.checkSelectAllCheckbox();
    }

    @When("The user clicks the Create an account button")
    public void the_user_clicks_the_Create_an_account_button() {
        newUserPage.clickCreateAccountButton();
    }

    @Then("The user sees the message {string} on the registration success page")
    public void the_user_sees_the_message_on_the_registration_success_page(String message) {
        newUserPage.verifySuccessMessage(message);
    }

}
