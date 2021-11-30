package Practice_folder.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablePractice extends TestBase{

@Test
    public void webTablesPractice(){
    driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
    driver.manage().window().maximize();
    WebElement tableTotal = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tfoot//td"));
    Assert.assertTrue(tableTotal.getText().contains("4"));

    List<WebElement> tableBodyList = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr"));

    Assert.assertEquals(4,tableBodyList.size());

    WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
    for (WebElement w : tableBodyList)
          {
              System.out.println(w.getText());

    }

    WebElement burjKh = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody//tr[1]"));
    List<WebElement> heightList = burjKh.findElements(By.xpath("td"));
    for (WebElement w : heightList)
    {
        System.out.println(w.getText());

    }

    Assert.assertTrue(heightList.stream().anyMatch(t->t.getText().equals("829m")));

WebElement lastRowHeading = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tfoot//th"));
List<WebElement> lastRowData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tfoot//td"));
lastRowData.add(lastRowHeading);

Assert.assertEquals(2,lastRowData.size());




}








    //table[@class='tsc_table_s13']
}
