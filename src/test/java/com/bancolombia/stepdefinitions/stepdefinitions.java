package com.bancolombia.stepdefinitions;

import com.bancolombia.task.*;
import com.bancolombia.userinterfaces.BancolombiaCapitalInteligente;
import com.bancolombia.userinterfaces.BancolombiaPersonas;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class stepdefinitions {
    @Managed(driver = "firefox", uniqueSession = true)
    //@Managed(driver = "chrome", uniqueSession = true)
    public WebDriver hisBrowser;
    private final Actor user = Actor.named("Mariana");
    BancolombiaPersonas bancolombiaPersonas;
    BancolombiaCapitalInteligente bancolombiaCapitalInteligente;


    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        user.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
    }


    @Given("ingresa a la pagina web de bancolombia personas")
    public void ingresaALaPaginaWebDeBancolombiaPersonas() {
        user.wasAbleTo(Open.browserOn().the(bancolombiaPersonas));
    }

    @When("selecciona la opcion corporativos")
    public void seleccionaLaOpcionCorporativos() {
        user.attemptsTo(irCorporativos.home());
    }

    @And("selecciona la opcion capital inteligente")
    public void seleccionaLaOpcionCapitalInteligente() {
        user.attemptsTo(irCapitalInteligente.home());
    }

    @And("selecciona la opcion atualidad economica")
    public void seleccionaLaOpcionAtualidadEconomica() {
        user.attemptsTo(verActualidadEconomica.articulos());
    }

    @And("selecciona el reporte {string}")
    public void seleccionaElReporteOPEPAumentaraLaOfertaDePetroleoEnJulioDe(String articulo) {


    }

    @And("selecciona descargar el informe completo")
    public void seleccionaDescargarElInformeCompleto() {
    }

    @Then("el informe es descargado correctamente")
    public void elInformeEsDescargadoCorrectamente() {
    }


    @Given("ingresa a la pagina web de actualidad economica de bancolombia personas")
    public void ingresaALaPaginaWebDeActualidadEconomicaDeBancolombiaPersonas() {
        user.wasAbleTo(Open.browserOn().the(bancolombiaCapitalInteligente));
    }
}
