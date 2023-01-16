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
   /* private By lastName = By.id("customer.lastName");
    private By streetAddress = By.id("customer.address.street");
    private By cityName = By.id("customer.address.street");
    private By stateName = By.id("customer.address.state");
    private By zipCode = By.id("customer.address.zipCode");
    private By phoneNumber = By.id("customer.phoneNumber");
    private By ssnNumber = By.id("customer.ssn");
    private By username = By.id("customer.username");
    private By password = By.id("customer.password");
    private By repeatPassword = By.id("repeatedPassword");*/



    public void preencheFirstName(){
        driver.findElement(fieldFirstName).sendKeys(generateFakerFirstName);
    }
/*    private String fakerLastName = faker.name().lastName();
    private String fakerStreetAddress = faker.address().streetAddress();
    private String fakerCityName = faker.address().cityName();*/

    public RegisterAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void gerarDadosFake(){
/*        driver.findElement(By.id("customer.lastName")).sendKeys(faker.name().lastName());
        driver.findElement(By.id("customer.address.street")).sendKeys(faker.address().streetAddress());
        driver.findElement(By.id("customer.address.city")).sendKeys(faker.address().cityName());
        driver.findElement(By.id("customer.address.state")).sendKeys(faker.address().state());
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(faker.address().zipCode());
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(faker.phoneNumber().cellPhone());
        driver.findElement(By.id("customer.ssn")).sendKeys(faker.idNumber().ssnValid());
        driver.findElement(By.id("customer.username")).sendKeys(faker.dragonBall().character());
        driver.findElement(By.id("customer.password")).sendKeys("135791");
        driver.findElement(By.id("repeatedPassword")).sendKeys("135791");*/
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
