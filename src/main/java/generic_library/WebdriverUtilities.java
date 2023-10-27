package generic_library;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities 
{
	//1.DropDown
	public void Dropdown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);	
	}
	
	//2.HAndling Mousehover
	public void MouseHover(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//3. Handling Rightclick
	public void Rightclick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();	
	}
	
	//4. Handling Double click
	public void Doubleclick(WebDriver driver, WebElement ele) 
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();	
	}
	
	//5.Handling Drag and drop
	public void DragandDrop(WebDriver driver, WebElement ele1, WebElement ele2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1, ele2);
	}
	
	//6. Handling Frames
	public void Frames(WebDriver driver, String value)
	{
		driver.switchTo().frame(value);
	}
	
	//7. Handling Default content
	public void DefaultContent(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	//8. Scrolling with Element Address
	public void Scrolling(WebDriver driver, WebElement ele) 
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}
	
	//9. Alert popup
	public void AlertPopUp(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	//10. ChildBowser
	public void ChildBrowser(WebDriver driver)
	{
		Set<String> child=driver.getWindowHandles();
		for(String b : child)
		{
			driver.switchTo().window(b);
		}
	}
}
