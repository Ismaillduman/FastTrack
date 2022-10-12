package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");


        WebElement IdFlash =  driver.findElement(By.id("flash-messages"));

        System.out.println(IdFlash.getTagName());

        WebElement name = driver.findElement(By.name("viewport"));
        System.out.println(name.getTagName());


        WebElement className= driver.findElement(By.className("list-group"));
        System.out.println(className.getTagName());


        driver.close();



    }
}
