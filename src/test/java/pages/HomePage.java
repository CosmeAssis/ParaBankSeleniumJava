package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarSite(){
        driver.get("https://parabank.parasoft.com/parabank");
        aguardarElementoExibir(By.xpath("//img[@title='ParaBank']"));
        //Assert.assertEquals(true,driver.findElement(By.xpath("//img[@title='ParaBank']")).isDisplayed());
    }

    public void clicarRegister(){
        driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
    }
}
