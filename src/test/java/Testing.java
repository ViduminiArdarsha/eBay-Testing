import org.example.*;
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
        electronics.clickCellPhonesAndAccessories();
        electronics.selectSize();
        electronics.selectProduct();

    }
    @Test
    public void productDetailsAndCartVerification(){
        ProductDetails productDetails=new ProductDetails(driver);
        CartPage cartPage=new CartPage(driver);

        productDetails.getNameAndPrice();

        //cartPage.selectCart();
    }
    @Test
    public void checkoutProcess(){
        CheckoutPage checkoutPage=new CheckoutPage(driver);
        CartPage cartPage=new CartPage(driver);

        cartPage.addToCart();
        checkoutPage.getTotal();
        checkoutPage.checkout();
    }

    @AfterClass
    public void afterMethod() {
        driver.quit();
    }

}
