package projetinhoVoltando.testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import projetinhoVoltando.pages.HomePage;
import projetinhoVoltando.pages.RankPage;
import projetinhoVoltando.setup.BaseTest;
import projetinhoVoltando.setup.DriverFactory;

public class testeRankingPage extends BaseTest {

    private WebDriver driver;
    HomePage homePage = new HomePage(driver);
    RankPage rankPage= new RankPage(driver);

    @Before
    public void criarDriver() {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        rankPage = new RankPage(driver);
    }

    @Test
    public void acessarRanking() {
        homePage.acessarHomePageHLTV();
        homePage.acessarRankHLTV();
        Assert.assertEquals("CS:GO World ranking on August 9th, 2021",
                rankPage.obterTextoCabecalho());
    }

}
