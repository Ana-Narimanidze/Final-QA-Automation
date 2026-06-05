package ge.skillwill.qatest.tests.chat;

import com.codeborne.selenide.Configuration;
import ge.skillwill.qatest.base.BaseTest;
import ge.skillwill.qatest.steps.chat.LiveChatSteps;
import ge.skillwill.qatest.utils.Constants;
import ge.skillwill.qatest.utils.TestData;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LiveChatTest extends BaseTest {

    LiveChatSteps liveChatSteps = new LiveChatSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("TC-09 Live Chat")
    @Description("Verify user can successfully send message via Live Chat")
    public void liveChatShouldSendMessageSuccessfully() {



        open(Constants.BASE_URL + "cart");

        liveChatSteps
                .openLiveChatWidget()
                .verifyWidgetIsDisplayed()
                .fillLiveChatForm(
                        TestData.CHAT_NAME,
                        TestData.CHAT_EMAIL,
                        TestData.CHAT_PHONE,
                        TestData.CHAT_MESSAGE
                )
                .sendMessage()
                .verifyConfirmationMessage();
    }
}