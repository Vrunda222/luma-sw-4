package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenMenu = By.xpath("//span[text()='Women']");
    By topsMenu = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacketsLink = By.id("ui-id-11");
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottomSubMenu = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pantsSubMenu = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bagsSubMenu = By.xpath("//span[normalize-space()='Bags']");

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTops() {
        mouseHoverToElement(topsMenu);
    }
    public void clickOnJacketsLink() {
        clickOnElement(jacketsLink);
    }
    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottomSubMenu() {
        mouseHoverToElement(bottomSubMenu);
    }
    public void clickOnPantsSubMenu() {
        clickOnElement(pantsSubMenu);
    }
    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBagsSubMenu() {
        clickOnElement(bagsSubMenu);
    }
}
