package GUN008;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_Giris {

    @Test(dataProvider ="getData")
    public void UsernameTest(String username, String password){
        System.out.println(username+" "+password);
    }


    @DataProvider
    public Object[][] getData()
    {
        Object[][] data={
                {"ahmet","abc"},
                {"ayse","xyz"},
                {"mehmet","bcd"}
        };
        return data;
    }

}
