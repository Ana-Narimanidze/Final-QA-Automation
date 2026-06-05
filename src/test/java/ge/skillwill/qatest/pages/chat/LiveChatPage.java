package ge.skillwill.qatest.pages.chat;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LiveChatPage {

    public SelenideElement launcherFrame =
            $("iframe#launcher");

    public SelenideElement webWidgetFrame =
            $("iframe#webWidget");

    public SelenideElement launcherButton =
            $("button[data-testid='launcher']");

    public SelenideElement liveChatWidget =
            $("main[data-testid='scroll-container-content']");

    public SelenideElement nameInput =
            $("input[name='name']");

    public SelenideElement emailInput =
            $("input[name='email']");

    public SelenideElement phoneInput =
            $("input[name='phone']");

    public SelenideElement messageInput =
            $("textarea[name='message']");

    public SelenideElement sendButton =
            $("button[data-testid='button-ok']");

    public SelenideElement successMessage =
            $("main[data-testid='scroll-container-content']");
}