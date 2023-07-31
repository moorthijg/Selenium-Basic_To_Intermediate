package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verify_ {


    @Test
    public void verification(){
        SoftAssert sf = new SoftAssert();
        sf.fail("failed first case");

        int a = 2;
        int b = 3;
        int c = a+b;
        sf.assertEquals(5,c);
    }
}
// executing the above code first test is wanted ly failed and the second test case is correct : and it is executed without failing
//which is the difference between verify and Assert in selenium.
// we might require the test method to continue execution even after the failure of the assertion statements.
// In TestNG, Verify is implemented using SoftAssert class.
// if we  need to use verify we need to use SoftAssert class for executing soft assertions.
