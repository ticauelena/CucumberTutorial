package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage_PF {
    @FindBy(xpath ="//span[@class='title' and text()='Products']" )
    WebElement name_product;
    WebDriver driver;
    public ProductPage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement getProductElement(){
       return name_product;
    }

}
