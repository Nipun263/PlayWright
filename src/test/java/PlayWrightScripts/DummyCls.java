package PlayWrightScripts;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DummyCls {
	
	
	
	
	public void DummyPracticeSession() {
		
		Playwright playwrght = Playwright.create();
		Browser browser = playwrght.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		com.microsoft.playwright.BrowserContext context = browser.newContext();
		
		Page page = context.newPage();
		
		//page.navigate("http://www.londonfreelance.org/courses/frames/");
		
		page.navigate("https://selectorshub.com/xpath-practice-page/");
		
	
		//https://books-pwakit.appspot.com/
		
		String TextAchieved = 	page.locator("text=SelectorsHub").textContent();
		
		System.out.println(TextAchieved);
		
		
		context.close();
		page.close();
	
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Sampler SS = new Sampler();
		
	}

}
