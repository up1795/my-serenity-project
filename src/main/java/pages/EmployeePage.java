package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='top-ribbon-menu-items consume-leftover-space']//top-level-menu-item[1]")
    private WebElement employeeElement;

    public EmployeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickEmpList() {
        employeeElement.click();
    }
}
