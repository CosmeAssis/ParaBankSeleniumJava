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
       registerAccountPage.clicarBotaoRegister();
    }

    @Então("mensagem de conta criada com sucesso é exibida")
    public void mensagemContaCriadaComSucesso() {
        registerAccountPage.msgContaCriadaSucesso();
    }
}
