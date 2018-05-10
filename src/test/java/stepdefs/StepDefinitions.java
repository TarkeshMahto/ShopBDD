package stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomepagePO;
import webandmobiledriver.DriverManager;
import webandmobiledriver.DriverManagerFactory;
import webandmobiledriver.DriverType;


/**
 * Created by Tarkesh on 5/8/2018.
 */


public class StepDefinitions {

     private DriverManager driverManager;
     private WebDriver driver;

    @Before
    public void initiate() {
        driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
        driver = driverManager.getDriver();
    }

    @After
    public void end() {
        driverManager.quitDriver();
    }

    @Given("^user is in Amazon 'Homepage'\\.$")
    public void user_is_in_amazon_homepage() {
        driver.get("https://www.amazon.in");
    }

    @When("^user hover over the 'Hello\\.Sign in Your order' label$")
    public void user_hover_over_the_hellosign_in_your_order_label() {
        HomepagePO homepagePO = new HomepagePO();
        homepagePO.hoverOnHelloSignInLabel(driver);
    }

    @Then("^user should be logged in and navigated to Amazon homepage\\.$")
    public void user_should_be_logged_in_and_navigated_to_amazon_homepage() {

    }

    @And("^user sees 'Hello\\.Sign in Your order' label\\.$")
    public void user_sees_hellosign_in_your_order_label() {


    }

    @And("^Pop-up appears having 'Sign in' button$")
    public void popup_appears_having_sign_in_button() {

    }

    @And("^user click on 'Sign in' button$")
    public void user_click_on_sign_in_button() {

    }

    @And("^user is redirected to Amazon login page\\.$")
    public void user_is_redirected_to_amazon_login_page() {

    }

    @And("^user sees 'Login' label$")
    public void user_sees_login_label() {

    }

    @And("^user enters 'Email or mobile phone number' and 'password'$")
    public void user_enters_email_or_mobile_phone_number_and_password() {

    }

    @And("^user click on 'Login' button$")
    public void user_click_on_login_button() {

    }

    @And("^user ID should be displayed as 'Hello,username Your order' instead of 'Hello\\. Sign in Your order' label$")
    public void user_id_should_be_displayed_as_hellousername_your_order_instead_of_hello_sign_in_your_order_label() {

    }


}



