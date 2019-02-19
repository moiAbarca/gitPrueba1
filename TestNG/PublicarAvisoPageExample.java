import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PublicarAvisoPageExample {

    private WebDriver driver;
    private static WebDriverWait wait;

    @FindBy(css = "#category_group")
    public WebElement categoria;

    @FindBy(css = "#estate_type")
    public WebElement tipoInmueble;

    @FindBy(css = "#rooms")
    public WebElement dormitorios;

    @FindBy(css = "#bathrooms")
    public WebElement banos;

    @FindBy(css = "#eqp_3_1")
    public WebElement equipamientoBodega;

    @FindBy(css = "#size")
    public WebElement tamano;

    @FindBy(css = "#condominio")
    public WebElement gastoComun;

    @FindBy(css = "#subject")
    public WebElement titulo;

    @FindBy(css = "#body")
    public WebElement descripcion;

    public PublicarAvisoPageExample(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 60);
    }

    public void seleccionarCategoria(String value) {
        wait.until(ExpectedConditions.elementToBeClickable(categoria));
        System.out.println(String.format("Seleccionando la categoria \"%s\"", value));
        Select selectCategoria = new Select(categoria);
        selectCategoria.selectByVisibleText(value);
    }

    public void seleccionarTipoInmueble(String value) {
        wait.until(ExpectedConditions.elementToBeClickable(tipoInmueble));
        System.out.println(String.format("Seleccionando tipo de inmueble \"%s\"", value));
        Select selectCategoria = new Select(tipoInmueble);
        selectCategoria.selectByVisibleText(value);

    }

    public void seleccionarDormitorios(String value) {
        wait.until(ExpectedConditions.elementToBeClickable(dormitorios));
        System.out.println(String.format("Seleccionando cantidad de dormitorios \"%s\"", value));
        Select selectCategoria = new Select(dormitorios);
        selectCategoria.selectByVisibleText(value);
    }

    public void seleccionarBanos(String value) {
        wait.until(ExpectedConditions.elementToBeClickable(banos));
        System.out.println(String.format("Seleccionando cantidad de baños \"%s\"", value));
        Select selectCategoria = new Select(banos);
        selectCategoria.selectByVisibleText(value);
    }

    public void seleccionarEquipamentoBodega() {
        wait.until(ExpectedConditions.elementToBeClickable(equipamientoBodega));
        System.out.println("Seleccionando equipamiento bodega");
        if (!equipamientoBodega.isSelected())
            equipamientoBodega.click();
    }

    public void ingresarTamano(String value) {
        wait.until(ExpectedConditions.elementToBeClickable(tamano));
        System.out.println(String.format("Ingresando tamaño \"%s\"", value));
        tamano.sendKeys(value);
    }

    public void ingresarGastoComun(String value) {
        wait.until(ExpectedConditions.elementToBeClickable(gastoComun));
        System.out.println(String.format("Ingresando tamaño \"%s\"", value));
        gastoComun.sendKeys(value);
    }

    public void ingresarTitulo(String value) {
        wait.until(ExpectedConditions.elementToBeClickable(titulo));
        System.out.println(String.format("Ingresando tamaño \"%s\"", value));
        titulo.sendKeys(value);
    }

    public void ingresarDescripcion(String value) {
        wait.until(ExpectedConditions.elementToBeClickable(descripcion));
        System.out.println(String.format("Ingresando tamaño \"%s\"", value));
        descripcion.sendKeys(value);
    }

}
