package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CustomerRole {

WebDriver ldriver;
	
	public CustomerRole(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver,this);
	}
}
