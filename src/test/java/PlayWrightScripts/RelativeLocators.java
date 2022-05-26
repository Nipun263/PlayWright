package PlayWrightScripts;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RelativeLocators {
	
	
	
	public void UserRelativeLocators() {
		
		Playwright playWright = Playwright.create();
		
		Browser browser = playWright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		com.microsoft.playwright.BrowserContext context = browser.newContext();
		
		Page page = context.newPage();
		
		page.navigate("https://www.orangehrm.com/hris-hr-software-demo/");
		
		//Above 
		
		String A = page.locator("label[for='Form_submitForm_LastName']").textContent();
		
		System.out.println(A);
		
		
		
		String B =	page.locator("label[for='Form_submitForm_LastName']:above(input)").textContent();
		
		System.out.println(B);
		
		
		
		
		 page.locator("input:below(div#Form_submitForm_Contact_Holder > label)").first().fill("111111111");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		RelativeLocators PL = new RelativeLocators();
		PL.UserRelativeLocators();
		
	}

}
