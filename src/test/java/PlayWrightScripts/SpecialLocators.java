package PlayWrightScripts;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class SpecialLocators {
	
	
	
	
	
	public void HandleSpecialLocators() {
		
		Playwright playwright = Playwright.create();
		
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		
		com.microsoft.playwright.BrowserContext content = browser.newContext();
		
		
		
		content.tracing().start(new Tracing.StartOptions()
				  .setScreenshots(true)
				  .setSnapshots(true));
		
		
		Page page = content.newPage();
		
		//page.navigate("https://selectorshub.com/xpath-practice-page/");
		
		//page.locator("#ohrmList_chkSelectRecord_21:left-of( #resultTable > tbody > tr:nth-of-type(3) > td:nth-of-type(2) > a)").click();
		
		
		//content.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("trace.zip")));
		
		
		page.navigate("https://www.orangehrm.com/");
		
		
		//String S1 =	page.locator("text=Contact Sales").textContent();
	
		String S2 = page.locator("text=Book a Free Demo").first().textContent();
		
		System.out.println(S2);
		
		
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		SpecialLocators SL = new SpecialLocators();
		SL.HandleSpecialLocators();
	}

}

//:left-of([type=checkbox])