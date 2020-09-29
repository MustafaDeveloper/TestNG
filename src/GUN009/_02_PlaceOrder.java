package GUN009;

import Utils.MetodDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _02_PlaceOrder extends MetodDriver {

     /*
    Senaryo :
    1- Siteyi açınız.
    2- Sitede "ipod" kelimesini aratınız
    3- Çıkan sonulardan ilkini sepete atınız.
    4- Shopping Chart a tıklatınız.
    5- Checkout yapınız.
    6- Continue butonalarına tıklatıp bilgileri giriniz.
    7- En confirm ile siparişi verdiğinizi doğrulayınız.
       doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
 */

    @Test
    public void Tasks() throws InterruptedException {
        String srcText="ipod";

        WebElement search=driver.findElement(By.cssSelector("input[name='search']"));
        search.sendKeys(srcText);

        WebElement searchButton=driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> itemNameList = driver.findElements(By.xpath("//span[text()='Add to Cart']"));
        itemNameList.get(0).click();


        WebElement totalCart=driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
        totalCart.click();


        WebElement checkOut=driver.findElement(By.xpath("//a[text()='Checkout']"));
        checkOut.click();
/*
        5- Checkout yapınız.
        6- Continue butonalarına tıklatıp bilgileri giriniz.*/
        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement continueBut=driver.findElement(By.cssSelector("input#button-payment-address"));
        continueBut.click();

        WebElement continueBut3=driver.findElement(By.cssSelector("input#button-shipping-address"));
        continueBut3.click();


        WebElement continueBut4=driver.findElement(By.cssSelector("input#button-shipping-method"));
        continueBut4.click();



        WebElement cBox=driver.findElement(By.cssSelector("input[type='checkbox']"));
        cBox.click();

        WebElement continueBut5=driver.findElement(By.cssSelector("input#button-payment-method"));
        continueBut5.click();


        WebElement confirm=driver.findElement(By.cssSelector("input[value='Confirm Order']"));
        confirm.click();

        //value="Confirm Order
        /*        7- En confirm ile siparişi verdiğinizi doğrulayınız.
                doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.

         */


        //p[text()='Your order has been successfully processed!']

        wait.until(ExpectedConditions.urlContains("success"));
        WebElement placedOrder=driver.findElement(By.xpath("//p[text()='Your order has been successfully processed!']"));


        Assert.assertTrue(placedOrder.getText().contains("success"));



    }
}
