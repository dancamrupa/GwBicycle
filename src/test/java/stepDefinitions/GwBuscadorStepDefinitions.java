package stepDefinitions;

import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.GwSteps;

public class GwBuscadorStepDefinitions {

    @Steps
    GwSteps gwSteps = new GwSteps();

    @Given("^que me encuentro en la pagina de GwBicycle con la url (.*)$")
    public void queMeEncuentroEnLaPaginaDeGwBicycleConLaUrlHttpsWwwGwbicyclesComco(String url) {
        SeleniumWebDriver.ChromeWebDriver(url);
    }

    @When("^busco los productos de mi interes$")
    public void buscoLosProductosDeMiInteres() {
        GwSteps.buscarProducto();
    }

    @Then("^encontrar productos a comprar$")
    public void encontrarProductosAComprar() {
       SeleniumWebDriver.driver.quit();
    }

}
