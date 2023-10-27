package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage
{
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement downloadinvoicebtn;
	
	public DownloadInvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getDownloadinvoicebtn()
	{
		return downloadinvoicebtn;
	}
	
	public void downloadinvoiceButton()
	{
		downloadinvoicebtn.click();
	}

	
	
	

	
}
