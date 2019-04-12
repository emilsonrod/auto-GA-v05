package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.RegistrarMaquinaria.IngresarMaquinaria;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private IngresarMaquinaria ingresarMaquinaria;

    @Given("^Load Page$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
        ingresarMaquinaria = LoadPage.registrarMaquinariaPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @And("^got to mi page 'Registrar Maquinaria'$")
    public  void gotToRegistrarMaquinaria() throws Throwable {
        ingresarMaquinaria.GoToPage();
    }

    @And("^got to 'catalogo'$")
    public  void gotToCatalog() throws Throwable {
        ingresarMaquinaria.GoToCatalog();
    }

    @And("^submit form'$")
    public  void submitForm() throws Throwable {
        ingresarMaquinaria.LoadFields();
    }

    @And("^delete maquinaria$")
    public void DeleteMaquinaria() throws Throwable {
        ingresarMaquinaria.DeleteMaquinaria();
    }

    @And("^edit maquinaria$")
    public void EditMaquinaria() throws Throwable {
        ingresarMaquinaria.EditMaquinaria();
    }

    @And("^submit edit form$")
    public  void submitEditForm() throws Throwable {
        ingresarMaquinaria.LoadFieldsEdit();
    }
}
