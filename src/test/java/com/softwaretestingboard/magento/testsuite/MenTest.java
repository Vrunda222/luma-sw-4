package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //* Mouse Hover on Men Menu
        homePage.mouseHoverOnMenMenu();
        //* Mouse Hover on Bottoms
        homePage.mouseHoverOnBottomSubMenu();
        //* Click on Pants
        homePage.clickOnPantsSubMenu();
        Thread.sleep(3000);
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnSize();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnBlackColor();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnAddToCart();
        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(menPage.getTextFromProductAddedSuccessMessage(), "You added Cronus Yoga Pant to your shopping cart.");
        //* Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCartLink();
        Thread.sleep(3000);
        //* Verify the text ‘Shopping Cart.’
        Assert.assertEquals(menPage.getShoppingCartText(), "Shopping Cart", "Page not redirected properly");
        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(menPage.getProductNameInCartPageText(), "Cronus Yoga Pant");
        //* Verify the product size ‘32’
        Assert.assertEquals(menPage.getProductSizeInCartPageText(), "32");
        //* Verify the product colour ‘Black’
        Assert.assertEquals(menPage.getProductColorInCartPageText(), "Black");
    }
}
