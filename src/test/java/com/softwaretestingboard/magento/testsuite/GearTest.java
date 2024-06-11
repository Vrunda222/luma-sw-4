package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        //* Mouse Hover on Gear Menu
        homePage.mouseHoverOnGearMenu();
        //* Click on Bags
        homePage.clickOnBagsSubMenu();
        //* Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnProductName();
        //* Verify the text ‘Overnight Duffle’
        Assert.assertEquals(gearPage.getTextOfProductNameOnSinglePage(), "Overnight Duffle");
        //* Change Qty 3

        //* Click on ‘Add to Cart’ Button.
        gearPage.clickOnAddToCartOnSinglePage();
        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(gearPage.getTextOfProductAddSuccessMessage(), "You added Overnight Duffle to your shopping cart.");
        //* Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCartLink();
        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(gearPage.getTextOfProductNameFromCartPage(), "Overnight Duffle");
        //* Verify the Qty is ‘3’
        Assert.assertEquals(gearPage.getTextOfProductQtyFromCartPage(), "3");
        //* Verify the product price ‘$135.00’
        Assert.assertEquals(gearPage.getTextOfProductPriceFromCartPage(), "$135.00");
        //* Change Qty to ‘5’

        //* Click on ‘Update Shopping Cart’ button
        gearPage.clickOnUpdateShoppingCartButton();
        //* Verify the product price ‘$225.00’
        Assert.assertEquals(gearPage.getTextOfProductPriceFromCartPage(), "$225.00");
    }
}
