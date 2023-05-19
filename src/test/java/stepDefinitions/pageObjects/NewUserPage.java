package stepDefinitions.pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byCssSelector;

public class NewUserPage {

    private final By languageDropdownSelector = By.xpath("(//img[@class='flag flag-pl'])[1]");
    private final By englishOptionSelector = By.xpath("//div[contains(text(),'English')]");
    private final By signUpButtonSelector = By.cssSelector("a[routerlink='/role-selection']");
    private final By shipperButtonSelector = By.xpath("(//div[@class='checkbox-button-container'])[1]");
    private final By nextButtonCompanyDataSelector = By.cssSelector("button[type='button']");
    private final By countryInputSelector = byCssSelector("input[placeholder='Select your country']");
    private final By optionElementSelector = By.xpath("//li[@role='option']");
    private final By vatNumberInputSelector = By.xpath("(//input[@id='tax-id-input'])[1]");
    private final By companyNameInputSelector = By.xpath("//input[@id='company-name-input']");
    private final By streetInputSelector = By.xpath("//input[@id='street-name-and-number-input']");
    private final By postalCodeInputSelector = By.xpath("//input[@id='post-code-input']");
    private final By cityInputSelector = By.xpath("//input[@id='city-input']");
    private final By nextButtonUserDataSelector = By.cssSelector(".p-element.thin-yellow");
    private final By fullNameInputSelector = By.xpath("//input[@id='fullname']");
    private final By emailInputSelector = By.xpath("//input[@id='email']");
    private final By repeatEmailInputSelector = By.xpath("//input[@id='repeatEmail']");
    private final By phoneNumberInputSelector = By.xpath("//input[@id='number']");
    private final By passwordInputSelector = By.xpath("//input[@class='p-inputtext p-component p-element ng-tns-c123-5']");
    private final By repeatPasswordInputSelector = By.xpath("//input[@class='p-inputtext p-component p-element ng-tns-c123-6']");
    private final By acceptCheckboxSelector = By.xpath("//div[@class='p-checkbox p-component'][1]");
    private final By createAccountButtonSelector =By.cssSelector("p-button[type='submit']");
    private final By successMessageSelector = By.xpath("//h4[contains(text(),'Confirm your e-mail address')]");

    public void changeLanguageToEnglish() {
        $(languageDropdownSelector).click();
        $(englishOptionSelector).click();
    }

    public void clickSignUpButton() {
        $(signUpButtonSelector).click();
    }

    public void clickRegisterAsShipperButton() {
        $(shipperButtonSelector).click();
    }

    public void clickNextButtonCompanyData() {
        $(nextButtonCompanyDataSelector).click();
    }

    public void enterCompanyDetails(Map<String, String> companyDetails) {
        $(countryInputSelector).setValue(companyDetails.get("Country"));
        $(optionElementSelector).click();
        $(vatNumberInputSelector).setValue(companyDetails.get("Company VAT No."));
        $(companyNameInputSelector).setValue(companyDetails.get("Company name"));
        $(streetInputSelector).setValue(companyDetails.get("Street name and No."));
        $(postalCodeInputSelector).setValue(companyDetails.get("Postal Code"));
        $(cityInputSelector).setValue(companyDetails.get("City"));
    }

    public void clickNextButtonUserData() {
        $(nextButtonUserDataSelector).click();
        $(nextButtonUserDataSelector).click();
    }

    public void enterUserDetails(Map<String, String> userDetails) {
        $(fullNameInputSelector).setValue(userDetails.get("Full name"));
        $(emailInputSelector).setValue(userDetails.get("E-mail address"));
        $(repeatEmailInputSelector).setValue(userDetails.get("Repeat e-mail address"));
        $(phoneNumberInputSelector).setValue(userDetails.get("Phone number"));
        $(passwordInputSelector).setValue(userDetails.get("Password"));
        $(repeatPasswordInputSelector).setValue(userDetails.get("Repeat password"));
    }

    public void clickNextButtonAcceptContractConditions() {
        $(nextButtonUserDataSelector).click();
    }

    public void checkSelectAllCheckbox() {
        $(acceptCheckboxSelector).click();
    }

    public void clickCreateAccountButton() {
        $(createAccountButtonSelector).click();
    }

    public void verifySuccessMessage(String message) {
        $(successMessageSelector).shouldBe(Condition.visible);
    }
}