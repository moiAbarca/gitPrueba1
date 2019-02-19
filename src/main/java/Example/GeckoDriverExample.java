import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;

public class GeckoDriverExample {

    public static void main(String[] args) throws Exception {
        String path = Paths.get(System.getProperty("user.dir"), "src/main/resources/drivers/geckodriver").toString();
        System.setProperty("webdriver.gecko.driver", path);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.cl/");
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }

}