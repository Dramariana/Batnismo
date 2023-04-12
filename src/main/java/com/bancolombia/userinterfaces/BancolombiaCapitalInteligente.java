package com.bancolombia.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class BancolombiaCapitalInteligente extends PageObject {
    public static final Target ACTUALIDAD_ECONOMICA = Target.the("actualidadEconomica").located(By.id("main-content"));
    public static final Target CAPITAL_INTELIGENTE_INFO = Target.the("capitalInteligenteInfo").located(By.id("capital_inteligente"));

}
