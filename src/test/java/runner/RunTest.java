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
    //METODO FAKER LIBRARY - https://github.com/DiUS/java-faker
    Faker usFaker = new Faker(new Locale("en-US"));
    String firstName = usFaker.name().firstName();
    public String getFirstNameFake(){
        return firstName;
    }
    String lastName = usFaker.name().lastName();
    public String getLastNameFake(){
        return lastName;
    }
    String addressStreet = usFaker.address().streetAddress();

    public String getAddressStreet(){
        return addressStreet;
    }
    String addressCity = usFaker.address().cityName();

    public String getAddressCity(){
        return addressCity;
    }
    String addressState = usFaker.address().state();

    public String getAddressState(){
        return addressState;
    }
    String addressZipCode = usFaker.address().zipCode();

    public String getAddressZipCode(){
        return addressZipCode;
    }

    String phoneNumber = usFaker.phoneNumber().cellPhone();

    public String getPhoneNumber(){
        return phoneNumber;
    }
    String socialNumber = usFaker.idNumber().ssnValid();

    public String getSocialNumber(){
        return socialNumber;
    }
    String customerUsername = usFaker.dragonBall().character();

    public String getCustomerUsername(){
        return customerUsername;
    }

    Double customerPassword = usFaker.number().randomDouble(15159999,15150000,15159999);
    String  textPassword = customerPassword.toString();

    public String getCustomerPassword(){
        return textPassword;
    }

}
