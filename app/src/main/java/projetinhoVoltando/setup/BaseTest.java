package projetinhoVoltando.setup;

import org.junit.After;

public class BaseTest {

    @After
    public void fecharDriver() {
        if (Propriedades.FECHAR_BROWSER) {
            DriverFactory.killDriver();
        }
    }
}
