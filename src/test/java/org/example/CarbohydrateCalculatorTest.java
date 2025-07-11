package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class CarbohydrateCalculatorTest extends Base {
    @DataProvider(name = "activityLevels")
    public Object[][] activityLevels() {
        return new Object[][] {
                {"Moderate: exercise 4-5 times/week"}
        };
    }

    @Test(dataProvider = "activityLevels")
    public void testCarbohydrateRecommendation(String activityLevel) {
        driver.get("https://www.calculator.net/carbohydrate-calculator.html");

        CarbohydrateCalculatorPage calculatorPage = new CarbohydrateCalculatorPage(driver);

        // Enter Data : can use new data provide here as well
        calculatorPage.enterUserData("30", "180", "75", activityLevel);
        calculatorPage.clickCalculate(); // click button

        String carbRecommendation = calculatorPage.getCarbRecommendation();

        // Verifying in Terminal though We can do assert as well.
        System.out.println("Activity Level: " + activityLevel);
        System.out.println("Carb Recommendation: " + carbRecommendation);
        System.out.println("---");
    }
}

