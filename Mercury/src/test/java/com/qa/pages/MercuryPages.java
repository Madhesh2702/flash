package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercuryPages {
	WebDriver Driver;
	@FindBy(xpath="//tbody/tr[2]/td[2]/input[1]")
	WebElement username;
	public WebElement Username() {
		return username;
	}
	@FindBy(xpath="//tbody/tr[3]/td[2]/input[1]")
	WebElement password;
	public WebElement Password() {
		return password;
	}
	@FindBy(xpath="//tbody/tr[2]/td[2]/input[1]")
	WebElement submitbtn;;
	public WebElement Submitbtn() {
		return submitbtn;
	}
	public MercuryPages(WebDriver Driver) {
		this.Driver=Driver;
		PageFactory.initElements( Driver,this);
	}

}
