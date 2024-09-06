package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmployeePage;
import pages.LoginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RegressionTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @Test
    public void employeeList() {
        driver = new ChromeDriver();
        driver.get("https://upanand17-trials714.orangehrmlive.com/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("a@JBaJ1Ub4");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='top-ribbon-menu-items consume-leftover-space']//top-level-menu-item[1]")));
        element.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
