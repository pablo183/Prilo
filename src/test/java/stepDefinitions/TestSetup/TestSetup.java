package stepDefinitions.TestSetup;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestSetup {

    @Before
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://pilot.prilo.com";
        Configuration.timeout = 10000;
        Selenide.open("/sign-in?returnUrl=%2Fdashboard");
        closeCookieInformationPopup();
    }

    @Given("The user is on the Prilo homepage")
    public void the_user_is_on_the_Prilo_homepage() {
        // Kod dla kroku "The user is on the Prilo homepage"
    }

    @Given("The user closes the cookie information popup new user")
    public void the_user_closes_the_cookie_information_popup_new_user() {
        closeCookieInformationPopup();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }

    private void closeCookieInformationPopup() {
        SelenideElement cookiePopupButton = $(By.cssSelector("p-button[styleclass='ok-button']"));
        if (cookiePopupButton.exists()) {
            cookiePopupButton.click();
        }
    }
}