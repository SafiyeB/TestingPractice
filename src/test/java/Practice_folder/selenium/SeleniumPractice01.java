package Practice_folder.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice01 extends TestBase {

    @Test
    public void test01() {

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='firstname']"));
        jse.executeScript("arguments[0].scrollIntoView()",firstNameInput);
        firstNameInput.sendKeys("Safiye");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Buyukbayraktar");
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-2")).click();
        driver.findElement(By.id("datepicker")).sendKeys("11/26/2021");
        driver.findElement(By.id("profession-0")).click();
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        Select dropDown = new Select(driver.findElement(By.id("continents")));
        dropDown.selectByVisibleText("Europe");
        Select dropDown2 = new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
        dropDown2.selectByIndex(0);
        dropDown2.selectByIndex(1);
        jse.executeScript("window.scrollBy(0,400)");
        driver.findElement(By.id("photo")).sendKeys("C:\\Users\\sa903\\Desktop\\kusresmi.jpeg");
        driver.findElement(By.id("submit")).click();
    }
}
