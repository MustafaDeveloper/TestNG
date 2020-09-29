package GUN008;

import Utils.MetodDriver;
import Utils.ParameterDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 extends MetodDriver {

    @Test (dataProvider = "getData")
    public void searchFunction(String srcText)
    {

        WebElement search=driver.findElement(By.cssSelector("input[name='search']"));
        search.clear();
        search.sendKeys(srcText);

        WebElement searchButton=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> items=driver.findElements(By.tagName("h4"));
        for (WebElement w: items     ) {
            System.out.println(w.getText());
            Assert.assertTrue(w.getText().toLowerCase().contains(srcText.toLowerCase()));

        }
    }

    @DataProvider
    public Object[] getData(){

        Object[] data={
        "Mac",
        "Samsung"
        };


        return data;
    }




   /* @Test (dataProvider = "getData")
    public void searchFunctionality(String searchItem){

        WebElement searchInput = driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.clear();
        searchInput.sendKeys(searchItem);

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> itemNamesList = driver.findElements(By.tagName("h4"));

        for(WebElement eachElement:itemNamesList){

            System.out.println(eachElement.getText());

            Assert.assertTrue(eachElement.getText().toLowerCase().contains(searchItem.toLowerCase()));
        }
    }

    @DataProvider
    public Object[] getData()
    {
        Object[] data={
                "Mac",
                "Samsung"
        };

        return data;
    }
*/

}
