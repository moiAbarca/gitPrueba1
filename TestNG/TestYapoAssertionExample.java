import org.testng.Assert;
import org.testng.annotations.Test;

public class TestYapoAssertionExample extends TestngDefinitionExample {

    @Test
    public void test() {
        try {

            HomePageExample home = new HomePageExample(driver);
            PublicarAvisoPageExample publicarAviso = new PublicarAvisoPageExample(driver);
            String value;

            Thread.sleep(1000);
            home.clickPublicarAviso();

            Thread.sleep(1000);
            publicarAviso.seleccionarCategoria("Vendo");
            Thread.sleep(1000);
            publicarAviso.seleccionarTipoInmueble("Casa");
            Thread.sleep(1000);
            publicarAviso.seleccionarDormitorios("1 dormitorio");
            Thread.sleep(1000);
            publicarAviso.seleccionarBanos("1 baño");
            Thread.sleep(1000);
            publicarAviso.seleccionarEquipamentoBodega();
            Thread.sleep(1000);
            publicarAviso.ingresarTamano("120");
            Thread.sleep(1000);
            publicarAviso.ingresarGastoComun("60000");
            Thread.sleep(1000);
            value = "Selenium";
            publicarAviso.ingresarTitulo(value);
            Assert.assertEquals(publicarAviso.titulo.getAttribute("value"), value);
            Thread.sleep(1000);
            value = "Capacitacion de Selenium WebDriver en Tsoft";
            publicarAviso.ingresarDescripcion(value);
            Assert.assertEquals(publicarAviso.descripcion.getAttribute("value"), value);

        } catch (AssertionError err) {
            System.err.println(String.format("Ocurrio un error en un punto de validacion: %s", err.getMessage()));
            Assert.fail();
        } catch (Exception err) {
            System.err.println(String.format("Ocurrio un error en la prueba: %s", err.getMessage()));
            Assert.fail();
        }
    }

}
