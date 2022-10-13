package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumLocators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");


//        WebElement IdFlash =  driver.findElement(By.id("flash-messages"));
//
//        System.out.println(IdFlash.getTagName());
//
//        WebElement name = driver.findElement(By.name("viewport"));
//        System.out.println(name.getTagName());
//
//
//        WebElement className= driver.findElement(By.className("list-group"));
//        System.out.println(className.getTagName());
//
//        List <WebElement> classNames = driver.findElements(By.className("list-group-item"));
//
//        System.out.println(classNames.size());

//WebElement tagNamne = driver.findElement(By.tagName("a"));
//
//        System.out.println(tagNamne.getTagName());
//
//        WebElement linkText = driver.findElement(By.linkText("A/B Testing"));
//        System.out.println(linkText.getText());
//        System.out.println(linkText.getTagName());

        WebElement PartialLinkText = driver.findElement(By.partialLinkText("A/B "));
        System.out.println(PartialLinkText.getText());
        System.out.println(PartialLinkText.getTagName());
        driver.close();



    }
}
