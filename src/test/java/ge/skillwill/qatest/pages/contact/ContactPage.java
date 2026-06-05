package ge.skillwill.qatest.pages.contact;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ContactPage {

    private final SelenideElement nameInput =
            $("#customer-name");

    private final SelenideElement emailInput =
            $("#customer-email");

    private final SelenideElement phoneInput =
            $("#customer-telephone");

    private final SelenideElement commentInput =
            $("#customer-comment");

    private final SelenideElement submitButton =
            $("button[type='submit']");

    private final SelenideElement serverErrorMessage =
            $(".NotificationList");

    public void enterName(String name) {
        nameInput.setValue(name);
    }

    public void enterEmail(String email) {
        emailInput.setValue(email);
    }

    public void enterPhone(String phone) {
        phoneInput.setValue(phone);
    }

    public void enterComment(String comment) {
        commentInput.setValue(comment);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public SelenideElement getServerErrorMessage() {
        return serverErrorMessage;
    }
}