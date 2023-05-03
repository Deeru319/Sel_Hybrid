package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(id="email")
	private WebElement usn;
	
	@FindBy(id="pass")
	private WebElement pwd;

	@FindBy(name="login")
	private WebElement lgn;
	
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void username(String un1)
	{
		usn.sendKeys(un1);
	}
	public void password(String pw1)
	{
		pwd.sendKeys(pw1);
	}
	public void login()
	{
		lgn.click();
	}
	

}
