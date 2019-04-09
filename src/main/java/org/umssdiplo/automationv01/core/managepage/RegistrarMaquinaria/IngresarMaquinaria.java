package org.umssdiplo.automationv01.core.managepage.RegistrarMaquinaria;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class IngresarMaquinaria extends BasePage {

    @FindBy(name = "linkMaquinaria")
    private WebElement tabMaquinaria;

    @FindBy(name = "marca")
    private WebElement marca;

    @FindBy(name = "modelo")
    private WebElement modelo;

    @FindBy(name = "capacidad")
    private WebElement capacidad;

    @FindBy(name = "precio")
    private WebElement precio;

    @FindBy(className = "background-primary")
    private WebElement guardarBtn;

    public void GoToPage(){
        CommonEvents.jsClickElement(tabMaquinaria);
    }

    public void LoadFields(){

        String marcaField = PropertyAccessor.getInstance().getMarca();
        String modeloField = PropertyAccessor.getInstance().getModelo();
        String capacidadField = PropertyAccessor.getInstance().getCapacidad();
        String precioField = PropertyAccessor.getInstance().getPrecio();
        CommonEvents.setInputField(marca, marcaField);
        CommonEvents.setInputField(modelo, modeloField);
        CommonEvents.setInputField(capacidad, capacidadField);
        CommonEvents.setInputField(precio, precioField);
        CommonEvents.clickButton(guardarBtn);
    }
}
