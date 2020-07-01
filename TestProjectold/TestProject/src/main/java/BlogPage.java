import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class BlogPage {
    private WebDriver driver;

    public BlogPage(WebDriver driver) {
        this.driver = driver;
    }

    private By BlogHeading = By.xpath("//*[@id=\"content\"]/h1");
    private By TitleField = By.xpath("//*[@id=\"id_title\"]");
    private By SlugField = By.xpath("//*[@id=\"id_slug\"]");
    private By TextMarkDownField = By.xpath("//*[@id=\"id_text_markdown\"]");
    private By TextField = By.xpath("//*[@id=\"id_text\"]");
    private By EntryFormButton = By.xpath("//*[@id=\"entry_form\"]/div/div/input[1]");


    public BlogPage TypeToTitleField (String title){
        driver.findElement(TitleField).sendKeys(title);
        return this;
    }
    public BlogPage TypeToSlugField (String slug){
        driver.findElement(SlugField).sendKeys(slug);
        return this;
    }
    public BlogPage TypeToTextMarkDownField (String markdown){
        driver.findElement(TextMarkDownField).sendKeys(markdown);
        return this;
    }
    public BlogPage TypeToTextField (String text){
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
    public String getHeadingText(){
        return driver.findElement(BlogHeading).getText();
    }
}
