package GUN008;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_Giris {

    @Test(dataProvider ="getData")
    public void LoginTest(String username)
    {
        System.out.println(username);
    }


    @DataProvider
    public Iterator<Object> getData()
    {
        List<Object> data=new ArrayList<>();

        data.add("ahmet");
        data.add("ayse");
        data.add("mehmet");
        data.add("fatma");

        return data.iterator();
    }

    /*************************************************/

    @Test(dataProvider ="getData2")
    public void LoginTest2(String username,String password)
    {
        System.out.println(username+" "+password);
    }


    @DataProvider
    public Iterator<Object[]> getData2()
    {
        List<Object[]> data=new ArrayList<>();

        data.add(new Object[]{"ahmet","xyz"});
        data.add(new Object[]{"ayse","abc"});
        data.add(new Object[]{"mehmet","bcd"});



        return data.iterator();
    }
}
