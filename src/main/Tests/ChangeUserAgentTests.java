import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeUserAgentTests extends TestBase{
    private static final String iPhoneUserAgent = "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16";

    @Test
    public void ChangeAndCheckUserAgent(){
        navigation.OpenHomePage();
        Assert.assertEquals(homePage.GetUserAgentValue(), iPhoneUserAgent);
    }
}
