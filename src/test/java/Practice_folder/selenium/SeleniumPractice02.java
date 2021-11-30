package Practice_folder.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumPractice02 extends TestBase {

    @Test
    public void test02() throws InterruptedException {
        driver.get("http://www.seleniumframework.com/Practiceform/");
        driver.manage().window().maximize();
        String a = driver.getWindowHandle();

        driver.findElement(By.id("button1")).click();
        for (String w : driver.getWindowHandles()) {
            driver.switchTo().window(w);
        }

        driver.close();
        driver.switchTo().window(a);
        jse.executeScript("window.scrollBy(0,300)");
        //System.out.println(a);

        driver.findElement(By.xpath("//button[@onclick='newMsgWin()']")).click();
        for (String w : driver.getWindowHandles()) {
            driver.switchTo().window(w);


        }

        driver.close();
        driver.switchTo().window(a);
        jse.executeScript("window.scrollBy(0,300)");

        //button[@onclick='newMsgWin()']

        driver.findElement(By.id("alert")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.id("timingAlert")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        WebElement dragElement = driver.findElement(By.id("draga"));
        Thread.sleep(3000);
        WebElement targetElement  =driver.findElement(By.id("dragb"));
        Thread.sleep(3000);
        actions.dragAndDrop(dragElement,targetElement).build().perform();

        WebElement doubleClick = driver.findElement(By.id("doubleClick"));
        actions.doubleClick(doubleClick).perform();


    }


}
