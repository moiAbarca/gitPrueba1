import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.nio.file.Paths;

public class TestngDefinitionExample {

    public static WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        try {
            System.out.println("Iniciando el driver");
            String path = Paths.get(System.getProperty("user.dir"), "src/main/resources/drivers/chromedriver").toString();
            System.setProperty("webdriver.chrome.driver", path);
            driver = new ChromeDriver();
        } catch (Exception err) {
            System.err.println(String.format("Ocurrio un error iniciando el driver: %s", err.getMessage()));
            Assert.fail();
        }
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        try {
            System.out.println("Cerrando el driver");
            driver.close();
            driver.quit();
        } catch (Exception err) {
            System.err.println(String.format("Ocurrio un error en la cerrando el driver: %s", err.getMessage()));
            Assert.fail();
        }
    }

    @BeforeClass
    public void beforeClass() {
        try {
            System.out.println(String.format("Iniciando prueba"));
            String url = "http://www.yapo.cl";
            System.out.println(String.format("Abriendo la pagina \"%s\"", url));
            driver.get(url);
        } catch (Exception err) {
            System.err.println(String.format("Ocurrio un error accediendo a la url de la prueba: %s", err.getMessage()));
            Assert.fail();
        }
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        try {
            System.out.println("Prueba Finalizada");
            Thread.sleep(5000);
        } catch (Exception err) {
            System.err.println(String.format("Ocurrio un error finalizando la pruebar: %s", err.getMessage()));
            Assert.fail();
        }
    }

}
