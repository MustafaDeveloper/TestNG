package Gun09;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {
    /*
      Hard assert ve Soft assert
      Aralarındaki fark nedir?

      Hard assert fail olduğu anda çalışmayı durdurur.
      Soft assert ise devam eder.
     */


    @Test
    public void hardAssert() {
        String s1 = "Merhaba";

        System.out.println("Hard assert öncesi");
        Assert.assertEquals("Merhaba123", s1); // burada fail oldu.
        System.out.println("Kod bitti.");
    }

    @Test
    public void softAssert()
    {
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";


        SoftAssert _softAssert=new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage", strHomePage);
        System.out.println("assert 1");

        _softAssert.assertEquals("www.facebook.com/profile", strCartPage); // burda fail oluyor
        System.out.println("assert 2");

        _softAssert.assertEquals("www.facebook.com/settings", strEditAccount); // burda tekrar fail oluyor
        System.out.println("assert 3");

        _softAssert.assertAll(); // bütün assertleri aktif ediyor.
        System.out.println("kod bitişi"); // bu bölüm asserAll dan sonra olduğu için ve
                                          // assertlerinde fail olduğundan yukarıda program kesilir.
    }




}
