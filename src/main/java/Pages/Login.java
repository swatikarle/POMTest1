package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    @FindBy (id="username")
    WebElement textUsername;

    @FindBy (id="password")
    WebElement Textpassword;

    @FindBy (xpath="//button[normalize-space()='Login to QKart']")
    WebElement loginbtn;


    public Login (WebDriver driver)
    {

        PageFactory.initElements(driver, this);
    }

    public void setTextUsername(String username){
        textUsername.sendKeys(username);
    }

    public void setTextPassword(String passwordn){
        Textpassword.sendKeys(passwordn);
    }

    public void setloginbtn(){
        loginbtn.click();
    }




}
