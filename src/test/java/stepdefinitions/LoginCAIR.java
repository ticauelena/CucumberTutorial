package stepdefinitions;

//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.bytebuddy.asm.Advice;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//

public class LoginCAIR {

//    WebDriver driver = null;
//
//    @Given("CAIR site is open")
//    public void CAIR_site_is_open() {
//        System.out.println("Inside Step - CAIR site is open");
//
//        String projectPath = System.getProperty("user.dir");
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
//        driver.navigate().to("https://qa-cas.amsoft-group.com/login?service=https%3A%2F%2Fqa-platform-portal.amsoft-group.com%2Flogin%2Fcas");
//    }
//
//    @When("user enters username and password")
//    public void user_enters_username_and_password() throws InterruptedException {
//        System.out.println("Inside Step - user enters username and password");
//
//        // id="user-name", password, login-button
//        driver.findElement(By.id("username")).sendKeys("eticau");
//        driver.findElement(By.id("password-mask")).sendKeys("AnaBell489");
//        Thread.sleep(3000);
//    }
//
//    @And("clicks to invalidate previous session checkbox")
//    public void clicks_to_invalidate_previous_session_checkbox() throws InterruptedException {
//        System.out.println("Inside Step - clicks to invalidate previous session checkbox");
//
//        driver.findElement(By.id("invalidate")).click();
//        Thread.sleep(3000);
//    }
//
//    @And("clicks to login button")
//    public void clicks_to_login_button() throws InterruptedException {
//        System.out.println("Inside Step - clicks to login button");
//
//        driver.findElement(By.name("submitBtn")).click();
//        Thread.sleep(3000);
//    }
//
//    @Then("the user is navigated to the product page")
//    public void the_user_is_navigated_to_the_product_page() throws InterruptedException {
//        System.out.println("Inside Step - the user is navigated to the product page");
//
//        WebElement homeButton = driver.findElement(By.id("tab-1015-btnInnerEl"));
//        Thread.sleep(5000);
//        if (homeButton.isDisplayed()) {
//            System.out.println("Cair este deschis: " + homeButton.getText());
//        } else {
//            System.out.println("Cair nu a este deschis.");
//        }
//        driver.close();
//        driver.quit();
//    }
//
}
