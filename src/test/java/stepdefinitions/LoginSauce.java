package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class LoginSauce {

//    WebDriver driver = null;
//
//    @Given("site is open")
//    public void site_is_open() {
//        System.out.println("Inside Step -site is open");
//        String projectPath =System.getProperty("user.dir");
//        System.out.println("Project path is: " + projectPath);
//        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
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
//
//        // id="user-name", password, login-button
//        driver.findElement(By.id("user-name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(5000);
//    }
//
//    @And("clicks to login button")
//    public void clicks_to_login_button() throws InterruptedException {
//        System.out.println("Inside Step - clicks to login button");
//
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(3000);
//    }
//
//    @Then("the user is navigated to the product page")
//    public void the_user_is_navigated_to_the_product_page() throws InterruptedException {
//        System.out.println("Inside Step - the user is navigated to the product page");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement productsTitle = driver.findElement(By.xpath("//span[@class='title' and text()='Products']"));
//        if (productsTitle.isDisplayed()) {
//            System.out.println("Elementul 'Products' a fost gasit: " + productsTitle.getText());
//        } else {
//            System.out.println("Elementul 'Products' nu a fost gasit.");
//        }
//        //driver.close();
//        driver.quit();
//    }

}
