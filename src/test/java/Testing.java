import org.example.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Testing{
    WebDriver driver;
    String url="https://www.ebay.com/";


    @DataProvider(name="checkoutData")
    public static Object[][] checkoutData() {
        return new Object[][]{{"Nimal", "Silva","Galle Rd, Colombo","Perera Rd, Colombo 10","Colombo","Western"
                ,"100000","nimalsilva@gmail.com","nimalsilva@gmail.com","0112589634"}};
    }



    @BeforeClass
    public void beforeMethod() {
        System.setProperty("web driver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void basicNavigation() {
        HomePage homePage=new HomePage(driver);
        homePage.verifyUrl(url);
    }

    @Test(priority = 1)
    public void categoryAndProductSelection() {
        HomePage homePage=new HomePage(driver);
        Electronics electronics=new Electronics(driver);
        homePage.clickElectronics();
        electronics.clickCellPhonesAndAccessories();
        electronics.selectSize();
        electronics.selectProduct();

    }
    @Test(priority = 2)
    public void productDetailsAndCartVerification(){
        ProductDetails productDetails=new ProductDetails(driver);
        CartPage cartPage=new CartPage(driver);

        productDetails.getNameAndPrice();

        //cartPage.selectCart();
    }

    @Test(priority = 3)
    public void addToCart(){
        CartPage cartPage=new CartPage(driver);

        cartPage.addToCart();
    }
    @Test(priority = 4)
    public void checkoutProcess(){
        CheckoutPage checkoutPage=new CheckoutPage(driver);

        checkoutPage.getTotal();
        checkoutPage.checkout();

    }
    @Test
    public void productDetailsAndCartVerification(){
        ProductDetails productDetails=new ProductDetails(driver);
        CartPage cartPage=new CartPage(driver);

        productDetails.getNameAndPrice();



    @Test(priority = 5,dataProvider = "checkoutData")

    public void fillInformation(String firstName, String lastName,String address1,String address2, String city,String stateOrProvince, String postalCode,String email,String emailConfirm,String phoneNumber){
        CheckoutPage checkoutPage=new CheckoutPage(driver);

        checkoutPage.fillCheckoutForm(firstName,lastName,address1,address2,city,stateOrProvince, postalCode,email,emailConfirm, phoneNumber);
    }



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
