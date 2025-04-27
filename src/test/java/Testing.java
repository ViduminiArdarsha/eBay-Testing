import org.example.Electronics;
import org.example.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Testing{
    WebDriver driver;
    String url="https://www.ebay.com/";

    @BeforeClass
    public void beforeMethod() {
        System.setProperty("web driver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void basicNavigation() {
        HomePage homePage=new HomePage(driver);
        homePage.verifyUrl(url);
    }

    @Test
    public void categoryAndProductSelection() {
        HomePage homePage=new HomePage(driver);
        Electronics electronics=new Electronics(driver);
        homePage.clickElectronics();
        electronics.goToCellPhones();
    }

    @Test
    public void
    @AfterClass
    public void afterMethod() {
        driver.quit();
    }

}
