import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avo1d\\IdeaProjects\\TestProject\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
//        driver.get("http://igorakintev.ru/admin");
//        loginPage.register("selenium", "super_password");

//        driver.get("http://igorakintev.ru/admin");
//        driver.findElement(By.xpath("//input[@id=\"id_username\"]")).sendKeys("selenium");
//        driver.findElement(By.xpath("//input[@id=\"id_password\"]")).sendKeys("super_password");
//        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).submit();
////        driver.manage().window().maximize();
//        String header1 = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
//        if (header1.equals("\u041f\u0430\u043d\u0435\u043b\u044c \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f")) {
//            System.out.println(header1);
//        }
//        else {
//            System.out.println("Нет заголовка");
//        }
//        driver.findElement(By.xpath("//*[@id=\"module_2\"]/div/ul[1]/li[1]/ul/li[1]/a/span")).click();
//
//        String header2 = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
//        if (header2.equals("\u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c entry")) {
//            System.out.println(header2);
//        }
//        else {
//            System.out.println("Нет заголовка");
//        }
//        driver.findElement(By.xpath("//*[@id=\"id_title\"]")).sendKeys("Title43565463456");
//        driver.findElement(By.xpath("//*[@id=\"id_slug\"]")).clear();
//        driver.findElement(By.xpath("//*[@id=\"id_slug\"]")).sendKeys("Slug43565463456");
//        driver.findElement(By.xpath("//*[@id=\"id_text_markdown\"]")).sendKeys("Slug43565463456");
//        driver.findElement(By.xpath("//*[@id=\"id_text\"]")).sendKeys("Slug43565463456");
//        driver.findElement(By.xpath("//*[@id=\"entry_form\"]/div/div/input[1]")).submit();

    }
}
