import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageExample {

    private WebDriver driver;
    private static Actions action;
    private static WebDriverWait wait;

    @FindBy(css = ".header-right .btn-home")
    public WebElement publicarAviso;

    public HomePageExample(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, 60);
    }

    public void clickPublicarAviso() throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(publicarAviso));
        System.out.println(String.format("Haciendo click en \"%s\"", publicarAviso.getText()));
        action.moveToElement(publicarAviso).build().perform();
        Thread.sleep(1000);
        publicarAviso.click();

    }

}
