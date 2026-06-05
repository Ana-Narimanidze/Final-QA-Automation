package ge.skillwill.qatest.tests.cart;

import ge.skillwill.qatest.base.BaseTest;
import ge.skillwill.qatest.steps.cart.CartSteps;
import ge.skillwill.qatest.utils.Constants;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DiscountedProductCartTest extends BaseTest {

    CartSteps cartSteps = new CartSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("TC-03 Discounted Product Cart Bug")
    @Description("Verify that cart uses original price instead of discounted price")
    public void discountedProductShouldBeAddedToCartWithOriginalPrice() {

        open(Constants.BASE_URL +
                "mistletoe-porcelain-espresso-cups-and-saucers-set-of-two");

        cartSteps
                .verifyDiscountedPriceOnProductPage()
                .addProductToBasket()
                .verifyCartShowsOriginalPrice();
    }
}