package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By sizeSelect = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By blackColor = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By productAddedSuccessMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By shoppingCartText = By.xpath("//span[@class='base']");
    By productNameInCartPage = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productSizeInCartPage = By.xpath("//dd[contains(text(),'32')]");
    By productColorInCartPage = By.xpath("//dd[contains(text(),'Black')]");


    public void mouseHoverOnCronusYogaPant(){
        mouseHoverToElement(cronusYogaPant);
    }
    public void clickOnSize(){
        clickOnElement(sizeSelect);
    }
    public void clickOnBlackColor(){
        clickOnElement(blackColor);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String getTextFromProductAddedSuccessMessage(){
        return getTextFromElement(productAddedSuccessMessage);
    }
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String getProductNameInCartPageText(){
        return getTextFromElement(productNameInCartPage);
    }
    public String getProductSizeInCartPageText(){
        return getTextFromElement(productSizeInCartPage);
    }
    public String getProductColorInCartPageText(){
        return getTextFromElement(productColorInCartPage);
    }

}
