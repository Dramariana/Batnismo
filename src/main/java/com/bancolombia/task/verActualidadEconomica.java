package com.bancolombia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.bancolombia.userinterfaces.BancolombiaCapitalInteligente.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class verActualidadEconomica implements Task {
   private String opcion="Actualidad económica";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Switch.toDefaultContext());
        MENU.waitingForNoMoreThan(Duration.ofSeconds(10)).isVisibleFor(actor);

        CAPITAL_INTELIGENTE_INFO.waitingForNoMoreThan(Duration.ofSeconds(10)).isVisibleFor(actor);
    }

    public static verActualidadEconomica articulos() {
        return instrumented(verActualidadEconomica.class);

    }
}
