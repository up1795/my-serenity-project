package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmployeePage;
import pages.LoginPage;

import java.time.Duration;

public class RegressionTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private EmployeePage employeePage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://upanand17-trials714.orangehrmlive.com/auth/login");
        loginPage = new LoginPage(driver);
        employeePage = new EmployeePage(driver);
    }

    @Test
    public void employeeList() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("a@JBaJ1Ub4");
        loginPage.clickLoginButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='top-ribbon-menu-items consume-leftover-space']//top-level-menu-item[1]"))
        );

        employeePage.clickEmpList();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
