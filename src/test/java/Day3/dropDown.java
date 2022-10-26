package Day3;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropDown extends BasePage {

    @Before
    public void init(){
    driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void test() throws InterruptedException {
        WebElement firstDrop = driver.findElement(By.id("dropdown"));
        Select drop= new Select(firstDrop);
        drop.selectByIndex(2);

        //WebDriverWait wait= new WebDriverWait(driver, 2);
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("dropdown")));

        WebElement jahreDrop = driver.findElement(By.id("year"));
        Select jahreSelect = new Select(jahreDrop);
        jahreSelect.selectByValue("2004");

        Thread.sleep(2000);

        WebElement stateDrop= driver.findElement(By.id("state"));
        Select stateSelect = new Select(stateDrop);
        stateSelect.selectByValue("GA");

       // WebDriverWait wait2 = new WebDriverWait(driver, 2);
        //wait2.until(ExpectedConditions.visibilityOf(stateDrop));
    }
    @Test
    public void test1(){
        WebElement langDrop = driver.findElement(By.name("Languages"));
        Select langSelect = new Select(langDrop);
        System.out.println(langSelect.isMultiple());
        System.out.println(langSelect.getAllSelectedOptions().size());
        langSelect.selectByValue("java");
        langSelect.selectByValue("c#");
        langSelect.selectByValue("python");
        System.out.println(langSelect.getAllSelectedOptions().size());
    }
}
