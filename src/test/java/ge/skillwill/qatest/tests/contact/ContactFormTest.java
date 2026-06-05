package ge.skillwill.qatest.tests.contact;

import com.codeborne.selenide.Selenide;
import ge.skillwill.qatest.base.BaseTest;
import ge.skillwill.qatest.steps.contact.ContactSteps;
import ge.skillwill.qatest.utils.Constants;
import ge.skillwill.qatest.utils.TestData;
import io.qameta.allure.*;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

import static com.codeborne.selenide.Selenide.open;

public class ContactFormTest extends BaseTest {

    ContactSteps contactSteps = new ContactSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("TC-01 Contact Form Bug")
    @Description("Verify that Contact Form displays Internal server error after submitting valid data")
    public void contactFormShouldDisplayInternalServerError() {

        open(Constants.BASE_URL + "contacts");

        contactSteps.fillContactForm(
                TestData.NAME,
                TestData.EMAIL,
                TestData.PHONE,
                TestData.MESSAGE
        );

        contactSteps.submitForm();

        Allure.addAttachment(
                "Screenshot after submit",
                new ByteArrayInputStream(
                        Selenide.screenshot(OutputType.BYTES)
                )
        );

        Assert.assertTrue(
                contactSteps.getServerErrorMessage()
                        .contains("Internal server error"),
                "Internal server error message was not displayed"
        );
    }
}