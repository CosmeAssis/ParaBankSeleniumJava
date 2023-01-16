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
        registerAccountPage.preencheFirstName();
        registerAccountPage.preencheLastName();
        registerAccountPage.preencheStreetAddress();
        registerAccountPage.preencheCity();
        registerAccountPage.preencheState();
        registerAccountPage.preencheZipCode();
        registerAccountPage.preenchePhoneNumber();
        registerAccountPage.preencheSSN();
        registerAccountPage.preencheUsernameRegister();
        registerAccountPage.preenchePasswordRegister();
        registerAccountPage.preencheConfirmPasswordRegister();
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
