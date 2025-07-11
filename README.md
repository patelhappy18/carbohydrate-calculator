# 🧪 Test Automation with Selenium and TestNG  
### *(Carbohydrate Calculator – calculator.net)*

This project automates the testing of the [**Carbohydrate Calculator**](https://www.calculator.net/carbohydrate-calculator.html) using:

- **Selenium WebDriver**
- **TestNG**
- **Page Object Model (POM)** design pattern

---

## 📁 Project Structure

1. src/test/java/: Contains Java src code for the tests.
2. org/example/: Package for test classes and Page Object Model.
3. CarbohydrateCalculatorPage.java: Page Object Model class for interacting with the Carbohydrate Calculator page.
4. CarbohydrateCalculatorTest.java: Test class containing data-driven tests for different activity levels.
5. testng.xml: TestNG configuration file for managing and running test suites.


## ⚙️ Setup Prerequisites

Before running the tests, make sure you have:

1. ✅ Java JDK installed on your system
2. ✅ Selenium WebDriver dependency added to `pom.xml`
3. ✅ TestNG dependency added to `pom.xml`
4. ✅ ChromeDriver installed and compatible with your browser version
5. ✅ Maven or IDE (like IntelliJ/Eclipse) to run the project

## ▶️ How to Run the Test

You can execute tests in two ways:

### 💻 From IntelliJ / Eclipse:
- Right-click `testng.xml` > **Run as TestNG Suite**

### 🧪 From Terminal:
```bash
mvn clean test
```
## 🔑 Key Features

# 🧱 Page Object Model (POM)
Clean separation of test logic from UI locators
Easier to maintain and scale tests
# 📊 Data-Driven Testing
Uses TestNG @DataProvider
Tests multiple activity levels (Sedentary, Light, Moderate, etc.)
Avoids duplication and ensures broad coverage


## 📊 Allure Reporting (Future Scope)

To enhance visibility and diagnostics, Allure Reporting integration is planned.

🔧 Planned Features:
1. 📈 Interactive visual dashboard
2. ✅ Step-by-step breakdown of test execution
3. 📸 Automatic screenshots on failure
4. 📂 History tracking of runs and flaky tests
