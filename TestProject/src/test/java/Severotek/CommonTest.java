package Severotek;

import Pages.BlogEntryPage;
import Pages.BlogPage;
import Pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avo1d\\IdeaProjects\\TestProject\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://igorakintev.ru/admin/");
    }


    @Test(description = "Common test")
    public void CommonTest() throws Exception{
        System.out.println("Step 1. Login via selenium");
        LoginPage loginPage = new LoginPage(driver);
        BlogPage blogPage = loginPage.login("selenium", "super_password");


        System.out.println("Step 2. Check ..");
        String blogPageHeadingText = blogPage.getHeadingText();
        Assert.assertEquals("Панель управления", blogPageHeadingText);

        System.out.println("Step 3. Go to 'Add entry' page");
        BlogEntryPage blogEntryPage = blogPage.clickEntriesAddButton();
        String blogEntryPageHeadingText = blogEntryPage.getHeadingText();
        Assert.assertEquals("Добавить entry", blogEntryPageHeadingText);

        System.out.println("Step 4. Filling the fields");

        String title = "Title"+Math.round(Math.random()*10000);
        String slug = "Slug"+Math.round(Math.random()*10000);
        String markdown = "Markdown"+Math.round(Math.random()*10000);
        String text = "Text"+Math.round(Math.random()*10000);

        blogEntryPage.FillEntryForm(title, slug, markdown, text);
        String topic = blogPage.getTopEntryText();
        Assert.assertEquals(title, topic);
        blogPage.DeleteTopRecord();

        topic = blogPage.getTopEntryText();
        Assert.assertNotEquals(title, topic);
        Thread.sleep(10000);
    }



    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
