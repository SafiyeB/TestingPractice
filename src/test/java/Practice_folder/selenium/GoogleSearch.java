package Practice_folder.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch {

    @Test
    public void googleSearch() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Amazon" + Keys.ENTER);
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Shopping")).click();

        WebElement redWood = driver.findElement(By.xpath("//a[@role = 'button']//div//span[contains(text(), 'Redwood')]"));
        wait.until(ExpectedConditions.visibilityOf(redWood));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", redWood);


    }
}
