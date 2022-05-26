package PlayWrightScripts;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class OrOperator {
	
	
	
	public void UseOrOperator() {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		   
		com.microsoft.playwright.BrowserContext content = browser.newContext();
		
		Page page = browser.newPage();
		
		page.navigate("https://academy.naveenautomationlabs.com/");
		
		//Using CSS Locator 
		
		
		page.locator(".btn.btn-link[href='/s/store'] ,.btn.btn-link[href='/s/store11']").click();		
		
		
		//Using xpath 
		
		Browser browser1 = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		   
		com.microsoft.playwright.BrowserContext content1 = browser1.newContext();
		
		Page page1 = browser1.newPage();
		
		page1.navigate("https://academy.naveenautomationlabs.com/");
		
		page1.locator("//span[contains(text(),'Store')] | //span[contains(text(),'Store11')]").click();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		OrOperator OO = new OrOperator();
		OO.UseOrOperator();
	}
	
	
	
	

}
