package ge.skillwill.qatest.steps.cart;

import ge.skillwill.qatest.pages.cart.CartPage;
import ge.skillwill.qatest.pages.cart.ProductPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;

public class CartSteps {

    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @Step("Verify discounted price is displayed on product page")
    public CartSteps verifyDiscountedPriceOnProductPage() {
        productPage.discountedPrice
                .shouldBe(visible)
                .shouldHave(text("20.50"));
        return this;
    }

    @Step("Add discounted product to basket")
    public CartSteps addProductToBasket() {
        productPage.addToBasketButton
                .shouldBe(visible, enabled)
                .click();
        return this;
    }

    @Step("Verify cart uses original price instead of discounted price")
    public CartSteps verifyCartShowsOriginalPrice() {
        cartPage.miniCartButton
                .shouldBe(visible)
                .click();

        cartPage.cartOverlay
                .shouldBe(visible)
                .shouldHave(text("£30.50"));

        return this;
    }

    @Step("Open cart page")
    public CartSteps openCart() {
        cartPage.miniCartButton
                .shouldBe(visible)
                .click();

        cartPage.cartOverlay
                .shouldBe(visible);

        cartPage.viewCartButton
                .shouldBe(visible, enabled)
                .click();

        return this;
    }

    @Step("Apply invalid coupon and verify validation message")
    public CartSteps applyInvalidCouponAndVerifyMessage(String couponCode) {
        cartPage.couponInput
                .shouldBe(visible)
                .setValue(couponCode);

        cartPage.applyCouponButton
                .shouldBe(visible, enabled)
                .click();

        cartPage.couponErrorMessage
                .shouldBe(visible)
                .shouldHave(text("Coupon Code is invalid"));

        return this;
    }
}