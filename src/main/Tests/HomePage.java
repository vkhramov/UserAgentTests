import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;


    HomePage(WebDriver driver, String baseUrl){
        this.driver = driver;
    }

    String GetUserAgentValue(){
        return driver.findElement(By.xpath("//a[@id='ua-link']")).getText();
    }

}
