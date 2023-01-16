package support;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunTest;

import java.time.Duration;
import java.util.Locale;

public class Utils extends RunTest {
    Faker faker = new Faker(new Locale("en-US"));
    public String generateFakerFirstName = faker.name().firstName();
    public String generateFakerLastName = faker.name().lastName();
    public String generateFakerStreetAddress = faker.address().streetAddress();
    public String generateFakerCity = faker.address().cityName();
    public String generateFakerState = faker.address().state();
    public String generateZipCode = faker.address().zipCode();
    public String generatePhoneNumber = faker.phoneNumber().cellPhone();
    public String generateSsnNumber = faker.idNumber().ssnValid();
    public String generateUsernameRegister = faker.dragonBall().character();
    public String registerPassword = "135791";
    public void aguardarElementoExibir(By element){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

}
