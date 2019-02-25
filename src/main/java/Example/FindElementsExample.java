package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Paths;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElementsExample {

    private final static String url = "https://www.yapo.cl/";

    public static void main(String[] args) throws Exception {
    	
        //String path = Paths.get(System.getProperty("user.dir"), "Driver/chromedriver.exe").toString();
        //System.setProperty("webdriver.chrome.driver", path);
        
    	WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        WebElement btnPublicar;
        //btnPublicar = driver.findElement(By.cssSelector(".btn span"));
        btnPublicar = driver.findElement(By.xpath("//*[@class='btn btn-da-insert animated icon-ad-insert btn-home tealium-click']"));
        System.out.println(btnPublicar.getText());
        btnPublicar.click();
        
        Thread.sleep(1000);
      //encontrar elementos, un DropDownList
	        WebElement dwlCategoria;
	        dwlCategoria = driver.findElement(By.id("category_group"));
	        Select lista = new Select(dwlCategoria);
	        lista.selectByVisibleText("Computadores y accesorios");
        
        Thread.sleep(2000);
        WebElement titulo = driver.findElement(By.name("subject"));
        titulo.sendKeys("Prueba QA");
        
        WebElement descripcion = driver.findElement(By.name("body"));
        descripcion.sendKeys("Esta es una descripción");
        
        WebElement byId = driver.findElement(By.id("price"));
        byId.sendKeys("0303456");
        
        WebElement dwlRegion;
        dwlRegion = driver.findElement(By.id("region"));
        Select listaRegion = new Select(dwlRegion);
        listaRegion.selectByVisibleText("Región Metropolitana");
        
        Thread.sleep(2000);
        WebElement dwlComuna;
        dwlComuna = driver.findElement(By.id("communes"));
        Select listaComuna = new Select(dwlComuna);
        listaComuna.selectByVisibleText("La Granja");
        
        Thread.sleep(2000);
        List<WebElement>radioButton = driver.findElements(By.id("p_ad"));
        //If u want to select the radio button
        driver.findElement(By.id("p_ad")).click();
        
        WebElement nombre = driver.findElement(By.id("name"));
        nombre.sendKeys("Juan");
        
        WebElement mail = driver.findElement(By.id("email"));
        mail.sendKeys("JuanperezMaulen@gmail.com");
        
        WebElement mailConfirm = driver.findElement(By.id("email_confirm"));
        mailConfirm.sendKeys("JuanperezMaulen@gmail.com");
        
        WebElement phone = driver.findElement(By.id("phone"));
        phone.sendKeys("93070221");
        
        WebElement pass = driver.findElement(By.id("passwd"));
        pass.sendKeys("quesucede");
        
        WebElement passConfirm = driver.findElement(By.id("passwd_ver"));
        passConfirm.sendKeys("quesucede");
        
        WebElement check;
        check = driver.findElement(By.xpath("//*[@class='iCheck-helper']"));
        check.click();
        
        WebElement btnSubmit = driver.findElement(By.id("submit_create_now"));
        btnSubmit.click();
        
        /*
        
        // find element by id
        WebElement byId = driver.findElement(By.id("uno"));
        System.out.println("Elemento por id:\n    " + byId.getAttribute("outerHTML") + "\n");

        // find element by name
        WebElement byName = driver.findElement(By.name("dos"));
        System.out.println("Elemento por name:\n    " + byName.getAttribute("outerHTML") + "\n");

        // find element by class name
        List<WebElement> byClassName = driver.findElements(By.className("field"));
        for(WebElement e : byClassName) System.out.println("Elemento por tag name:\n    " + e.getAttribute("outerHTML"));
        System.out.println("\n");

        // find element by tag name
        List<WebElement> byTagName = driver.findElements(By.tagName("button"));
        for(WebElement e : byTagName) System.out.println("Elemento por tag name:\n    " + e.getAttribute("outerHTML"));
        System.out.println("\n");

        // find element by link text
        WebElement byLinkText = driver.findElement(By.linkText("Ir a Google Chile"));
        System.out.println("Elemento por link text:\n    " + byLinkText.getAttribute("outerHTML") + "\n");

        // find element by partial link text
        List<WebElement> byPartialLinkText = driver.findElements(By.partialLinkText("Ir a"));
        for(WebElement e : byPartialLinkText) System.out.println("Elemento por partial link text:\n    " + e.getAttribute("outerHTML"));
        System.out.println("\n");

        // find element by xpath
        WebElement byXpath1 = driver.findElement(By.xpath("html/body/main/div/section/ul[1]/li[1]"));
        System.out.println("Elemento por xpath 1:\n    " + byXpath1.getAttribute("outerHTML") + "\n");
        WebElement byXpath2 = driver.findElement(By.xpath("//ul/li[@id='uno']"));
        System.out.println("Elemento por xpath 2:\n    " + byXpath2.getAttribute("outerHTML") + "\n");

        // find elements by xpath
        WebElement bysXpath1 = driver.findElement(By.xpath("//ul/li[@id='uno']"));
        System.out.println("Elementos por xpath 1:\n    " + bysXpath1.getAttribute("outerHTML") + "\n");
        List<WebElement> bysXpath2 = driver.findElements(By.xpath("//li[@class='lista']"));
        for(WebElement e : bysXpath2) System.out.println("Elementos por xpath 2:\n    " + e.getAttribute("outerHTML"));
        System.out.println("\n");

        // find elements by css selector id
        WebElement byCssId = driver.findElement(By.cssSelector("#uno"));
        System.out.println("Elemento por CSS (id):\n    " + byCssId.getAttribute("outerHTML") + "\n");

        // find elements by css selector class name
        List<WebElement> byCssClassName = driver.findElements(By.cssSelector(".field"));
        for(WebElement e : byCssClassName) System.out.println("Elemento por CSS (tag name):\n    " + e.getAttribute("outerHTML"));
        System.out.println("\n");

        // find elements css selector
        WebElement bysCssSelector1 = driver.findElement(By.cssSelector("ul>#uno"));
        System.out.println("Elementos por xpath 1:\n    " + bysXpath1.getAttribute("outerHTML") + "\n");
        List<WebElement> bysCssSelector2 = driver.findElements(By.cssSelector("ul>.lista"));
        for(WebElement e : bysCssSelector2) System.out.println("Elementos por xpath 2:\n    " + e.getAttribute("outerHTML"));
        System.out.println("\n");


*/
        //driver.close();
        //driver.quit();
    }

}
