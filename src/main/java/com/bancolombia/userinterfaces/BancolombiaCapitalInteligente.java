package com.bancolombia.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.bancolombia.com/empresas/capital-inteligente/actualidad-economica-sectorial?categoria=Actualidad%20economica%20y%20sectorial")
public class BancolombiaCapitalInteligente extends PageObject {
    public static final Target MENU = Target.the("menu").located(By.id("main-content"));
    public static final Target ACTUALIDAD_ECONOMICA = Target.the("actualidadEconomica").located(By.xpath("//*/a[@title='Actualidad económica']"));

    public static final Target CAPITAL_INTELIGENTE_INFO = Target.the("capitalInteligenteInfo").located(By.id("capital_inteligente"));
    public static final Target VER_MAS_PUBLICACIONES = Target.the("verMas").located(By.id("verMas"));

    public static final Target X = Target.the("verMas").located(By.xpath("//*/a[contains(text(),'OPEP+ aumentará la oferta de petróleo en julio de 2021')]"));

}
