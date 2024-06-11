package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
        //* Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //* Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        //* Click on Jackets
        homePage.clickOnJacketsLink();
        //* Select Sort By filter “Product Name”
        womenPage.clickOnSortByDropDown();
        womenPage.clickOnSortByProductNameDropDown();
        //* Verify the products name display in alphabetical order

    }

    @Test
    public void verifyTheSortByPriceFilter(){
        //* Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //* Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        //* Click on Jackets
        homePage.clickOnJacketsLink();
        //* Select Sort By filter “Price”
        womenPage.clickOnSortByDropDown();
        womenPage.clickOnSortByPriceDropDown();
        //* Verify the products price display in Low to High

    }
}
