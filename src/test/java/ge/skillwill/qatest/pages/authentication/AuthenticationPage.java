package ge.skillwill.qatest.pages.authentication;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AuthenticationPage {

    public SelenideElement accountIcon =
            $("button[aria-label='Open my account']");

    public SelenideElement forgotPasswordButton =
            $$("button").findBy(text("Forgot password?"));

    public SelenideElement emailInput =
            $$("form input").findBy(visible);

    public SelenideElement submitButton =
            $$("button").findBy(text("SEND RESET LINK"));

    public SelenideElement successMessage =
            $("article[aria-labelledby='forgot-password-success']");
}