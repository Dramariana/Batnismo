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
        //actor.attemptsTo(Click.on(ACTUALIDAD_ECONOMICA));
//        actor.attemptsTo(Click.on(By.xpath("//li[@class='dropdown mega-dropdown item-dark-blue'][@xpath='1']")));
        actor.attemptsTo(Click.on(By.xpath("//body/div[@id='main-content']/div[1]/div[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")));

       // actor.attemptsTo(Click.on(ACTUALIDAD_ECONOMICA));
        CAPITAL_INTELIGENTE_INFO.waitingForNoMoreThan(Duration.ofSeconds(10)).isVisibleFor(actor);
    }

    public static verActualidadEconomica articulos() {
        return instrumented(verActualidadEconomica.class);

    }
}
