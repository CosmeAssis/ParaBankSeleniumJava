package pages;

import com.github.javafaker.Faker;
import dev.failsafe.Fallback;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunTest;
import support.Utils;

import java.util.Locale;

public class RegisterAccountPage extends Utils {
    WebDriver driver;

    private By fieldFirstName = By.id("customer.firstName");
    private By fieldLastName = By.id("customer.lastName");
    private By fieldStreetAddress = By.id("customer.address.street");
    private By fieldCityName = By.id("customer.address.city");
    private By fieldStateName = By.id("customer.address.state");
    private By fieldZipCode = By.id("customer.address.zipCode");
    private By fieldPhoneNumber = By.id("customer.phoneNumber");
    private By fieldSsnNumber = By.id("customer.ssn");
    private By fieldUsername = By.id("customer.username");
    private By fieldPassword = By.id("customer.password");
    private By fieldRepeatPassword = By.id("repeatedPassword");

    public void preencheFirstName(){
        driver.findElement(fieldFirstName).sendKeys(generateFakerFirstName);
    }
    public void preencheLastName(){
        driver.findElement(fieldLastName).sendKeys(generateFakerLastName);
    }
    public void preencheStreetAddress(){
        driver.findElement(fieldStreetAddress).sendKeys(generateFakerStreetAddress);
    }
    public void preencheCity(){
        driver.findElement(fieldCityName).sendKeys(generateFakerCity);
    }
    public void preencheState(){
        driver.findElement(fieldStateName).sendKeys(generateFakerState);
    }
    public void preencheZipCode(){
        driver.findElement(fieldZipCode).sendKeys(generateZipCode);
    }
    public void preenchePhoneNumber(){
        driver.findElement(fieldPhoneNumber).sendKeys(generatePhoneNumber);
    }
    public void preencheSSN(){
        driver.findElement(fieldSsnNumber).sendKeys(generateSsnNumber);
    }
    public void preencheUsernameRegister(){
        driver.findElement(fieldUsername).sendKeys(generateUsernameRegister);
    }
    public void preenchePasswordRegister(){
        driver.findElement(fieldPassword).sendKeys(registerPassword);
    }
    public void preencheConfirmPasswordRegister(){
        driver.findElement(fieldRepeatPassword).sendKeys(registerPassword);
    }
    public RegisterAccountPage(WebDriver driver) {
        this.driver = driver;
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
