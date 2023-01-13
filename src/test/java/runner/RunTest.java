package runner;

import com.github.javafaker.Faker;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        //tags = {"~@ignore"},
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
