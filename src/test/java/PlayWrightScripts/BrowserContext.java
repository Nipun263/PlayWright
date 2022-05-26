package PlayWrightScripts;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class BrowserContext {

	public void HandleBrowserContext() {

		Playwright playwright = Playwright.create();
		
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
	   
		com.microsoft.playwright.BrowserContext context = browser.newContext();
	    
		Page page = context.newPage();
	    
		page.navigate("https://www.amazon.in/");
         
         page.click("#nav-signin-tooltip >> text=Sign in");
         
         
         page.click("a[role=\"button\"]:has-text(\"Need help?\")");
         
         page.click("text=Other issues with Sign-In");
         
         page.selectOption("text=Select an issue< Please make a selection >I forgot my passwordI cannot sign into >> select", "3");
         
         page.click(":nth-match(:text(\"Devices & Content\"), 3)");
         
         
         com.microsoft.playwright.BrowserContext contextNew = browser.newContext();
	     Page pageNew1 = contextNew.newPage();
	     
	  
	      pageNew1.navigate("https://www.orangehrm.com/hris-hr-software-demo/");
	     
	      pageNew1.click("text=Book a Free Demo");
	     
	      pageNew1.click("[placeholder=\"First Name\"]");
	     
	      pageNew1.press("text=Accept Cookies", "Tab");
	     
	      pageNew1.click("[placeholder=\"First Name\"]");
	    
	      pageNew1.fill("[placeholder=\"First Name\"]", "ABCD");
	     
	      pageNew1.click("[placeholder=\"Last Name\"]");
	     
	      pageNew1.fill("[placeholder=\"Last Name\"]", "EDFG");
	      
	      pageNew1.click("[placeholder=\"Email\"]");
	      
	      pageNew1.fill("[placeholder=\"Email\"]", "test@tsting.test");
	     
	      
	      page.close();
	      browser.close();
	      
		  pageNew1.close();
		  contextNew.close();
		 

	}

	public static void main(String[] args) {
		BrowserContext HBB = new BrowserContext();
		HBB.HandleBrowserContext();

	}

}
