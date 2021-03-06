package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;


public abstract class BasicTest {
    protected WebDriver driver;
    protected String baseUrl = "https://vue-demo.daniel-avellaneda.com";
    protected NavPage navPage;

    protected LoginPage loginPage;


    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        navPage = new NavPage(driver);
        loginPage = new LoginPage(driver);

    }

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterMethod
    public void afterMethod() {
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}