package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopDashboardMenu {

    public TopDashboardMenu(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//ul[@id='appmenu']/li[@data-id='dashboard']")
    public WebElement dashboard;

    @FindBy (xpath = "//ul[@id='appmenu']/li[@data-id='files']")
    public WebElement files;

    @FindBy (xpath = "//ul[@id='appmenu']/li[@data-id='photos']")
    public WebElement photos;

    @FindBy (xpath = "//ul[@id='appmenu']/li[@data-id='activity']")
    public WebElement activity;

    @FindBy (xpath = "//ul[@id='appmenu']/li[@data-id='talk']")
    public WebElement talk;

    @FindBy (xpath = "//ul[@id='appmenu']/li[@data-id='contacts']")
    public WebElement contacts;

    @FindBy (xpath = "//ul[@id='appmenu']/li[@data-id='circles']")
    public WebElement circles;

    @FindBy (xpath = "//ul[@id='appmenu']/li[@data-id='calendar']")
    public WebElement calendar;

    @FindBy (xpath = "//ul[@id='appmenu']/li[@data-id='deck']")
    public WebElement deck;

    @FindBy (xpath = "//span[@aria-label='Magnify icon']")
    public WebElement search;
    @FindBy (xpath = "//input[@class='unified-search__form-input']")
    public WebElement searchInputField;

    @FindBy (xpath = "//div[@aria-label='Notifications']")
    public WebElement notifications;

    @FindBy (xpath = "//div[@aria-controls='contactsmenu-menu']")
    public WebElement contactsSearch;
    @FindBy (xpath = "//input[@id='contactsmenu-search']")
    public WebElement contactsSearchInputField;

    @FindBy (xpath = "//div[@id='settings']")
    public WebElement profile;
    @FindBy (xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement setStatusProfileMenu;
    @FindBy (xpath = "//li[@data-id='settings']")
    public WebElement settingsProfileMenu;
    @FindBy (xpath = "//div[@id='help']")
    public WebElement helpProfileMenu;
    @FindBy (xpath = "//div[@id='logout']")
    public WebElement logoutProfileMenu;

}
