package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.puma.PumaPage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private PumaPage pumaPage;
    private String priceCalzado;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }
    //va a la pagina de addidas mexico
    @Given("^puma page is loaded$")
    public void pumaPageIsLoaded() throws Throwable {
        pumaPage = LoadPage.PumaPage();
    }

    //hace hover sobre hombre link
    @And("^hover men link$")
    public void hoverMen() throws Throwable {
        pumaPage.hoverMenLink();
    }

    //hace click sobre futbol link
    @And("^go to futbol page$")
    public void goToFutbolPage() throws Throwable {
        pumaPage.goToPumaPage();
    }

    //obtiene el precio del primer calzado
    @And("^get price calzado$")
    public void getPrice() throws Throwable {
        priceCalzado = pumaPage.getPrice();
    }

    @And("^click first element$")
    public void clickFirstElement() throws Throwable {
        pumaPage.clickFirstElement();
    }

    @And("^click select size calzado$")
    public void selectSizeCalzado() throws Throwable {
        pumaPage.clickSelectSizeCalzado();
    }

    @And("^select size calzado$")
    public void clickselectSizeCalzado() throws Throwable {
        pumaPage.clickLinkSizeCalzado();
    }

    @And("^Add to bag$")
    public void addToBag() throws Throwable {
        pumaPage.clickAddBag();
    }

    @And("^Check cantidad$")
    public void checkCantidad() throws Throwable {
        pumaPage.verifyTextCantidad("Cantidad: 1");
    }

    @And("^Ver Carrito$")
    public void verCarrito() throws Throwable {
        pumaPage.clickVerCarrito();
    }

    @And("^Verify Card$")
    public void verifyCard() throws Throwable {
        pumaPage.verifyCard("Calzado de Fútbol X 18.3 TF","1 producto", "$1,329.00", "$1,428.00");
    }
}
