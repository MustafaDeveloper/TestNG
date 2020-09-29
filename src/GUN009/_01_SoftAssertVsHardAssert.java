package GUN009;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {

    @Test
    public void hardAssert(){
        String s1="Merhaba";

        System.out.println("assert öncesi");
        Assert.assertEquals("merhaba123",s1);
        System.out.println("kod bitti");

    }

    @Test
    public void softAssert(){
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditPage="www.facebook.com/editaccountpage";

        SoftAssert _softAssert=new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage",strHomePage);
        System.out.println("assert 1");

        _softAssert.assertEquals("www.facebook.com/profile",strCartPage);
        System.out.println("assert 2");

        _softAssert.assertEquals("www.facebook.com/settings",strEditPage);
        System.out.println("assert 3");

        _softAssert.assertAll();
        System.out.println("kod bitti");

    }
}
