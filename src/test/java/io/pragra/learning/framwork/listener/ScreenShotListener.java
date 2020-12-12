package io.pragra.learning.framwork.listener;

import io.pragra.learning.framwork.utils.CoreUtils;
import io.pragra.learning.framwork.utils.StatusEnum;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenShotListener  implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        CoreUtils.captureScreenShot(result.getName(), StatusEnum.PASS);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        CoreUtils.captureScreenShot(result.getName(), StatusEnum.FAIL);
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
