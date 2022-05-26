package PlayWrightScripts;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.*;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Locators {
	
	public void HandleLocators() {
		
		Playwright playwrght = Playwright.create();
		Browser browser = playwrght.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		com.microsoft.playwright.BrowserContext context = browser.newContext();
		
		Page page = context.newPage();
		
		page.navigate("https://www.amazon.in/");
		
		//Single Locator handle 
		
		Locator SignInBtn = page.locator("//*[@id='nav-link-accountList']/span");
		SignInBtn.click();
			
			
		Locator needHelp =	page.locator("//*[@id='authportal-main-section']/div[2]/div/div[1]/form/div/div/div/div[3]/div/a/span");
		needHelp.click();
		
		Locator otherIssues = page.locator("//*[@id='ap-other-signin-issues-link']");
		otherIssues.click();
		
		//Multiple Locators Handling 
		
		Locator selectIssue = page.locator("//*[@id='cu-select-firstNode']/option");
		int size = selectIssue.count();
		
		System.out.println("Select Issues size ========> :" + size);
		
		List<String> selectIssuesOptions = selectIssue.allTextContents();
		
		for(String SS : selectIssuesOptions) {
			System.out.println("Options Fetched are ==========>" + SS);
			
			
			
		}
		
		
		
		
		
		context.close();
		browser.close();
		playwrght.close();
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		Locators LC = new Locators();
		LC.HandleLocators();
		
	}

}
