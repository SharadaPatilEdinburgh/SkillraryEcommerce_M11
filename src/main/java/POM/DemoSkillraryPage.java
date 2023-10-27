package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage 
{
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement selectDd;
	
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackbtn;
	
	
	//initialization
	public DemoSkillraryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//utilization
	public WebElement getSelectDd() {
		return selectDd;
	}


	public WebElement getFeedbackbtn() {
		return feedbackbtn;
	}

	public void feedbackButton()
	{
		feedbackbtn.click();
	}
	
	
	
	
	
}
