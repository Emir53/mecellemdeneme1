import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends CommonFunctions{
    public HomePage(WebDriver driver) {
        super(driver);
    }


    By homePageLogoMecellemLogo=By.xpath("//h1[normalize-space()='Muhakemat']");

    By homePageMuhakematTab=By.xpath("/html/body/div/div/div[2]/ul[1]/li[2]");
    By homePageMahfuzTab=By.xpath("//*[@id=\"leftCol\"]/ul[1]/li[3]");

    By homePageMukaveleTab=By.xpath("//*[@id=\"leftCol\"]/ul[1]/li[4]");

    By homePageMuellifTab=By.xpath("/html/body/div/div/div[2]/ul[1]/li[5]");
    public boolean checkİfOnHomePage(){
        return isElementDisplayed(homePageMuhakematTab);
    }

    public void clickOnMahfuzTab(){
        clickOnElement(homePageMahfuzTab);
    }



    public void clickOnMuhakematTab(){
        clickOnElement(homePageMuhakematTab);
    }

    public void clickOnMuellifTab(){
        clickOnElement(homePageMuellifTab);
    }

    public void clickOnMukaveleTab(){
        clickOnElement(homePageMukaveleTab);
    }



}
