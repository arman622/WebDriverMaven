import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;

public class LoginTest {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\arman\\IdeaProjects\\SeleniumLearning\\downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @org.testng.annotations.Test
    public void doLogin() throws InterruptedException {
        driver.get("http://gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("armanthaque@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("assakldja");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        Thread.sleep(3000);
    }


    @AfterSuite
    public void tearDown(){
        driver.quit();
    }




}
