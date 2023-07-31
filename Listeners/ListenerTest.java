package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener, Listeners.ITestListener {
    @Override
    public void Onfinish(ITestContext Result) {

        }
    @Override
    public void onStart(ITestContext Result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult Result) {
        System.out.println("The name of the testcase failed is :"+Result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult Result) {
        System.out.println("The name of the testcase skipped is :"+Result.getName());

    }

    @Override
    public void onTestStart(ITestResult Result) {
        System.out.println("The name of the testcase started  is :"+Result.getName());

    }

    @Override
    public void onTestSuccess(ITestResult Result) {
        System.out.println("The name of the testcase succeeded is :"+Result.getName());

    }

}
