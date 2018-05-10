package webandmobiledriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverService;
import org.openqa.selenium.safari.SafariOptions;

import java.io.File;
import java.io.IOException;

public class SafariDriverManager extends DriverManager {

    private SafariDriverService safariDriverService;
    protected void startService() {

        if(null==safariDriverService){
            safariDriverService= new SafariDriverService.Builder()
                    .usingDriverExecutable(new File(""))
                    .usingAnyFreePort()
                    .build();
            try {
                safariDriverService.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    protected void stopService() {
        if(null !=safariDriverService && safariDriverService.isRunning()){
            safariDriverService.stop();
        }

    }

    protected void createDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.safari();
        SafariOptions option = new SafariOptions();
        option.merge(capabilities);
        capabilities.setCapability(SafariOptions.CAPABILITY,option);
        driver = new SafariDriver(safariDriverService);
    }
}
