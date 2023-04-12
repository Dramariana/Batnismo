package com.bancolombia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static com.bancolombia.userinterfaces.BancolombiaCapitalInteligente.ACTUALIDAD_ECONOMICA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class verActualidadEconomica implements Task {
   private String opcion="Capital Inteligente";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ACTUALIDAD_ECONOMICA));


    }

    public static verActualidadEconomica articulos() {
        return instrumented(verActualidadEconomica.class);

    }
}
