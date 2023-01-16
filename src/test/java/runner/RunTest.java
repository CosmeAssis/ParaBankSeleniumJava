package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/report.json","html:target/reports/report.html"},
        features = "src/test/resources/features/",
        tags = "@Registar_NovaConta",
        glue = {"steps"}
)

public class RunTest {

    public static WebDriver driver;

    @BeforeClass
    public static void start(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void stop(){

        driver.quit();
    }

}
