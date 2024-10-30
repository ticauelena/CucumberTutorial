package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagefactory.LoginPage_PF;
import pagefactory.ProductPage_PF;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginSauceSteps_Hooks {
//
//    WebDriver driver = null;
//   LoginPage_PF login;
//   ProductPage_PF product;
//
//    @Before (value = "@smoke", order = 1)
//    public void browserSetup() {
//        System.out.println(" ------------I am inside browserSetup---------------------------");
//           String projectPath =System.getProperty("user.dir");
//           System.out.println("Project path is: " + projectPath);
//        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//
//    @Before (order = 0)
//    public void setup2() {
//        System.out.println(" ------------I am inside setup 2 ---------------------------");
//    }
//
//    @After (order = 1)
//    public void teardown() {
//        System.out.println(" ------------I am inside teardown close---------------------------");
//        driver.close();
//        driver.quit();
//    }
//
//    @After (order = 2)
//    public void teardown2() {
//        System.out.println(" ------------I am inside teardown 2 ---------------------------");
//    }
//
//    @BeforeStep
//    public void beforeSteps() {
//        System.out.println(" ------------I am inside before Steps---------------------------");
//    }
//
//    @AfterStep
//    public void afterSteps() {
//        System.out.println(" ------------I am inside after Steps---------------------------");
//    }
//
//
//    @Given("site is open")
//    public void site_is_open() {
//        System.out.println("Inside Step -site is open");
//    }
//
//    @And("user is on login page")
//    public void user_is_on_login_page() {
//        System.out.println("Inside Step - user is on login page");
//        driver.navigate().to("https://www.saucedemo.com/");
//    }
//
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//        System.out.println("Inside Step - user enters username and password");
//        login = new LoginPage_PF(driver);
//        // id="user-name", password, login-button
//        login.enterUsername(username);
//        login.enterPassword(password);
//        Thread.sleep(5000);
//    }
//
//    @And("clicks to login button")
//    public void clicks_to_login_button() throws InterruptedException {
//        System.out.println("Inside Step - clicks to login button");
//
//        login.clickLogin();
//        Thread.sleep(3000);
//    }
//
//    @Then("the user is navigated to the product page")
//    public void the_user_is_navigated_to_the_product_page() throws InterruptedException {
//        System.out.println("Inside Step - the user is navigated to the product page");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        product = new ProductPage_PF(driver); // inițializează clasa ProductPage_PF
//
//        WebElement productsTitle = wait.until(ExpectedConditions.visibilityOf(product.getProductElement()));
//        if (productsTitle.isDisplayed()) {
//            System.out.println("Elementul 'Products' a fost gasit: " + productsTitle.getText());
//        } else {
//            System.out.println("Elementul 'Products' nu a fost gasit.");
//        }
//    }

}
