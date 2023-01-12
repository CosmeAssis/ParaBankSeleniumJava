package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunTest;

public class RegisterAccountStep extends RunTest {
    RunTest faker = new RunTest();

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
        driver.findElement(By.xpath("//input[@value='Register']")).click();
    }

    @Então("mensagem de conta criada com sucesso é exibida")
    public void mensagemContaCriadaComSucesso() {
        String mensagemAccCriadaSucesso = driver.findElement(By.xpath("//p[contains(.,'Your account was created successfully. You are now logged in.')]")).getText();
        Assert.assertEquals("Your account was created successfully. You are now logged in.",mensagemAccCriadaSucesso);
    }
}
