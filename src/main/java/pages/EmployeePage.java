package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeePage {
    private static WebDriver driver;

   /* public EmployeePage(WebDriver driver) {
        this.driver = driver;
    }*/

    public static void clickEmpList(WebDriver driver) {
        WebElement employeeElement =  driver.findElement(By.xpath("//div[@class='top-ribbon-menu-items consume-leftover-space']//top-level-menu-item[1]"));
        employeeElement.click();
    }
}
