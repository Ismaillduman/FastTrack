package Day2;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Methods {

    @Test

    public void clickmethods(){
        Driver.get().get("http://practice.cybertekschool.com/");

        WebElement clickMethod= Driver.get().findElement(By.xpath("//a[@href=\"/abtest\"]"));
        clickMethod.click();

        System.out.println(Driver.get().getCurrentUrl());


    }
    @Test
    public void checkBox(){
        Driver.get().get("http://practice.cybertekschool.com/");
        WebElement clickCheck= Driver.get().findElement(By.xpath("//a[.='Checkboxes']"));
        clickCheck.click();

        Driver.get().findElement(By.cssSelector("#box1")).click();

        System.out.println(Driver.get().getCurrentUrl());

    }
    @Test
    public void searchBox(){
        Driver.get().get("https://www.google.de/?hl=de");
        Driver.get().findElement(By.xpath("//*[.='Alle akzeptieren']")).click();
        Driver.get().findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Herkul");
        Driver.get().findElement(By.xpath("(//*[@class='gNO89b'])[2]")).click();
        System.out.println(Driver.get().getTitle());
    }
}
