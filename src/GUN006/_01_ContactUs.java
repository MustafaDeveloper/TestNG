package GUN006;

import Utils.MetodDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_ContactUs extends MetodDriver {

    //enquiry  id ->  "input-enquiry"

    // submitButtun  "input[class='btn btn-primary']"

    @Test
    @Parameters ("enquiry")
    public void contactUs(String str)
    {
        WebElement contactLink=driver.findElement(By.linkText("Contact Us"));
        contactLink.click();

        WebElement enquiryInput=driver.findElement(By.cssSelector("#input-enquiry"));
        enquiryInput.sendKeys(str);

        WebElement submitButton=driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        submitButton.click();

        WebElement successMessage=driver.findElement(By.cssSelector("#content>p"));
        //System.out.println(content.getText());

        Assert.assertTrue(successMessage.getText().toLowerCase().contains("successfully"));
        System.out.println("Test is successfull...");

       /* WebElement continueButton=driver.findElement(By.cssSelector("a[class='btn btn-primary']"));
        contactLink.click();*/



    }
}
