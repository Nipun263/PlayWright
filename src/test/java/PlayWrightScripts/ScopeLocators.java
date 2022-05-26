package PlayWrightScripts;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Locator.LocatorOptions;

public class ScopeLocators {
	
	
	
	public void Scope_Locators(String Name) {
		
		
		Playwright playWright = Playwright.create();
		
		Browser browser = playWright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		com.microsoft.playwright.BrowserContext context = browser.newContext();
		
		Page page = context.newPage();
		
		page.navigate("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		
		//Get the locator of full table and then select the row using the scope locator
		
		Locator FullTable = page.locator("//table[@id='example']");
		
	    FullTable.locator(":scope", new Locator.LocatorOptions().setHasText(Name)).locator("//td[normalize-space()='"+Name+"']/preceding::td[1]").click();
		
	    String HH =	FullTable.locator(":scope", new Locator.LocatorOptions().setHasText(Name)).locator("//td[normalize-space()='"+Name+"']/following::td[2]").textContent();
		
	    System.out.print(HH);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ScopeLocators SL = new ScopeLocators();
		SL.Scope_Locators("Ashton Cox");
	}

}
