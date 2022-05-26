package PlayWrightScripts;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class TraceClass {
	
	
	
	public void TraceLogMethod() {
		
		 try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		      BrowserContext context = browser.newContext();
		      
		      
		      // Start tracing before creating / navigating a page.
		      	
		      context.tracing().start(new Tracing.StartOptions()
		    		  .setScreenshots(true)
		    		  .setSnapshots(true));
		      

		        Page page = context.newPage();
		     
		      	
		      	 page.navigate("https://www.amazon.in/");
		         // Click #nav-signin-tooltip >> text=Sign in
		      	 
		         page.click("#nav-signin-tooltip >> text=Sign in");
		         // assert page.url().equals("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		         // Click a[role="button"]:has-text("Need help?")
		         
		         
		         page.click("a[role=\"button\"]:has-text(\"Need help?\")");
		         // Click text=Other issues with Sign-In
		         
		         
		         page.click("text=Other issues with Sign-In");
		         // assert page.url().equals("https://www.amazon.in/gp/help/customer/account-issues/ref=ap_login_with_otp_claim_collection?ie=UTF8");
		         // Select 3
		         
		         
		         page.selectOption("text=Select an issue< Please make a selection >I forgot my passwordI cannot sign into >> select", "3");
		         // Click :nth-match(:text("Devices & Content"), 3)
		         
		         
		         page.click(":nth-match(:text(\"Devices & Content\"), 3)");
		         // assert page.url().equals("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fdigital%2Ffiona%2Fmanage&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		       
		         
		         
		         // Stop tracing and export it into a zip archive.
		         context.tracing().stop(new Tracing.StopOptions()
		        		  .setPath(Paths.get("trace.zip"))); 
		        
		        browser.close();
		        
		        playwright.close();
				
		    }
		  }
		

	
	
	
	
	
	
	
	public static void main(String[] args) {
		TraceClass TC = new TraceClass();
		TC.TraceLogMethod();
	}
	
	
	
	
	
	

}
