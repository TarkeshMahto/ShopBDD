package stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import webandmobiledriver.DriverManager;
import webandmobiledriver.DriverManagerFactory;
import webandmobiledriver.DriverType;

public class BaseStepDefinitions {

    private DriverManager driverManager;
    WebDriver driver;

    @Before
    public void initiate() {
        driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
        driver = driverManager.getDriver();
    }

    @After
    public void end() {
        driverManager.quitDriver();
    }
}
