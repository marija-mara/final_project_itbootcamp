package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavPage {
    private WebDriver driver;

    public NavPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeLink() {
        return driver.findElement(By.xpath("//a[contains(@href,'/')]"));
    }

    public WebElement getAboutLink() {
        return driver.findElement(By.xpath("//a[contains(@href,'/about')]"));
    }

    public WebElement getMyProfileLink() {
        return driver.findElement(By.xpath("//a[contains(@href,'/profile')]"));
    }

    public WebElement getAdminButton() {
        return driver.findElement(By.xpath("//button[contains(@class,'btn-admin'"));
    }

    public WebElement getCities() {
        return driver.findElement(By.linkText("Cities"));
    }

    public WebElement getUsers() {
        return driver.findElement(By.linkText("Users"));
    }

    public WebElement getSingUpButton() {
        return driver.findElement(By.xpath("//a[contains(@href,'/singup')]"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//a[contains(@href,'/login')]"));
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.xpath("//button[contains(@class, 'btnLogout')]"));
    }

    public WebElement getLanguageButton() {
        return driver.findElement(By.xpath("//button[contains(@class, 'btnLocaleActivation')]"));
    }

    public WebElement getEnButton() {
        return driver.findElement(By.xpath("//div[contains(@class, 'btnEN')]"));
    }

    public WebElement getEsButton() {
        return driver.findElement(By.xpath("//div[contains(@class, 'btnES')]"));
    }

    public WebElement getFrButton() {
        return driver.findElement(By.xpath("//div[contains(@class, 'btnFR')]"));
    }

    public WebElement getCNButton() {
        return driver.findElement(By.xpath("//div[contains(@class, 'btnCN')]"));
    }
}
