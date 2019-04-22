package org.umssdiplo.automationv01.core.managepage.puma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class PumaPage extends BasePage {

    @FindBy(xpath = "//a[@href='/calzado_de_futbol-hombre']")
    private WebElement linkFutbol;

    @FindBy(xpath = "//a[@href='/hombre']")
    private WebElement linkMen;

    @FindBy(className = "gl-price__value--sale")
    private WebElement soccerCalzado;

    public void goToPumaPage() {
        CommonEvents.clickButton(linkFutbol);
    }

    public void hoverMenLink() {
        CommonEvents.hoverElement(linkMen);
    }

    public String getPrice() {
        return CommonEvents.getTextContent(soccerCalzado);
    }
}
