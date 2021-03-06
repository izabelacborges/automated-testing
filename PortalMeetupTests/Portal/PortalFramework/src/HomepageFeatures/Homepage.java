package HomepageFeatures;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class Homepage 
{
    static String URL;
    static WebElement ReadMore;
    static WebElement JoinSysters, Wiki, Contact, AboutUs;
    static WebElement Title;
    private static String check;
    public static void Goto()
    {
    	Driver.Instance.get(PageObjRef.baseURL);
		
	}
    //Validates against url.
	public static boolean IsAtSystersCommunitiesPage() 
	{
		String mainWindowsHandle = Driver.Instance.getWindowHandle();
		
		//Align the button by scrolling 
		JavascriptExecutor jse = (JavascriptExecutor) Driver.Instance;
		jse.executeScript("window.scrollBy(0,500)", "");
		
	    ReadMore=Driver.Instance.findElement(PageObjRef.ReadMore1);
		ReadMore.click();
		
		for(String curURL : Driver.Instance.getWindowHandles())
	    {
	        Driver.Instance.switchTo().window(curURL);
	    }
		
		URL=Driver.Instance.getCurrentUrl();
		//Extract Title
	    Title = Driver.Instance.findElement(PageObjRef.SystersCommunitiesTitle);
	    check = Title.getText();
	    Driver.Instance.close();
	    Driver.Instance.switchTo().window(mainWindowsHandle);
		
		if((URL.equals("http://anitaborg.org/get-involved/systers/"))&&(check.equals("Systers")))
		   return true;
		else
			return false;
	}
	
	//Validates against url.
	public static boolean IsAtSystersCRAWPage() 
	{
		String mainWindowsHandle = Driver.Instance.getWindowHandle();
	    ReadMore=Driver.Instance.findElement(PageObjRef.ReadMore2);
		ReadMore.click();
		
		for(String curURL : Driver.Instance.getWindowHandles())
	    {
	        Driver.Instance.switchTo().window(curURL);
	    }
		
		URL=Driver.Instance.getCurrentUrl();
		
		//Extract Title
	    Title = Driver.Instance.findElement(PageObjRef.SystersAndCRAwTitle);
	    check = Title.getText();
	    
	    Driver.Instance.close();
	    Driver.Instance.switchTo().window(mainWindowsHandle);
	    
		if((URL.equals("http://anitaborg.org/get-involved/systers/systers-co-sponsored-cra-w-lists/"))&& (check.equals("Systers and CRA-W")))
		   return true;
		else
			return false;
	}
	
	//Validates against url.
	public static boolean IsAtSystersInitiativesPage() 
	{
		String mainWindowsHandle = Driver.Instance.getWindowHandle();
		
		//Scroll the screen so it doesn't click the Contact button
		JavascriptExecutor jse = (JavascriptExecutor) Driver.Instance;
		jse.executeScript("window.scrollBy(0,500)", "");

		ReadMore= Driver.Instance.findElement(PageObjRef.ReadMore3);
		ReadMore.click();
			
		for(String curURL : Driver.Instance.getWindowHandles())
	    {	
			Driver.Instance.switchTo().window(curURL);
	    }
			
		URL=Driver.Instance.getCurrentUrl();
		
		//Extract Title
	    Title = Driver.Instance.findElement(PageObjRef.SystersInitiativesTitle);
	    check = Title.getText();
	    
	    Driver.Instance.close();
	    Driver.Instance.switchTo().window(mainWindowsHandle);
	    
		if((URL.equals("http://anitaborg.org/get-involved/systers/systers-initiatives/"))&&(check.equals("Systers Initiatives")))
			 return true;
		else
			 return false;
	}
	
	 //Validates against url.
	public static Object IsAtSystersTechnicalInitiativePage() 
	{
		String mainWindowsHandle = Driver.Instance.getWindowHandle();
		ReadMore=Driver.Instance.findElement(PageObjRef.ReadMore4);
		ReadMore.click();
			
		for(String curURL : Driver.Instance.getWindowHandles())
	    {	
			Driver.Instance.switchTo().window(curURL);
	    }
			
		URL=Driver.Instance.getCurrentUrl();
		
		//Extract Title
	    Title = Driver.Instance.findElement(PageObjRef.SystersTechnicalInitiativeTitle);
	    check = Title.getText();
			
	    Driver.Instance.close();
	    Driver.Instance.switchTo().window(mainWindowsHandle);
	    
		if((URL.equals("http://anitaborg.org/get-involved/systers/technical-interests/"))&&(check.equals("Systers Technical Interests")))
			 return true;
		else
			 return false;
		
	}
	
	public static boolean IsAtJoinSysters()
	{
		JoinSysters=Driver.Instance.findElement(PageObjRef.JoinSysters);
		JoinSysters.click();
		
		//Validate Navigation
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"accounts/signup/"))
		    return true;
		else
			return false;

	}
	public static boolean IsAtAboutUs() 
	{
		AboutUs=Driver.Instance.findElement(PageObjRef.AboutUs);
		AboutUs.click();
		
		//Extract Title
	    Title = Driver.Instance.findElement(PageObjRef.AboutTitle);
	    check = Title.getText();
		
		//Validate Navigation
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"about-us/")&&(check.equals("About Systers")))
		    return true;
		else
			return false;
	}
	public static boolean IsAtWiki()
	{
		String mainWindowsHandle = Driver.Instance.getWindowHandle();
		Wiki=Driver.Instance.findElement(PageObjRef.Wiki);
		Wiki.click();
		
		//Validate Navigation
		for(String curURL : Driver.Instance.getWindowHandles())
	    {
	        Driver.Instance.switchTo().window(curURL);
	    }
		
		URL=Driver.Instance.getCurrentUrl();
		
		//Extract Title
	    Title = Driver.Instance.findElement(PageObjRef.WikiTitle);
	    check = Title.getText();
	    
	    Driver.Instance.close();
	    Driver.Instance.switchTo().window(mainWindowsHandle);
	    
		//Validate against URL and title
		if((URL.equals("http://systers.org/systers-dev/doku.php")) && (check.equals("Welcome to the Systers Wiki - Systers Development community")))
		   return true;
		else
			return false;
		
		
	}
	public static boolean IsAtContact()
	{
		Contact=Driver.Instance.findElement(PageObjRef.Contact);
		Contact.click();
		

		//Extract Title
	    Title = Driver.Instance.findElement(PageObjRef.ContactTitle);
	    check = Title.getText();
		
		//Validate Navigation
		if((Driver.Instance.getCurrentUrl()).equals(PageObjRef.baseURL+"contact/")&& check.equals("Contact Systers"))
		    return true;
		else
			return false;
	}
	

}
