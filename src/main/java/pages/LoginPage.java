package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private final WebDriver driver;

    @FindBy(id = "txtUsername")
    private WebElement usernameElement;

    @FindBy(id = "txtPassword")
    private WebElement passwordElement;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButtonElement;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButtonElement.click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}
