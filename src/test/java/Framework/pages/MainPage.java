package Framework.pages;

import Framework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@id='search_query_top']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@class='login']")
    public WebElement logIn;




}
