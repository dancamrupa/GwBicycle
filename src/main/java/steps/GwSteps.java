package steps;

import pages.GwPage;
import org.openqa.selenium.By;
import driver.SeleniumWebDriver;
import utils.Excel;

import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GwSteps {

    private static ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String,String>>();

    public static void escribirEnTexto(By elemento, String texto) {SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);}
    public static void clicEnElemento(By elemento) {SeleniumWebDriver.driver.findElement(elemento).click();}
    public static String obtenerTextoDeElemento(By elemento) {return SeleniumWebDriver.driver.findElement(elemento).getText();}
    public static void validarTextoEnPantalla(By elemento, String texto) {assertEquals(obtenerTextoDeElemento(elemento),texto);}

    public static void buscarProducto() {
        try {
            lecturaExcel = Excel.readExcel("C:\\Users\\Camilo Ruiz\\Desktop\\Semillero - QA Automation\\Proyecto\\Excel_BD_GwBicycles.xlsx", "Hoja1");
            } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }

        for (int i = 0; i < lecturaExcel.size(); i++) {

            clicEnElemento(GwPage.getBtnBuscador());
            escribirEnTexto(GwPage.getTxtBuscador(), lecturaExcel.get(i).get("Productos"));
            clicEnElemento(GwPage.getBtn1Buscador());
            GwPage.setLblProducto(lecturaExcel.get(i).get("Productos"));
            clicEnElemento(GwPage.getLblProducto());
            GwPage.setBtnProducto(lecturaExcel.get(i).get("Productos"));
            validarTextoEnPantalla(GwPage.getBtnProducto(), lecturaExcel.get(i).get("Productos"));
        }
    }
}
