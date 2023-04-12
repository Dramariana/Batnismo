package com.bancolombia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import javax.xml.bind.SchemaOutputResolver;
import java.time.Duration;

import static com.bancolombia.userinterfaces.BancolombiaCapitalInteligente.*;
import static com.bancolombia.userinterfaces.BancolombiaPersonas.CORPORATIVOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class buscarArticulo implements Task {
   private String opcion="Capital Inteligente";
    @Override
    public <T extends Actor> void performAs(T actor) {

        CAPITAL_INTELIGENTE_INFO.waitingForNoMoreThan(Duration.ofSeconds(30)).isVisibleFor(actor);
        if(X.isVisibleFor(actor)==true){
            actor.attemptsTo(Click.on(X));
        } else {
            actor.attemptsTo(Click.on(VER_MAS_PUBLICACIONES));
        }
        System.out.println("estoy aqui");

    }

    public static buscarArticulo Interes() {
        return instrumented(buscarArticulo.class);

    }
}
