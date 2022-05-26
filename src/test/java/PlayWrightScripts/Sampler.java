package PlayWrightScripts;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Sampler {
	
	
	
	
	public void DummyPracticeSession(String DesiredCountry) {
		
		Playwright playwrght = Playwright.create();
		Browser browser = playwrght.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		com.microsoft.playwright.BrowserContext context = browser.newContext();
		
		Page page = context.newPage();
		
	
		/*
		 * page.navigate("https://orangehrm.com/");
		 * 
		 * page.click("//*[@id='header-navbar']//a[contains(text(),'Book a Free Demo')]"
		 * );
		 * 
		 * page.click("//*[@id='Form_submitForm_Country']");
		 * 
		 * Locator Country = page.locator("//*[@id='Form_submitForm_Country']/option");
		 * 
		 * int count = Country.count();
		 * 
		 * for(int i =0;i<count ;i++) { String CountryText =
		 * Country.nth(i).textContent();
		 * 
		 * if(CountryText.contains(DesiredCountry)) {
		 * page.selectOption("select[name='Country']", DesiredCountry); break; }
		 * 
		 * }
		 * 
		 * page.locator("//*[@class='form-content']").click();
		 * 
		 * 
		 * 
		 * 
		 * //Shadow Element Handle !!!
		 * page.navigate("https://books-pwakit.appspot.com/");
		 * 
		 * page.locator("book-app[apptitle='BOOKS'] #input").fill(" Tesing");
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		/*
		 * page.navigate("https://selectorshub.com/xpath-practice-page/");
		 * 
		 * 
		 * //https://books-pwakit.appspot.com/
		 * 
		 * Locator Text = page.locator("text=SelectorsHub");
		 * 
		 * int sizr = Text.count();
		 * 
		 * for(int i =0;i<sizr ;i++) { String TT = Text.nth(i).textContent();
		 * 
		 * if(TT.equalsIgnoreCase("SelectorsHub: Tips & Tricks")) {
		 * System.out.println(TT); } }
		 * 
		 * 
		 * page.frame("pact2").locator("//*[@id='jex']").fill("Nipun");
		 * 
		 * 
		 * page.frame("pact").locator("text=Testers Food").click();
		 * 
		 * 
		 * 
		 * Browser browser1 = playwrght.firefox().launch(new
		 * BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		 * com.microsoft.playwright.BrowserContext context1 = browser1.newContext();
		 */
		
		Page page1 = context.newPage();
		
	//	page1.navigate("https://books-pwakit.appspot.com/");
		
	//	page1.locator("book-app[apptitle='BOOKS'] #input:visible").fill("Nipun Verma");
		
		
		page1.navigate("https://selectorshub.com/xpath-practice-page/");
		
		
		page1.frame("pact").locator("#snacktime #tea").fill("ABCD");
		
			
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Sampler SS = new Sampler();
		SS.DummyPracticeSession("Albania");
	}

}
