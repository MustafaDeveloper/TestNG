package GUN010;

import Gun09._03_PlaceOrderElements;
import Utils.ParameterDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _02_WishListElementsPOM extends ParameterDriver {

    @Test
    @Parameters("itemName")
    public void addToWishList(String itemName) {
        Gun09._03_PlaceOrderElements pacePlaceOrderElements = new _03_PlaceOrderElements(driver);
_02_WishListElements wishListElements=new _02_WishListElements(driver);

                  pacePlaceOrderElements.searchInput.sendKeys("ipod");
        pacePlaceOrderElements.searchButton.click();

        int RundNumber=Tools.RandomNumberGenerator(wishListElements.pruductList.size());

        // Arama sonucu ekrana çıkan ürünlerin listesini aldık

        String wishItemName = wishListElements.pruductList.get(RundNumber).getText(); // bu oluşan numaradaki ürünün adını aldık.

        wishListElements.searchResultWishList.get(RundNumber).click();
        wishListElements.wishListLink.click();
        Tools.ListContainsString(wishListElements.tableNames,wishItemName);

    }
}
