import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginScreen extends CommonFunctions{
    public LoginScreen(WebDriver driver) {
        super(driver);
    }



    By loginPageAsserterİMG=By.xpath("//img[@src='/auth/resources/csmvs/login/mecellem/assets/images/mecellem-logo-gri.svg']");


   By loginPageUserNameBox=By.xpath("//input[@id='input-usr']");
   By loginPopUp=By.xpath("//a[contains(text(),'LOG IN')]");
   By loginPagePasswordBox=By.xpath("//input[@id='input-pwd']");
   By loginPageLogİnButton=By.xpath("//span[contains(text(),'Oturum aç')]");

   By loginPageIncorrectEmailOrPasswordError=By.xpath("(//li[contains(text(),'Geçersiz kullanıcı adı veya şifre.')])[2]");

   By loginPageFirstMainLogo=By.xpath("//img[@id='mainLogo']");
    public boolean checkİfOnLoginPage(){

        return isElementDisplayed(loginPageAsserterİMG);
    }


    public void typeEmailAndPassWord(String email,String password){

        typeOnElement(loginPageUserNameBox,email);
        typeOnElement(loginPagePasswordBox,password);
    }


    public void clickOnLogİnButton(){
        clickOnElement(loginPageLogİnButton);
    }

    public boolean checkifWrongLoginWarningDisplayed(){
        return isElementDisplayed(loginPageIncorrectEmailOrPasswordError);
    }


    public void clickOnLoginPopUp(){

        clickOnElement(loginPopUp);
    }

    public boolean checkİfLoginPageOpened(){
        return isElementDisplayed(loginPageFirstMainLogo);
    }







}
