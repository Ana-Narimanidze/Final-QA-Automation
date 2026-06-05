package ge.skillwill.qatest.pages.cart;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    public SelenideElement discountedPrice =
            $("span[itemprop='lowPrice']");

    public SelenideElement addToBasketButton =
            $("button.ProductActions-AddToCart");
}