package Example;



import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandsExample {

    public static void main(String[] args) throws Exception {
        //String path = Paths.get(System.getProperty("user.dir"), "Driver//gitPrueba1/Driver/chromedriverMac").toString();
        //System.setProperty("webdriver.chrome.driver", path);
        //WebDriver driver = new ChromeDriver();
    	
    	//llamar al driver desde mac
    	WebDriver driver = new ChromeDriver();
    	
        driver.get("https://www.yapo.cl/");
        String tittle = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();
        System.out.println("El titulo es: " + tittle);
        System.out.println("La URL actual es: " + currentUrl);
        System.out.println("El codigo de la pagina es: " + pageSource.substring(0,200));
        Thread.sleep(2500);
        driver.close();
        Thread.sleep(2500);
        driver.quit();
    }

}
