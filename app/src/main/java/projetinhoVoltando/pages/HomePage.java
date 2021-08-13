package projetinhoVoltando.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import projetinhoVoltando.setup.Constantes;

public class HomePage implements Constantes {

    protected final WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = ".//h1/a")
    private WebElement botaoRanking;

    public void acessarHomePageHLTV() {
        driver.get(HOME_URL);
    }

    public void acessarRankHLTV() {
        botaoRanking.click();
    }

}
