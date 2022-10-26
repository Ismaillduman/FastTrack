package Day3;

import org.junit.After;
import org.openqa.selenium.*;
import utilities.Driver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(){
        driver=Driver.get();
        driver.manage().window().maximize();
    }

    @After
    public void closeWindow(){
        driver.close();
    }


}
