package Framework.stepdef;

import Framework.pages.LoginPage;
import Framework.pages.MainPage;
import Framework.pages.MyAccountPage;
import Framework.pages.RegistrationPage;
import Framework.utilities.ConfigReader;
import Framework.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationStepdef {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();
    RegistrationPage registrationPage = new RegistrationPage();
    MyAccountPage myAccountPage = new MyAccountPage();


    @Given("user is on main page")
    public void user_is_on_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @Given("click on sign in button")
    public void click_on_sign_in_button() {
        mainPage.logIn.click();

    }

    @Given("enter email address to registration field")
    public void enter_email_address_to_registration_field() {
        loginPage.registereMail.sendKeys(faker.internet().emailAddress());

    }

    @Given("click on create an account button")
    public void click_on_create_an_account_button() {
        loginPage.createAnAccount.click();
    }

    @Given("choose title")
    public void choose_title() {
        registrationPage.genderFemaleRadio.click();
    }

    @Given("enter firstname")
    public void enter_firstname() {
        registrationPage.firstnameInput.sendKeys(faker.name().firstName());
    }

    @Given("enter lastname")
    public void enter_lastname() {
        registrationPage.lastnameInput.sendKeys(faker.name().lastName());
    }


    @Given("enter password")
    public void enter_password() {
        registrationPage.passwordInput.sendKeys(faker.internet().password());
    }

    @Given("select date of birth")
    public void select_date_of_birth() {
        Select daysSelect = new Select(registrationPage.daysSelect);
        Select monthsSelect = new Select(registrationPage.monthsSelect);
        Select yearsSelect = new Select(registrationPage.yearsSelect);
        daysSelect.selectByValue("6");
        monthsSelect.selectByIndex(7);
        yearsSelect.selectByValue("1973");


    }

    @Given("enter address")
    public void enter_address() {
        registrationPage.addressInput.sendKeys(faker.address().fullAddress());

    }

    @Given("enter city")
    public void enter_city() {
        registrationPage.cityInput.sendKeys(faker.address().city());
    }

    @Given("select state")
    public void select_state() {
        Select stateSelect = new Select(registrationPage.stateSelect);
        stateSelect.selectByIndex(15);
    }

    @Given("enter zipcode")
    public void enter_zipcode() {
        registrationPage.zipcodeInput.sendKeys("11767");
    }

    @Given("select country")
    public void select_country() {
        Select countrySelect = new Select(registrationPage.countrySelect);
        countrySelect.selectByValue("21");

    }

    @Given("enter mobile phone")
    public void enter_mobile_phone() {
        registrationPage.mobilePhoneInput.sendKeys(faker.phoneNumber().cellPhone());
    }

    @Given("enter address alias")
    public void enter_address_alias() {
        registrationPage.aliasInput.sendKeys("a");
    }

    @Given("click on register button")
    public void click_on_register_button() {
        registrationPage.registerButton.click();
    }

    @Then("verify that my account text is visible")
    public void verify_that_my_account_text_is_visible() {
        Assert.assertEquals("MY ACCOUNTsss",myAccountPage.myAccountHeading.getText());
    }

}
