import org.testng.annotations.Test;

public class TestYapoPomExample extends TestngDefinitionExample {

    @Test
    public void test() {
        try {

            HomePageExample home = new HomePageExample(driver);
            PublicarAvisoPageExample publicarAviso = new PublicarAvisoPageExample(driver);

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
            publicarAviso.ingresarTitulo("Selenium");
            Thread.sleep(1000);
            publicarAviso.ingresarDescripcion("Capacitacion de Selenium WebDriver en Tsoft");

        } catch (Exception err) {
            System.err.println(String.format("Ocurrio un error en la prueba: %s", err.getMessage()));
        }
    }

}
