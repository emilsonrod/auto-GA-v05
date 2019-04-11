package org.umssdiplo.automationv01.core.managepage.RegistrarMaquinaria;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.List;

public class IngresarMaquinaria extends BasePage {

    @FindBy(name = "linkMaquinaria")
    private WebElement tabMaquinaria;

    @FindBy(name = "linkCatalog")
    private WebElement tabCatalog;

    @FindBy(name = "marca")
    private WebElement marca;

    @FindBy(name = "modelo")
    private WebElement modelo;

    @FindBy(name = "capacidad")
    private WebElement capacidad;

    @FindBy(name = "precio")
    private WebElement precio;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement image;

    @FindBy(className = "background-primary")
    private WebElement guardarBtn;

    @FindBy(xpath = "//h1[text()='TOYOTA']/parent::div/following-sibling::button/span[text()='Eliminar']")
    private List<WebElement> buttonsDelete;

    public void GoToPage(){
        CommonEvents.jsClickElement(tabMaquinaria);
    }

    public void GoToCatalog(){
        CommonEvents.jsClickElement(tabCatalog);
    }

    public void LoadFields(){

        String marcaField = PropertyAccessor.getInstance().getMarca();
        String modeloField = PropertyAccessor.getInstance().getModelo();
        String capacidadField = PropertyAccessor.getInstance().getCapacidad();
        String precioField = PropertyAccessor.getInstance().getPrecio();
        image.sendKeys("D://Diplomado/Modulo3/imagenes/grua1.jpg");
        CommonEvents.setInputField(marca, marcaField);
        CommonEvents.setInputField(modelo, modeloField);
        CommonEvents.setInputField(capacidad, capacidadField);
        CommonEvents.setInputField(precio, precioField);
        CommonEvents.clickButton(guardarBtn);
    }

    public void DeleteMaquinaria(){
        CommonEvents.clickButton(buttonsDelete.get(0));
    }
}
