package webandmobiledriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

public class FirefoxDriverManager extends DriverManager{

    private GeckoDriverService geckoDriverService;

    protected void startService() {
        if(null==geckoDriverService){
            geckoDriverService=new GeckoDriverService.Builder()
                    .usingDriverExecutable(new File("/home/tarkesh/IdeaProjects/ShopBDD/src/main/resources/Drivers/geckodriver"))
                    .usingAnyFreePort()
                    .build();
            try {
                geckoDriverService.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    protected void stopService() {
        if(null != geckoDriverService && geckoDriverService.isRunning()){
            geckoDriverService.stop();
        }

    }

    protected void createDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        FirefoxOptions option = new FirefoxOptions();
        option.addArguments("test-type");
        capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS,option);
        driver = new FirefoxDriver(geckoDriverService,capabilities);
    }
}
