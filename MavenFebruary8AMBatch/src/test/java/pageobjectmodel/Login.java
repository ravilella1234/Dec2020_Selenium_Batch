package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{	
	@FindBy(linkText="Sign in")public WebElement signInLink;
	@FindBy(id="email")WebElement userEmail;
	@FindBy(id="passwd")WebElement userPassword;
	@FindBy(id="SubmitLogin")WebElement loginSubmit;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")WebElement loginErrorMsg;
	
	public Login(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void login()
	{
		signInLink.click();
		userEmail.sendKeys("qatest985948@gmail.com");
		userPassword.sendKeys("password");
		loginSubmit.click();
	}
	
	public String getLoginError()
	{
		return loginErrorMsg.getText();
	}
}