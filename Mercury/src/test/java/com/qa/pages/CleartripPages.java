package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CleartripPages {
WebDriver Driver;

@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/*[1]")
public static WebElement cancel;

@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/input")
public static WebElement  from;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/input")
public static WebElement to;
@FindBy(xpath="//span[contains(text(),'Search flights')]")
public static WebElement Searchflight;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/div[2]/ul[1]/li/div/div[2]/p")
public static WebElement Innerfrom;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/div[2]/ul[1]/li/div/div[2]/p")
public static WebElement Innerto;


@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]")
public static WebElement dateselect ;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/div/div/ul/div[3]/div/div[2]/div[1]/div[1]/div")
public static WebElement innerdate;
@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[3]/div[1]/div[1]/div[2]/svg[1]/g[1]/path[2]")
public static WebElement nextarrow;

@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/div/div/ul/div[3]/div/div[2]/div[1]/div[3]/div/div/div/div[contains(text(),'24'")
public static WebElement Date;
public CleartripPages(WebDriver Driver) {
	this.Driver=Driver;
	PageFactory.initElements( Driver,this);
}
}
