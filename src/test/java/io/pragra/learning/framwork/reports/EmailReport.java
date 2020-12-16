package io.pragra.learning.framwork.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.pragra.learning.framwork.utils.CoreUtils;

public class EmailReport {

    private static EmailReport instance;
    private ExtentReports extentReports;

    private EmailReport() {
        extentReports = new ExtentReports();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(CoreUtils.getReportFileName());
        extentReports.attachReporter(htmlReporter);
    }

    public static ExtentTest createTest(String testName) {
        if(instance == null) {
            instance = new EmailReport();
        }
        return instance.extentReports.createTest(testName);
    }

    public static void closeTest() {
        if(instance!=null) {
            instance.extentReports.flush();
        }
    }

}
