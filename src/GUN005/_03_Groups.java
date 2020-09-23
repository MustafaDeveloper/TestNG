package GUN005;

import org.testng.annotations.Test;

public class _03_Groups {

    @Test(groups = "Regression")
    public void Test1(){ System.out.println("Test 1 Regression"); }

    @Test(groups = "Regression")
    public void Test2(){ System.out.println("Test 2 Regression"); }

    @Test(groups = "Regression")
    public void Test7(){ System.out.println("Test 7 Regression"); }

    @Test(groups = "Regression")
    public void Test5(){ System.out.println("Test 5 Regression"); }

    @Test(groups = "SmokeTest")
    public void Test3(){ System.out.println("Test 3 SmokeTest"); }

    @Test(groups = "SmokeTest")
    public void Test4(){ System.out.println("Test 4 SmokeTest"); }

    @Test
    public void Test6(){ System.out.println("Test 6"); }

}
