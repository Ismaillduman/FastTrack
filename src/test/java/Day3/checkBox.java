package Day3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class checkBox extends BasePage{

    @Before
    public void init(){

        driver.get("http://practice.cybertekschool.com/checkboxes");
    }
    @Test
    public void test1() throws InterruptedException {

        //WebElement box1= driver.findElement(By.cssSelector("#box1"));
        //box1.click();

        WebElement box2= driver.findElement(By.cssSelector("#box2"));
        box2.click();
        Thread.sleep(1000);
    }
}
