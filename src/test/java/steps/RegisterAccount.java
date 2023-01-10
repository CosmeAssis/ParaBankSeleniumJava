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
    public void preenchoOsDadosDeCadastro() {
        RunTest runTest = new RunTest();
        driver.findElement(By.id("customer.firstName")).sendKeys(faker.firstNameFake());
    }

    @E("clico no botão Register")
    public void clicoNoBotãoRegister() {
    }

    @Então("mensagem de conta criada com sucesso é exibida")
    public void mensagemDeContaCriadaComSucessoÉExibida() {

    }
}
