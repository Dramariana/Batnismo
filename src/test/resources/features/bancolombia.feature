Feature: Bancolombia actualidad economica

  Scenario: Descargar informe
    Given ingresa a la pagina web de bancolombia personas
    When selecciona la opcion corporativos
    And selecciona la opcion capital inteligente
    And selecciona la opcion atualidad economica
    And selecciona el reporte 'OPEP+ aumentará la oferta de petróleo en julio de 2021'
    And selecciona descargar el informe completo
    Then el informe es descargado correctamente