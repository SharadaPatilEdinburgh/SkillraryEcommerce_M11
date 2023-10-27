package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.SkillraryHomePage;
import POM.TestingPage;
import generic_library.BaseClass;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1() throws Throwable
	{
		SkillraryHomePage s= new SkillraryHomePage(driver);
		s.gearsButton();
		s.skillraryDemoApp();
		
		utilities.ChildBrowser( driver);
		
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		utilities.Dropdown(ds.getSelectDd(),pdata.getPropertydata("coursedd"));
		
		TestingPage t=new TestingPage(driver);
		utilities.Scrolling(driver, t.getFacebookicon());
		
		
		Thread.sleep(2000);
		t.facebookiconWebElement();
	//	Thread.sleep(5000);
	//	System.out.println("HIIIIIIIIIIII");
		
		
		
		
	}	
	
}
