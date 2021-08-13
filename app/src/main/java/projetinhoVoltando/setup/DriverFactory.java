package projetinhoVoltando.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (Propriedades.Navegadores) {
                case CHROME -> driver = new ChromeDriver();
                case FIREFOX -> driver = new FirefoxDriver();
            }

            wait = new WebDriverWait(driver, 40);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void killDriver() {
        if(driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

}

