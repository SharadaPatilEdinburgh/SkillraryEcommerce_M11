package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage
{
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchTF;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchicon;
	
	
	//initialization
	
	public SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Business Library

	public WebElement getGearsbtn() {
		return gearsbtn;
	}


	public WebElement getSkillrarydemoapp() {
		return skillrarydemoapp;
	}

	public WebElement getSearchTF() {
		return searchTF;
	}


	public WebElement getSearchicon() {
		return searchicon;
	}

	//utilization
	
	public void gearsButton()
	{
		gearsbtn.click();
	}
	
	public void skillraryDemoApp()
	{
		skillrarydemoapp.click();
	}
	public void searchTextField(String data)
	{
		searchTF.sendKeys(data);
	}
	public void searchIconWebElement()
	{
		searchicon.click();
	}
	
	
}
