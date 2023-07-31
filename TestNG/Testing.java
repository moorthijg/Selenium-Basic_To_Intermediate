package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {
    @Test
    public void testing(){
        int a = 50;
        int b = 78;
        int c = a+b;
        System.out.println(c);
        Assert.assertEquals(c,128);
    }
}
