package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class BlogEntryPage extends CommonPage {

    public BlogEntryPage(WebDriver driver) {
        this.driver = driver;
    }

    private By BlogHeading = By.xpath("//*[@id=\"content\"]/h1");
    private By Topic = By.xpath("//*[@id=\"result_list\"]/tbody/tr[1]/th/a");
    private By TitleField = By.xpath("//*[@id=\"id_title\"]");
    private By SlugField = By.xpath("//*[@id=\"id_slug\"]");
    private By TextMarkDownField = By.xpath("//*[@id=\"id_text_markdown\"]");
    private By TextField = By.xpath("//*[@id=\"id_text\"]");
    private By EntryFormButton = By.xpath("//*[@id=\"entry_form\"]/div/div/input[1]");


    public BlogEntryPage TypeToTitleField (String title){
        driver.findElement(TitleField).sendKeys(title);
        return this;
    }
    public BlogEntryPage TypeToSlugField (String slug){
        driver.findElement(SlugField).sendKeys(slug);
        return this;
    }
    public BlogEntryPage TypeToTextMarkDownField (String markdown){
        driver.findElement(TextMarkDownField).sendKeys(markdown);
        return this;
    }
    public BlogEntryPage TypeToTextField (String text){
        driver.findElement(TextField).sendKeys(text);
        return this;
    }

    public BlogEntryPage FillEntryForm (String title, String slug, String markdown, String text){
        this.TypeToTitleField(title);
        this.TypeToSlugField(slug);
        this.TypeToTextMarkDownField(markdown);
        this.TypeToTextField(text);
        driver.findElement(EntryFormButton).click();
        return new BlogEntryPage(driver);
    }
}
