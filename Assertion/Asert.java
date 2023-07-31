package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asert {
    @Test
    public void assertionTest(){

        //Assertion Passing
        Assert.assertEquals(3, 1 + 2);
        System.out.println("Passing 1");

        //Assertion failing
        Assert.fail("Failing second assertion");
        System.out.println("Failing 2");

        //Assertion again pass
        Assert.assertEquals(6, 1 + 5);
        System.out.println("passing 3");
    }
}
// as we can see the first and third cases are true and the second case only false so if the second case is passed the third case
// will be executed , since the second case is become failure third case is even didn't't execute  and the test became failed.