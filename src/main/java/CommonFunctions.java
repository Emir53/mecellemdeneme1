import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {
    WebDriver driver;
    public CommonFunctions(WebDriver driver){
        this.driver=driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }


    public void clickOnElement(By locator){

        find(locator).click();
    }



    public void typeOnElement(By locator,String text){

        find(locator).sendKeys(text);

    }

    public boolean isElementDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void goBackNTimes(int count){
        for (int i = 0; i <= count; i++) {
            driver.navigate().back();
        }
    }

}