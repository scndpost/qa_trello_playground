package listener;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.testng.IReporter;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class TestListener implements ITestListener, IReporter {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("end");
        try {
            Allure.addAttachment("Test failure", new ByteArrayInputStream(Selenide.screenshot(OutputType.BYTES)));
        } catch (NullPointerException ignored) {
            Allure.step("onTestFailure(): Failed to make a screenshot");
        }
    }


}
