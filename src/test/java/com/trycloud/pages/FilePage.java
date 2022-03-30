package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage {
    public FilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id='fileList']/tr[1]/td[2]/a/span[3]/a[2]")
    public WebElement actions;

    @FindBy(xpath = "//*[@id='fileList']/tr[1]/td[2]/div/ul/li[4]")
    public  WebElement details;

    @FindBy(xpath = "//*[@id='commentsTabView']/span")
    public WebElement comments;

    @FindBy(xpath = "//*[@id='commentsTabView']/div[1]/form/div[1]")
    public WebElement input;

    @FindBy(xpath = "//*[@id='commentsTabView']/div[1]/form/input")
    public WebElement arrow;

    @FindBy(xpath = "//*[@id='commentsTabView']/ul/li/div[.='text']")
    public WebElement text;
}
