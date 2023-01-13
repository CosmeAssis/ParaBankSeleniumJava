package pages;

import com.github.javafaker.Faker;
import dev.failsafe.Fallback;
import org.junit.Assert;
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
        driver.findElement(By.id("customer.password")).sendKeys("135791");
        driver.findElement(By.id("repeatedPassword")).sendKeys("135791");
    }

    public void clicarBotaoRegister(){
        driver.findElement(By.xpath("//input[@value='Register']")).click();
    }

    public void msgContaCriadaSucesso()
    {
        String mensagemAccCriadaSucesso = driver.findElement(By.xpath("//p[contains(.,'Your account was created successfully. You are now logged in.')]")).getText();
        Assert.assertEquals("Your account was created successfully. You are now logged in.",mensagemAccCriadaSucesso);
    }

}
