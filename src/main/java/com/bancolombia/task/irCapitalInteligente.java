package com.bancolombia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.bancolombia.userinterfaces.BancolombiaCapitalInteligente.ACTUALIDAD_ECONOMICA;
import static com.bancolombia.userinterfaces.BancolombiaEmpresas.CAPITAL_INTELIGENTE;
import static com.bancolombia.userinterfaces.BancolombiaEmpresas.MENU_CORPORATIVOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class irCapitalInteligente implements Task {
    private String opcion = "capital-inteligente";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Switch.toDefaultContext());
        MENU_CORPORATIVOS.waitingForNoMoreThan(Duration.ofSeconds(10)).isVisibleFor(actor);
        actor.attemptsTo(Click.on(CAPITAL_INTELIGENTE));


    }

    public static irCapitalInteligente home() {
        return instrumented(irCapitalInteligente.class);

    }
}
