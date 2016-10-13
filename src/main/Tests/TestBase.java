import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class TestBase {
    private String iPhoneUserAgent = "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16";
    private WebDriver driver;
    private FirefoxProfile fireFoxfProfile;
    private String baseUrl;
    Navigation navigation;
    HomePage homePage;
    public boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        baseUrl = "http://www.whatsmyua.com/";
        //Change browser user agent
        fireFoxfProfile = new FirefoxProfile();
        fireFoxfProfile.setPreference("general.useragent.override", iPhoneUserAgent);
        driver = new FirefoxDriver(fireFoxfProfile);
        navigation = new Navigation(driver, baseUrl);
        homePage = new HomePage(driver, baseUrl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
