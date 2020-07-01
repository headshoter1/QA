import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By signInButton = By.xpath("//*[@id=\"login-form\"]/div[3]/input");
    private By userNameField = By.xpath("//input[@id=\"id_username\"]");
    private By userPasswordField = By.xpath("//input[@id=\"id_password\"]");
    private By EntriesAddButton = By.xpath("//*[@id=\"module_2\"]/div/ul[1]/li[1]/ul/li[1]/a/span");
    private By BlogHeading = By.xpath("//*[@id=\"content\"]/h1");

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
    public LoginPage register(String username, String password){
        this.typeUserName(username);
        this.typeUserPassword(password);
        this.submitSignIn();
        return new LoginPage(driver);
    }
    public LoginPage clickEntriesAddButton(){
        driver.findElement(EntriesAddButton).click();
        return new LoginPage(driver);
    }

    public String getHeadingText() {
        return driver.findElement(BlogHeading).getText();
    }
}
