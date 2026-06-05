package ge.skillwill.qatest.tests.cart;

import ge.skillwill.qatest.base.BaseTest;
import ge.skillwill.qatest.steps.cart.CartSteps;
import ge.skillwill.qatest.utils.Constants;
import ge.skillwill.qatest.utils.TestData;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class InvalidCouponTest extends BaseTest {

    CartSteps cartSteps = new CartSteps();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("TC-10 Coupon Validation")
    @Description("Verify that invalid coupon code displays validation message and discount is not applied")
    public void invalidCouponShouldDisplayValidationMessage() {
        open(Constants.BASE_URL +
                "mistletoe-porcelain-espresso-cups-and-saucers-set-of-two");

        cartSteps
                .addProductToBasket()
                .openCart()
                .applyInvalidCouponAndVerifyMessage(TestData.INVALID_COUPON);
    }
}