package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class BlogPage extends CommonPage {

    public BlogPage(WebDriver driver) {
        this.driver = driver;
    }

    private By BlogHeading = By.xpath("//*[@id=\"content\"]/h1");
    private By TitleField = By.xpath("//*[@id=\"id_title\"]");
    private By SlugField = By.xpath("//*[@id=\"id_slug\"]");
    private By TextMarkDownField = By.xpath("//*[@id=\"id_text_markdown\"]");
    private By TextField = By.xpath("//*[@id=\"id_text\"]");
    private By EntryFormButton = By.xpath("//*[@id=\"entry_form\"]/div/div/input[1]");
    private By EntriesAddButton = By.xpath("//*[@id=\"module_2\"]/div/ul[1]/li[1]/ul/li[1]/a/span");
    protected By CheckBox = By.xpath("//*[@id=\"result_list\"]/tbody/tr[1]/td[1]/input");
    protected By CheckList = By.xpath("//*[@id=\"changelist-form\"]/div[2]/label/select");
    protected By DeleteField = By.xpath("//*[@id=\"changelist-form\"]/div[2]/label/select/option[2]");
    protected By ExecuteButton = By.xpath("//*[@id=\"changelist-form\"]/div[2]/button");
    protected By SubmitButton = By.xpath("//*[@id=\"content\"]/form/div/input[4]");
    protected By BlogTopEntry = By.xpath("//*[@id=\"result_list\"]/tbody/tr[1]/th/a");
    public BlogEntryPage clickEntriesAddButton(){
        driver.findElement(EntriesAddButton).click();
        return new BlogEntryPage(driver);
    }

    public void checkBoxClick(){
        driver.findElement(CheckBox).click();
    }

    public void checkListClick(){
        driver.findElement(CheckList).click();
    }

    public void chooseDeleteField(){
        driver.findElement(DeleteField).click();
    }
    public void executeButtonClick(){
        driver.findElement(ExecuteButton).click();

    }
    public void pushSubmitButton(){
        driver.findElement(SubmitButton).submit();
    }
    public void DeleteTopRecord(){
        this.checkBoxClick();
        this.checkListClick();
        this.chooseDeleteField();
        this.executeButtonClick();
        this.pushSubmitButton();
    }

    public String getTopEntryText() {
        return driver.findElement(BlogTopEntry).getText();


    }


}
