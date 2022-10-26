package Day3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.*;

import java.util.concurrent.TimeUnit;

public class Waits extends BasePage{

    @Before
    public void init(){

        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
    }
    @Test
    public void test1() throws InterruptedException {

        Thread.sleep(6000);
        WebElement title = Driver.get().findElement(By.xpath("//div[@id=\"finish\"]/ h4"));
        System.out.println(title.getText());
    }

    @Test
    public void test2(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement title = driver.findElement(By.xpath("//div[@id=\"finish\"]/ h4"));
        System.out.println(driver.getTitle());
    }
    @Test
    public void test3(){

        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//div[@id=\"finish\"]/ h4")));
    }

    @After
    public void close(){
        driver.close();
    }
}
