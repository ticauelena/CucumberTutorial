package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class LoginCAIR {

    WebDriver driver = null;

    @Given("HRMS is open")
    public void HRMS_is_open() {
        System.out.println("Inside Step - HRMS is open");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is: " + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Inside Step - user is on login page");
        driver.navigate().to("https://qa-cas.amsoft-group.com/login?service=https%3A%2F%2Fqa-healthrms.amsoft-group.com%2Flogin%2Fcas");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        System.out.println("Inside Step - user enters username and password");

        // id="user-name", password, login-button
        driver.findElement(By.id("username")).sendKeys("eticau");
        driver.findElement(By.id("password-mask")).sendKeys("Beladona*89");
        Thread.sleep(3000);
    }

    @And("clicks to invalidate previous session checkbox")
    public void clicks_to_invalidate_previous_session_checkbox() throws InterruptedException {
        System.out.println("Inside Step - clicks to invalidate previous session checkbox");

        driver.findElement(By.id("invalidate")).click();
        Thread.sleep(1000);
    }

    @And("clicks to login button")
    public void clicks_to_login_button() throws InterruptedException {
        System.out.println("Inside Step - clicks to login button");

        driver.findElement(By.name("submitBtn")).click();
        Thread.sleep(3000);
    }

    @Then("the user is logged in HRMS")
    public void the_user_is_logged_in_HRMS() {
        System.out.println("Inside Step - the user is logged in HRMS");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement logoutButton = driver.findElement(By.id("ext-gen35"));
        if (logoutButton.isDisplayed()) {
            System.out.println("HRMS is open: " + logoutButton.getText());
        } else {
            System.out.println("HRMS is open: ");
        }
    }

    @When("user click on logout  button")
    public void user_click_on_logout_button() throws InterruptedException {

        driver.findElement(By.id("ext-gen35")).click();
        Thread.sleep(3000);
    }
    @Then("the page should be logout page")
    public void the_page_should_be_logout_page() {
        System.out.println("Inside Step - the page should be login page");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement logoutPage = driver.findElement(By.name("submitBtn"));
        if (logoutPage.isDisplayed()) {
            System.out.println("The user is on the 'Logout' page" + logoutPage.getText());
        } else {
            System.out.println("The user is not on the 'Logout' page");
        }
        driver.quit();
    }


}
