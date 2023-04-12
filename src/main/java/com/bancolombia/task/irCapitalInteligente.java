package com.bancolombia.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class irCapitalInteligente implements Task {
   private String opcion="Capital Inteligente";
    @Override
    public <T extends Actor> void performAs(T actor) {

       // actor.attemptsTo(Enter.theValue().into(By.id(MENU_CORPORATIVOS)));
        actor.attemptsTo(Click.on(By.xpath("//span[contains(text(),'"+opcion+"')]")));


    }

    public static irCapitalInteligente home() {
        return instrumented(irCapitalInteligente.class);

    }
}
