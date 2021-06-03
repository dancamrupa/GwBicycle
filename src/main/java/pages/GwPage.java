package pages;

import org.openqa.selenium.By;

public class GwPage {

    private static By btnBuscador = By.xpath("//a[@href = '/search']");
    private static By txtBuscador = By.xpath("//input[@name = 'q']");
    private static By btn1Buscador = By.xpath("//button[@class = 'text-link site-header__search-btn site-header__search-btn--submit']");

    private static By btnProducto;
    private static By lblProducto;

    public static By getLblProducto() {return lblProducto;}
    public static void setLblProducto(String Producto) {GwPage.lblProducto = By.xpath("//div[contains(text(),'"+Producto+"')]//ancestor::a");}

    public static By getBtnProducto() {return btnProducto;}
    public static void setBtnProducto(String Producto) {GwPage.btnProducto = By.xpath("//h1[contains(text(),'"+Producto+"')]");}

    public static By getBtnBuscador() {return btnBuscador;}
    public static By getTxtBuscador() {return txtBuscador;}
    public static By getBtn1Buscador() {return btn1Buscador;}


}