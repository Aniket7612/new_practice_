

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class SeleniumTest {

    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        driver = new ChromeDriver(options);
        options.addArguments("--remote-allow-origins");
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        driver.close();

    }
}