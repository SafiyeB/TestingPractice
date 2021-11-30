package Framework.pages;

import Framework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    public RegistrationPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "id_gender1")
    public WebElement genderMaleRadio;

    @FindBy(id = "id_gender2")
    public WebElement genderFemaleRadio;

    @FindBy(id = "customer_firstname")
    public WebElement firstnameInput;

    @FindBy(id = "customer_lastname")
    public WebElement lastnameInput;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "passwd")
    public WebElement passwordInput;

    @FindBy(id = "days")
    public WebElement daysSelect;

    @FindBy(id = "months")
    public WebElement monthsSelect;

    @FindBy(id = "years")
    public WebElement yearsSelect;

    @FindBy(id = "address1")
    public WebElement addressInput;

    @FindBy(id = "city")
    public WebElement cityInput;

    @FindBy(id = "id_state")
    public WebElement stateSelect;

    @FindBy(id = "postcode")
    public WebElement zipcodeInput;

    @FindBy(id = "id_country")
    public WebElement countrySelect;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhoneInput;

    @FindBy(id = "alias")
    public WebElement aliasInput;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;





}
