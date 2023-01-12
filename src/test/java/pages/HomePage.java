package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarSite(){
        driver.get("https://parabank.parasoft.com/parabank");
        Assert.assertEquals(true,driver.findElement(By.xpath("//img[@title='ParaBank']")).isDisplayed());
    }

    public void clicarRegister(){
        driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
    }
}
