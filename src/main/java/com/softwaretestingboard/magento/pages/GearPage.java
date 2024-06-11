package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {

    By productName = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By productNameOnSinglePage = By.xpath("//span[@class='base']");
    By addToCartOnSinglePage = By.xpath("//span[normalize-space()='Add to Cart']");
    By productAddSuccessMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By productNameFromCartPage = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By productQtyFromCartPage = By.xpath("//input[@id='cart-127881-qty']");
    By productPriceFromCartPage = By.xpath("//td[@class='col subtotal']//span[@class='price'][normalize-space()='$45.00']");
    By updateShoppingCartButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");



    public void clickOnProductName(){
        clickOnElement(productName);
    }
    public String getTextOfProductNameOnSinglePage(){
        return getTextFromElement(productNameOnSinglePage);
    }
    public void clickOnAddToCartOnSinglePage(){
        clickOnElement(addToCartOnSinglePage);
    }
    public String getTextOfProductAddSuccessMessage(){
        return getTextFromElement(productAddSuccessMessage);
    }
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }
    public String getTextOfProductNameFromCartPage(){
        return getTextFromElement(productNameFromCartPage);
    }
    public String getTextOfProductQtyFromCartPage(){
        return getTextFromElement(productQtyFromCartPage);
    }
    public String getTextOfProductPriceFromCartPage(){
        return getTextFromElement(productPriceFromCartPage);
    }
    public void clickOnUpdateShoppingCartButton(){
        clickOnElement(updateShoppingCartButton);
    }
}
