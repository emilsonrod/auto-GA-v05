package org.umssdiplo.automationv01.core.managepage.puma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.List;

public class PumaPage extends BasePage {

    @FindBy(xpath = "//a[@href='/calzado_de_futbol-hombre']")
    private WebElement linkFutbol;

    @FindBy(xpath = "//a[@href='/hombre']")
    private WebElement linkMen;

    @FindBy(className = "gl-price__value--sale")
    private WebElement soccerCalzado;

    @FindBy(xpath = "//div[@class=\"gl-product-card__media\"]/a")
    private List<WebElement> itemElements;

    @FindBy(xpath = "//button[@class=\"gl-dropdown__select label dropdown-select\"][1]")
    private WebElement selectDropDown;

    @FindBy(xpath = "//li[@title=\"MX 9.5\"]/button")
    private WebElement selectLink;

    @FindBy(xpath = "//button[@class=\"gl-cta gl-cta--primary gl-cta--full-width btn-bag\"]")
    private WebElement addBag;

    @FindBy(xpath = "//span[@data-auto-id=\"add-to-bag-product-info-qty\"]")
    private WebElement textCantidad;

    @FindBy(xpath = "//a[@data-auto-id=\"view-bag-desktop\"]")
    private WebElement buttonVerCarrito;

    @FindBy(xpath = "//a[@class=\"name\"]")
    private WebElement textTitleCarrito;

    @FindBy(className = "cart-widget-label")
    private List<WebElement> dataElementsLabel;

    @FindBy(className = "cart-widget-value")
    private List<WebElement> dataElementsValue;

    public void goToPumaPage() {
        CommonEvents.clickButton(linkFutbol);
    }

    public void hoverMenLink() {
        CommonEvents.hoverElement(linkMen);
    }

    public String getPrice() {
        return CommonEvents.getTextContent(soccerCalzado);
    }

    public void clickFirstElement()
    {
        CommonEvents.clickButton(itemElements.get(0));
    }

    public void clickSelectSizeCalzado()
    {
        CommonEvents.clickButton(selectDropDown);
    }

    public void clickLinkSizeCalzado()
    {
        CommonEvents.clickButton(selectLink);
    }

    public void clickAddBag()
    {
        CommonEvents.clickButton(addBag);
    }

    public void verifyTextCantidad(String cantidad)
    {
        String textCantidadActual = CommonEvents.getTextContent(textCantidad);
        Boolean isCantidad = cantidad.equals(CommonEvents.getTextContent(textCantidad));
    }

    public void clickVerCarrito()
    {
        CommonEvents.clickButton(buttonVerCarrito);
    }

    public void verifyCard(String titleCheck, String cantidadCheck, String costoCheck, String totalCheck)
    {
        String title = CommonEvents.getTextContent(textTitleCarrito);
        String cantidad = CommonEvents.getTextContent(dataElementsLabel.get(0));
        String costo = CommonEvents.getTextContent(dataElementsValue.get(2));
        String total = CommonEvents.getTextContent(dataElementsValue.get(4));
        Boolean titleChecked = title.equals(titleCheck.toUpperCase());
        Boolean cantidadChecked = cantidad.equals(cantidadCheck.toUpperCase());
        Boolean costoChecked = costo.equals(costoCheck);
        Boolean totalChecked = total.equals(totalCheck);
    }
}
