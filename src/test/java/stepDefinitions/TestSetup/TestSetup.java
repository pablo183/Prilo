package stepDefinitions.TestSetup;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.junit.Test;


public class TestSetup {

    @Before
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://pilot.prilo.com";

    }
    @Given("The user is on the Prilo login page")
    public void the_user_is_on_the_prilo_login_page() {
        Selenide.open("/sign-in?returnUrl=%2Fdashboard");
    }
    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}

