import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avo1d\\IdeaProjects\\TestProject\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://igorakintev.ru/admin/");
        loginPage = new LoginPage(driver);
    }



    @Test
    public void registerTestPassed(){
        LoginPage newloginPage = loginPage.register("selenium", "super_password");
        String heading = newloginPage.getHeadingText();
        Assert.assertEquals("Панель управления", heading);
    }

    @Test
    public void pushEntriesButton(){
        LoginPage newloginPage1 = loginPage.register("selenium", "super_password");
        LoginPage newblogEntryPage = loginPage.clickEntriesAddButton();
        String heading = newblogEntryPage.getHeadingText();
        Assert.assertEquals("Добавить entry", heading);
    }



    @After
    public void tearDown(){
        driver.quit();
    }
}
