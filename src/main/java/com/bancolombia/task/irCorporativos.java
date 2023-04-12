package com.bancolombia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.bancolombia.userinterfaces.BancolombiaPersonas.CORPORATIVOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class irCorporativos implements Task {
   public static String opcion="Capital Inteligente";

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CORPORATIVOS));
    }

    public static irCorporativos home() {
        return instrumented(irCorporativos.class);

    }
}
