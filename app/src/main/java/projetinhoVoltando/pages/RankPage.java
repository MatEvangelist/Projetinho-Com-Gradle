package projetinhoVoltando.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RankPage {

    protected final WebDriver driver;

    public RankPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.CSS, using = ".regional-ranking-header")
    private WebElement cabecalhoRanking;


    public String obterTextoCabecalho() {
        return cabecalhoRanking.getText();
    }

}
