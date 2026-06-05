package ge.skillwill.qatest.steps.chat;

import ge.skillwill.qatest.pages.chat.LiveChatPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.switchTo;

public class LiveChatSteps {

    LiveChatPage liveChatPage = new LiveChatPage();

    @Step("Open live chat widget")
    public LiveChatSteps openLiveChatWidget() {

        liveChatPage.launcherFrame
                .shouldBe(exist);

        switchTo().frame(liveChatPage.launcherFrame);

        liveChatPage.launcherButton
                .shouldBe(visible, enabled)
                .click();

        switchTo().defaultContent();

        liveChatPage.webWidgetFrame
                .shouldBe(exist);

        switchTo().frame(liveChatPage.webWidgetFrame);

        return this;
    }

    @Step("Verify live chat form is displayed")
    public LiveChatSteps verifyWidgetIsDisplayed() {

        liveChatPage.nameInput
                .shouldBe(visible);

        return this;
    }

    @Step("Fill live chat form")
    public LiveChatSteps fillLiveChatForm(
            String name,
            String email,
            String phone,
            String message) {

        liveChatPage.nameInput
                .shouldBe(visible)
                .setValue(name);

        liveChatPage.emailInput
                .shouldBe(visible)
                .setValue(email);

        liveChatPage.phoneInput
                .shouldBe(visible)
                .setValue(phone);

        liveChatPage.messageInput
                .shouldBe(visible)
                .setValue(message);

        return this;
    }


        @Step("Send live chat message")
        public LiveChatSteps sendMessage() {

            liveChatPage.sendButton
                    .scrollIntoView(false)
                    .shouldBe(visible, enabled)
                    .click();

            return this;
        }

    @Step("Verify confirmation message is displayed")
    public LiveChatSteps verifyConfirmationMessage() {

        liveChatPage.successMessage
                .shouldBe(visible)
                .shouldHave(text("Vielen Dank"));

        return this;
    }
}