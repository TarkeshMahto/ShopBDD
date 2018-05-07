package webandmobiledriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class ChromeDriverManager extends DriverManager{

    private ChromeDriverService  chromeDriverService;

    @Override
    protected void startService() {
        if(null==chromeDriverService){
            try {
                chromeDriverService=new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File("/home/tarkesh/IdeaProjects/ShopBDD/src/main/resources/Drivers/chromedriver"))
                        .usingAnyFreePort()
                        .build();
                chromeDriverService.start();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void stopService() {
        if(null != chromeDriverService && chromeDriverService.isRunning()){
            chromeDriverService.stop();
        }
    }

    @Override
    protected void createDriver() {
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            ChromeOptions option = new ChromeOptions();
            option.addArguments("test-type");
            capabilities.setCapability(ChromeOptions.CAPABILITY,option);
            driver = new ChromeDriver(chromeDriverService,capabilities);

    }
}
