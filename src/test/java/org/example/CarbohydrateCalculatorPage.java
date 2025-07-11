package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class CarbohydrateCalculatorPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    // all the elements finding with locators
    private final By ageField = By.id("cage");
    private final By heightField = By.id("cheightmeter");
    private final By weightField = By.id("ckg");
    private final By activityLevelDropdown = By.id("cactivity");
    private final By calculateButton = By.cssSelector("input[value='Calculate']");
    private final By resultField = By.cssSelector("p.bigtext");

    public CarbohydrateCalculatorPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // enter data in form of calculator
    public void enterUserData(String age, String height, String weight, String activityLevel) {
        driver.findElement(ageField).clear();
        driver.findElement(heightField).clear();
        driver.findElement(weightField).clear();

        driver.findElement(ageField).sendKeys(age);
        driver.findElement(heightField).sendKeys(height);
        driver.findElement(weightField).sendKeys(weight);

        Select select = new Select(driver.findElement(activityLevelDropdown));
        select.selectByVisibleText(activityLevel);
    }

    // Calculate button
    public void clickCalculate() {
        driver.findElement(calculateButton).click();
    }

    public String getCarbRecommendation() {
        WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(resultField));
        return result.getText();
    }
}

