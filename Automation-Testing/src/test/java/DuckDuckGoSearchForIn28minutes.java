import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DuckDuckGoSearchForIn28minutes {
    private WebDriver driver;

    @Before()
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testDuckDuckGoSearchForIn28minutes() {
        driver.get("https://www.duckduckgo.com/");
        driver.findElement(By.id("search_form_input_homepage")).click();
        driver.findElement(By.id("search_form_input_homepage")).clear();
        driver.findElement(By.id("search_form_input_homepage")).sendKeys("in28minutes");
        driver.findElement(By.id("search_form_input_homepage")).sendKeys(Keys.ENTER);
    }

    @After()
    public void tearDown() {
        driver.quit();
    }
}