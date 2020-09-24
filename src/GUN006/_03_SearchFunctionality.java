package GUN006;

import Utils.MetodDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _03_SearchFunctionality extends MetodDriver {
    /*
          Senaryo ;
          1- Siteyi açınız.
          2- mac kelimeini göndererek aratınız.
          3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.

        */

    @Test
    @Parameters("arananKelime")
    public void searchFunction(String srcText)
    {

        WebElement search=driver.findElement(By.cssSelector("input[name='search']"));
        search.sendKeys(srcText);

        WebElement searchButton=driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> mac=driver.findElements(By.cssSelector("h4>a"));
        for (WebElement w: mac     ) {
            System.out.println(w.getText());
            Assert.assertTrue(w.getText().toLowerCase().contains(srcText));
        }
    }
}
