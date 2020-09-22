package GUN004;

import Utils.MetodDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class _02_AddressFunctionality extends MetodDriver {

    @Test
    void Addressbook() throws InterruptedException {

        WebElement addressBook=driver.findElement(By.linkText("Address Book"));
        addressBook.click();;

        WebElement NewAddressButton= driver.findElement(By.linkText("New Address"));
        NewAddressButton.click();

        WebElement firstname=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstname.sendKeys("ali");

        WebElement lastname=driver.findElement(By.cssSelector("input[name='lastname']"));
        lastname.sendKeys("ddd");

        WebElement company=driver.findElement(By.cssSelector("input[name='company']"));
        company.sendKeys("XXX & FFF");

        WebElement address_1=driver.findElement(By.cssSelector("input[name='address_1']"));
        address_1.sendKeys("england");

        WebElement city=driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Manceyster");

        WebElement postcode=driver.findElement(By.cssSelector("input[name='postcode']"));
        address_1.sendKeys("12346");

        WebElement inputAddress2= driver.findElement(By.id("input-address-2"));
        inputAddress2.sendKeys("RG1 5BJ");

        WebElement inputCity= driver.findElement(By.id("input-city"));
        inputCity.sendKeys("Reading");

        WebElement inputProstCode= driver.findElement(By.id("input-postcode"));
        inputProstCode.sendKeys("12345");

        WebElement selectCountry= driver.findElement(By.id("input-country"));

        Tools.selectByIndex(selectCountry);

        WebDriverWait bekle=new WebDriverWait(driver, 10);

        By stateOptions = By.xpath("//select[@id='input-zone']/option");
        bekle.until(ExpectedConditions.numberOfElementsToBeMoreThan(stateOptions,1));

        Thread.sleep(1000);

        WebElement selectState= driver.findElement(By.id("input-zone"));
        Tools.selectByIndex(selectState);

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation(driver);

    }

    @Test(dependsOnMethods = {"Addressbook"})
    void EditTest()
    {

        WebElement addressBook=driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> editAddress=driver.findElements(By.cssSelector("a[class='btn btn-info']"));

        editAddress.get(editAddress.size()-1).click();

        WebElement firstname=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstname.clear();
        firstname.sendKeys("hasan");

        WebElement lastname=driver.findElement(By.cssSelector("input[name='lastname']"));
        lastname.clear();
        lastname.sendKeys("ee ee");

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation(driver);

    }

    @Test(dependsOnMethods = {"EditTest"})
    void DeleteTest()
    {


        WebElement addressBook=driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> delete=driver.findElements(By.cssSelector("a[class='btn btn-danger']"));

        delete.get(delete.size()-1).click();

        Tools.successMessageValidation(driver);
    }

}
