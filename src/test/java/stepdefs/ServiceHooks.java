package stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by thilinaga on 7/3/2017.
 */
public class ServiceHooks {
    @Before
    public void initializeTest(){
        // Code to setup initial configurations
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Code to capture and embed images in test reports (if scenario fails)
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}