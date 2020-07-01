import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BlogEntryPageTest {
    private WebDriver driver;
    private BlogEntryPage blogEntryPage;
    private LoginPage loginPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avo1d\\IdeaProjects\\TestProject\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://igorakintev.ru/admin/blog/entry/add/");
        blogEntryPage = new BlogEntryPage(driver);
    }

    @Test
    public void FillEntryForm(){
        LoginPage entryPage =loginPage.register("selenium", "super_password");
        LoginPage entryPage1 = loginPage.clickEntriesAddButton();
        BlogEntryPage newblogEntryPage1 = blogEntryPage.FillEntryForm("Title13131", "Slug2131321", "Slug3313213", "Slug211321");
        String topic = newblogEntryPage1.getHeadingText();
        Assert.assertEquals("Title13131", topic);

    }
    @After
    public void tearDown(){
        driver.quit();
    }


}
