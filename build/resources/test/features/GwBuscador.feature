Feature: HU-001 Pagina GWBicycles
  Entrar a la pagina de GwBicycles
  para ver diferentes productos de
  la pagina
  Scenario Outline: Buscar palabra en la zona de busqueda exitoso
    Given que me encuentro en la pagina de GwBicycle con la url <Url>
    When busco los productos de mi interes
    Then encontrar productos a comprar

    Examples:
      | Escenario                                     | Url                     |
      | Buscar palabra en la zona de busqueda exitoso | https://gwbicycles.com/ |