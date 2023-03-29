package org.poj;

import org.bas.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojflip extends BaseClass{
	
	public pojflip() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement x;
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement mno;
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement Rotp;
	public WebElement getX() {
		return x;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getMno() {
		return mno;
	}
	public WebElement getRotp() {
		return Rotp;
	}
	



}

	
	
	
	
	
	


