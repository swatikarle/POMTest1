package regression;

import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {


    @Test
    public void loginTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crio-qkart-frontend-qa.vercel.app/login");

        Login login = new Login(driver);
        login.setTextUsername("test@QKART");
        login.setTextPassword("MyQKARTapp@1234");
        login.setloginbtn();

    }
}
