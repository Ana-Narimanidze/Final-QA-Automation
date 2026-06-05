package ge.skillwill.qatest.pages.cart;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    public SelenideElement miniCartButton =
            $("button.Header-Button_type_minicart");

    public SelenideElement cartOverlay =
            $(".CartOverlay_isVisible");

    public SelenideElement viewCartButton =
            $(".CartOverlay-Actions a");

    public SelenideElement couponInput =
            $("#couponCode");

    public SelenideElement applyCouponButton =
            $("button.CartCoupon-Button");

    public SelenideElement couponErrorMessage =
            $(".NotificationList");
}