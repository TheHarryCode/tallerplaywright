package pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BasePage {
    
    protected static Playwright playwright;
    private static Page page;
    
    static{
        playwright = Playwright.create();
        Browser browser = playwright.chromium().launch( new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        page = browserContext.newPage();
    }

    public BasePage(Playwright playwright){
            BasePage.playwright = playwright;
    }

    public static void navigateTo(String url){
        page.navigate(url);
    }

    public void click(String selector){
        page.click(selector);
    }

    public void waitMiliSeconds(int miliSeconds){
        try {
			Thread.sleep(miliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

    public void write(String selector, String value){
        page.fill(selector, value);
    }

    public static void close(){
        page.close();
    }

    public boolean existeElemento(String selector){
        boolean existeElemento = page.locator(selector).isVisible();
        return existeElemento;
    }

    public void seleccionar(String selector, String value){
        page.selectOption(selector, value);
    }

    public String obtenerValor(String selector){
        return page.locator(selector).inputValue();
    }

}
