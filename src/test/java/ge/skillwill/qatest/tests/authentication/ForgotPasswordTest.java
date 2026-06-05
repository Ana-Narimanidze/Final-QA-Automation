package ge.skillwill.qatest.tests.authentication;

import com.codeborne.selenide.Selenide;
import ge.skillwill.qatest.base.BaseTest;
import ge.skillwill.qatest.steps.authentication.AuthenticationSteps;
import ge.skillwill.qatest.utils.Constants;
import ge.skillwill.qatest.utils.TestData;
import io.qameta.allure.*;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

import static com.codeborne.selenide.Selenide.open;

public class ForgotPasswordTest extends BaseTest {

    AuthenticationSteps authenticationSteps = new AuthenticationSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("TC-02 Forgot Password Email Not Received")
    @Description("Verify that Forgot Password displays confirmation message but password reset email is not received")
    public void forgotPasswordShouldDisplayMessageAfterSubmittingEmail() {

        open(Constants.BASE_URL);

        authenticationSteps
                .openAccountOverlay()
                .clickForgotPassword()
                .enterEmail(TestData.EMAIL)
                .submitForgotPasswordForm()
                .verifySuccessMessageDisplayed();

        Allure.addAttachment(
                "Forgot Password success screenshot",
                new ByteArrayInputStream(
                        Selenide.screenshot(OutputType.BYTES)
                )
        );
    }
}