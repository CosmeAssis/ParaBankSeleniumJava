package pages;

import com.github.javafaker.Faker;
import dev.failsafe.Fallback;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class RegisterAccountPage {
    WebDriver driver;
    Faker faker = new Faker(new Locale("en-US"));

    public RegisterAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void gerarDadosFake(){
        driver.findElement(By.id("customer.firstName")).sendKeys(faker.name().firstName());
        driver.findElement(By.id("customer.lastName")).sendKeys(faker.name().lastName());
        driver.findElement(By.id("customer.address.street")).sendKeys(faker.address().streetAddress());
        driver.findElement(By.id("customer.address.city")).sendKeys(faker.address().cityName());
        driver.findElement(By.id("customer.address.state")).sendKeys(faker.address().state());
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(faker.address().zipCode());
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(faker.phoneNumber().cellPhone());
        driver.findElement(By.id("customer.ssn")).sendKeys(faker.idNumber().ssnValid());
        driver.findElement(By.id("customer.username")).sendKeys(faker.dragonBall().character());
        Double customerPassword = faker.number().randomDouble(15159999,15150000,15159999);
        String  textPassword = customerPassword.toString();
        driver.findElement(By.id("customer.password")).sendKeys(textPassword);
        driver.findElement(By.id("repeatedPassword")).sendKeys(textPassword);
    }

    public void clicarBotaoRegister(){
        driver.findElement(By.xpath("//input[@value='Register']")).click();
    }

}
