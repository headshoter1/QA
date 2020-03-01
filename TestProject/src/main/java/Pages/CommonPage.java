package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class CommonPage {
    protected WebDriver driver;

    protected By BlogHeading = By.xpath("//*[@id=\"content\"]/h1");
    protected By BlogTopHeading = By.xpath("//*[@id=\"result_list\"]/tbody/tr[1]/th/a");

    public String getHeadingText(){
        return driver.findElement(BlogHeading).getText();
    }

//    public String getTopHeadingText(){
//        return driver.findElement(BlogTopHeading).getText();
//    }



}
