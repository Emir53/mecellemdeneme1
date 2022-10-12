import com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class TestCases extends BaseTest{


    CommonFunctions commonFunctions;
    LoginScreen loginScreen;
    HomePage homePage;


    @BeforeEach
    public void background() {
        loginScreen = new LoginScreen(driver);
        homePage =new HomePage(driver);


    }


    @Order(1)
    @Test
    public void test0001(){
        Assertions.assertTrue(loginScreen.checkİfLoginPageOpened());
        loginScreen.clickOnLoginPopUp();
        loginScreen.typeEmailAndPassWord("","");
        loginScreen.clickOnLogİnButton();
        Assertions.assertTrue(homePage.checkİfOnHomePage());
    }

    @Order(2)
    @Test
    public void test0002(){
        Assertions.assertTrue(loginScreen.checkİfLoginPageOpened());
        loginScreen.clickOnLoginPopUp();
        loginScreen.typeEmailAndPassWord("","Wrong Email");
        loginScreen.clickOnLogİnButton();
        Assertions.assertTrue(loginScreen.checkifWrongLoginWarningDisplayed());
    }

    @Order(3)
    @Test
    public void test0003(){
        Assertions.assertTrue(loginScreen.checkİfLoginPageOpened());
        loginScreen.clickOnLoginPopUp();
        loginScreen.typeEmailAndPassWord("Wrong Id","");
        loginScreen.clickOnLogİnButton();
        Assertions.assertTrue(loginScreen.checkifWrongLoginWarningDisplayed());
    }

    @Order(4)
    @Test
    public void test0004(){
        test0001();
        homePage.clickOnMuhakematTab();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickOnMahfuzTab();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickOnMukaveleTab();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickOnMuellifTab();
    }

    @Order(5)
    @Test
    public void test0005(){
        test0001();
        homePage.clickOnMuellifTab();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickOnMukaveleTab();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickOnMahfuzTab();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickOnMuhakematTab();


    }














    }