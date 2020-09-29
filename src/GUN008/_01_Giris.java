package GUN008;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_Giris {

    @Test(dataProvider ="getData")
    public void UsernameTest(String username){
        System.out.println(username);
    }


    @DataProvider
    public Object[] getData()
    {
        Object[] data={
                "ahmet",
                "ayse",
                "mehmet",
                "fatma"
        };
        return data;
    }
    /***************************************************/

    @Test(dataProvider ="UsersDataProvider")
    public void UsernameTest2(String username){
        System.out.println(username);
    }


    @DataProvider (name="UsersDataProvider")
    public Object[] getData2()
    {
        Object[] data={
                "ahmet2",
                "ayse2",
                "mehmet2",
                "fatma2"
        };
        return data;
    }
}
