package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import generic_library.BaseClass;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2()
	{
		SkillraryHomePage s = new SkillraryHomePage(driver);
		s.gearsButton();
		s.skillraryDemoApp();
		
		utilities.ChildBrowser(driver);
		
		DemoSkillraryPage ds= new DemoSkillraryPage(driver);
		ds.feedbackButton();
		
		DownloadInvoicePage dI= new DownloadInvoicePage(driver);
		dI.downloadinvoiceButton();
		
		
	}
}
