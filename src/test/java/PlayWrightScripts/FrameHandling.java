package PlayWrightScripts;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FrameHandling {
	
	
			public void handleFrames() {
		
				Playwright playwright = Playwright.create();
				
				Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
				
				BrowserContext content = browser.newContext();
				
				Page page = content.newPage();
				
				page.navigate("http://www.londonfreelance.org/courses/frames/");
				
				
				//In this site - There are 5 frames , now i want to switch to one of the frame and then gets its text
				//Either frames can be accesed by frame name , selector 
				
					String TextContent = page.frame("navbar").locator("h3").textContent();
					
					
					
					List<String> TextContent1 = page.frame("navbar").locator("p").allTextContents();
					
					System.out.println(TextContent1);
					
					
					Locator LL = page.frame("navbar").locator("p:visible");
					
					for(int i =0;i<LL.count();i++) {
						
						String TT = LL.nth(i).textContent();
						
						System.out.println(TT);
						
						if(TT.contains("Home")) {
							LL.nth(i).click();
							
							System.out.println("Home clicked ");
						}
						
					}
					
					
			}
	
	
			
			
			
	
	
	


	
	
			public static void main(String[] args) {
				FrameHandling FH = new FrameHandling();
				FH.handleFrames();
			}
}
