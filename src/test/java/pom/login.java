package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	
 
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id ="password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@type ='submit']")
	private WebElement loginButton;

	public login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void name(String user) {
		
		username.sendKeys(user);
		
	}
	
	
    public void password(String pass) {
		
    	password.sendKeys(pass);
		
	}
	
   public void ln() {
		
		loginButton.click();;
		
	}
	
	
	
	
	
}
