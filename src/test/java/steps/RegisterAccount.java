package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.RunTest;

import java.util.Locale;

public class RegisterAccount extends RunTest {
    RunTest faker = new RunTest();
    @Quando("clicar em Register")
    public void clicarEmRegister() {
        driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
    }

    @E("preencho os dados de cadastro")
    public void preencherDadosCadastrais() {
        RunTest runTest = new RunTest();
        driver.findElement(By.id("customer.firstName")).sendKeys(faker.getFirstNameFake());
        driver.findElement(By.id("customer.lastName")).sendKeys(faker.getLastNameFake());
        driver.findElement(By.id("customer.address.street")).sendKeys(faker.getAddressStreet());
        driver.findElement(By.id("customer.address.city")).sendKeys(faker.getAddressCity());
        driver.findElement(By.id("customer.address.state")).sendKeys(faker.getAddressState());
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(faker.getAddressZipCode());
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(faker.getPhoneNumber());
        driver.findElement(By.id("customer.ssn")).sendKeys(faker.getSocialNumber());
        driver.findElement(By.id("customer.username")).sendKeys(faker.getCustomerUsername());
        driver.findElement(By.id("customer.password")).sendKeys(faker.getCustomerPassword());
        driver.findElement(By.id("repeatedPassword")).sendKeys(faker.getCustomerPassword());
    }

    @E("clico no botão Register")
    public void clicarBotaoRegister() {
    }

    @Então("mensagem de conta criada com sucesso é exibida")
    public void mensagemDeContaCriadaComSucessoÉExibida() {

    }
}
