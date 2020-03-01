package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonPage {


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By signInButton = By.xpath("//*[@id=\"login-form\"]/div[3]/input");
    private By userNameField = By.xpath("//input[@id=\"id_username\"]");
    private By userPasswordField = By.xpath("//input[@id=\"id_password\"]");


    public LoginPage submitSignIn() {
        driver.findElement(signInButton).submit();
        return new LoginPage(driver);
    }
    public LoginPage typeUserName(String username) {
        driver.findElement(userNameField).sendKeys(username);
        return new LoginPage(driver);
    }
    public LoginPage typeUserPassword(String password) {
        driver.findElement(userPasswordField).sendKeys(password);
        return new LoginPage(driver);
    }
    public BlogPage login(String username, String password) throws Exception{
        this.typeUserName(username);
        this.typeUserPassword(password);
        this.submitSignIn();
        Thread.sleep(2000);
        return new BlogPage(driver);
    }
}
