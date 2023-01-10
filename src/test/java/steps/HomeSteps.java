package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.RunTest;

public class HomeSteps extends RunTest {

    @Dado("que acesso o site ParaBank")
    public void acessoSiteParaBank() {
        driver.get("https://parabank.parasoft.com/parabank");
        Assert.assertEquals(true,driver.findElement(By.xpath("//img[@title='ParaBank']")).isDisplayed());
    }

    @Quando("clicar no botão Log In")
    public void clicarBotãoLogIn() {
        driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
    }
}
