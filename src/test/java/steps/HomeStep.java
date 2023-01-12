package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import runner.RunTest;

public class HomeStep extends RunTest {

    HomePage homePage = new HomePage(driver);
    @Dado("que acesso o site ParaBank")
    public void acessoSiteParaBank() {
        homePage.acessarSite();
    }

    @Quando("clicar em Register")
    public void clicarEmRegister() {
        homePage.clicarRegister();
    }

}
