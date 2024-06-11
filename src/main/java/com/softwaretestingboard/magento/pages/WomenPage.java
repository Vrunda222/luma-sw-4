package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility {

    By sortBy = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By sortByProductName = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]/option[2]");
    By sortByPrice = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]/option[3]");



    public void clickOnSortByDropDown(){
        clickOnElement(sortBy);
    }
    public void clickOnSortByProductNameDropDown(){
        clickOnElement(sortByProductName);
    }
    public void clickOnSortByPriceDropDown(){
        clickOnElement(sortByPrice);
    }
}
