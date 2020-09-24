package GUN006;

import Utils.MetodDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _02_Specials extends MetodDriver {
    /*
            Senaryo-2
            1- Siteye gidiniz
            2- Specials tiklayiniz
            3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz

         */

    @Test
            public void specials() {
        WebElement specials = driver.findElement(By.linkText("Specials"));
        specials.click();

        List<WebElement> oldAmount=driver.findElements(By.xpath("//span[@class='price-old']"));
        List<WebElement> item=driver.findElements(By.cssSelector("div.product-thumb"));

        Assert.assertTrue(oldAmount.size()==item.size());
    }
}
