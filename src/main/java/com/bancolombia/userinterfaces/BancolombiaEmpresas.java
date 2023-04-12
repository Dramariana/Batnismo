package com.bancolombia.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class BancolombiaEmpresas extends PageObject {
    public static final Target CORPORATIVOS = Target.the("corporativos").located(By.id("header-empresas"));
    public static final Target MENU_CORPORATIVOS = Target.the("menuCorporativos").located(By.className("header-menu_item"));
    public static final Target CAPITAL_INTELIGENTE = Target.the("actualidadEconomica").located(By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]/li[5]/a[1]"));

}
