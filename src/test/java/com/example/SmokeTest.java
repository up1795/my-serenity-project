package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;

public class SmokeTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://upanand17-trials714.orangehrmlive.com/auth/login");
        loginPage = new LoginPage(driver);
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        loginPage.login(username, password);
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"Admin", "a@JBaJ1Ub4"}
        };
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
