package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class singUpPage {
    private WebDriver driver;

    public singUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNameInput() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getPasswordInput() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getConfirmPasswordInput() {
        return driver.findElement(By.id("confirmPassword"));
    }

    public WebElement getSingMeUpButton() {
        return driver.findElement(By.xpath(
                "//button[contains(@class,'v-btn v-btn--contained theme--light v-size--default secondary')]"));
    }
}
