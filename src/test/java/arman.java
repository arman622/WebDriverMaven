import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class arman {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){
        System.out.println("Hello");
    }

    @org.testng.annotations.Test
    public void doLogin() throws InterruptedException {
        System.out.println("World");

    }

    @AfterSuite
    public void tearDown(){
        System.out.println("!");
    }

}
