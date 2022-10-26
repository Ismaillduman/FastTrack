package Day3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class radioButtons extends BasePage {

   @Before
    public void init(){
       driver.get("http://practice.cybertekschool.com/radio_buttons");}

    @Test
    public void test1() {
       driver.findElement(By.cssSelector("#red")).click();
    }

    @Test
    public void test2() throws InterruptedException {
       List<WebElement> btns = driver.findElements(By.xpath("//input[@type='radio']"));
       for (WebElement btn: btns){
           btn.click();
           Thread.sleep(1000);
       }

    }
}
