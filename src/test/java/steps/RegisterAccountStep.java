package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.RegisterAccountPage;
import runner.RunTest;

public class RegisterAccountStep extends RunTest {
    RegisterAccountPage registerAccountPage = new RegisterAccountPage(driver);
    @E("preencho os dados de cadastro")
    public void preencherDadosCadastrais() {
        registerAccountPage.gerarDadosFake();
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
