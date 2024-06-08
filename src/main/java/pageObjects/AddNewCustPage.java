package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustPage {

	
WebDriver ldriver;
	
	public AddNewCustPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver,this);
	}
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	WebElement clkCustomerMenu;
	
	@FindBy(xpath="(//p[contains(text(),'Customers')])[2]")
	WebElement clkCustomerMenuItem;
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement btnAddnew;
	@FindBy(xpath="//h1[@class='float-left']")
	WebElement custPageverify;
	@FindBy(xpath="//input[@id='Email']")
	WebElement newEmail;
	@FindBy(xpath="//input[@id='Password']")
	WebElement newPass;
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement fname;
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lname;
	@FindBy(xpath="//input[@id='Gender_Male']")
	WebElement genderm;
	@FindBy(xpath="//input[@id='Gender_Female']")
	WebElement genderf;
	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement DOB;
	@FindBy(xpath="//input[@id='Company']")
	WebElement ComName;
	@FindBy(xpath="//textarea[@id='AdminComment']")
	WebElement AdminComment;
	@FindBy(xpath="//button[@name='save']")
	WebElement btnsave;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissable']")
	WebElement saveconf;
	
	// user defined method to perform opeartion on able web element
	public void newEmail( String email) {
		newEmail.sendKeys(email);
	}

	public void newPass(String password) {

          newPass.sendKeys(password);
	}
	public void fname( String firstname) {
		fname.sendKeys(firstname);
	}

	public void lname(String lastname) {

		lname.sendKeys(lastname);
	}
	public void gender( String newgender) {
		String gen=newgender;
		System.out.println(gen);
		if(gen.equalsIgnoreCase("Male"))
		{
			genderm.click();	
		}
		else
			if(gen.equalsIgnoreCase("Female"))
		genderf.click();
	
	}

	public void DOB(String birth) {

		DOB.sendKeys(birth);
	}
	public void ComName( String CompanyName) {
		ComName.sendKeys(CompanyName);
	}

	public void AdminComment(String comment) {

		AdminComment.sendKeys(comment);
	}
	
	
	public void clkCustomerMenu() {
		clkCustomerMenu.click();
	}
	public void clkCustomerMenuItem() {
		clkCustomerMenuItem.click();
	}
	public void btnAddnew() {
		btnAddnew.click();
	}
	
	public void btnsave() {
		btnsave.click();
	}
	
	public String custPageverify()
	{
		String cust=custPageverify.getText();
		return cust;
	    
	}
	
	public String saveconf()
	{
		String confirm=saveconf.getText();
		return confirm;
	    
	}
	
	
}
