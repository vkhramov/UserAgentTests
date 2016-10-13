import org.openqa.selenium.WebDriver;

public class Navigation {
    private WebDriver driver;
    private String baseUrl;

    public Navigation (WebDriver driver, String baseUrl){
        this.driver = driver;
        this.baseUrl = baseUrl;
    }

    public void OpenHomePage() {
        driver.get(baseUrl);
    }


}
