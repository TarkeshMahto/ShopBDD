package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomepagePO {


    public void hoverOnHelloSignInLabel(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(Locator.HELLOSIGNINLABEL.getPath())));
    }


    private enum Locator{

        HELLOSIGNINLABEL("//div[@id='nav-tools']/a");

        private String path;

        public String getPath() {
            return path;
        }

         Locator(String path) {
            this.path =path;
        }
    }
}
