package Day1;

<<<<<<< HEAD
public class SeleniumMethods {
=======
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.google.de/?hl=de");
        driver.manage().window().maximize();


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://medium.com/kodcular/polymorphism-nedir-a10070eafe67");
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.close();
    }
>>>>>>> 8becd25 (SeleniumMethods)
}
