package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooksclass {
    public static WebDriver driver;

    @Before
    public void init()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\003SIG744\\Desktop\\Oct\\Software\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("driver initialization");
    }

    @After
    public void quit()
    {
        driver.quit();
        System.out.println("closing driver");
    }
}
