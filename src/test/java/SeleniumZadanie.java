import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeleniumZadanie {
    private WebDriver driver;

    private String baseURL = "http://dev.to/";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\Kurs Testera Oprogramowania\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get(baseURL);
    }
    @Test
    public void Actions(){
        WebElement TimeMenu = driver.findElement(By.xpath("//*[@id=\"on-page-nav-controls\"]/div/nav/a[3]"));
        Actions builder = new Actions(driver);
        Action mouseOverHome = (Action) builder.moveToElement(TimeMenu);


    }
    @After
    public void tearDown(){
        //driver.quit();
    }
}
