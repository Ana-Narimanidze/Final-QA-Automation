package ge.skillwill.qatest.steps.authentication;

import ge.skillwill.qatest.pages.authentication.AuthenticationPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;

public class AuthenticationSteps {

    AuthenticationPage authenticationPage = new AuthenticationPage();

    @Step("Open account overlay")
    public AuthenticationSteps openAccountOverlay() {
        authenticationPage.accountIcon
                .shouldBe(visible)
                .click();

        return this;
    }

    @Step("Click Forgot Password button")
    public AuthenticationSteps clickForgotPassword() {
        authenticationPage.forgotPasswordButton
                .shouldBe(visible)
                .click();

        return this;
    }

    @Step("Enter email: {email}")
    public AuthenticationSteps enterEmail(String email) {
        authenticationPage.emailInput
                .shouldBe(visible)
                .setValue(email);

        return this;
    }

    @Step("Click Send Reset Link button")
    public AuthenticationSteps submitForgotPasswordForm() {
        authenticationPage.submitButton
                .shouldBe(enabled)
                .click();

        return this;
    }

    @Step("Verify success message is displayed")
    public AuthenticationSteps verifySuccessMessageDisplayed() {
        authenticationPage.successMessage
                .shouldBe(visible);

        return this;
    }
}