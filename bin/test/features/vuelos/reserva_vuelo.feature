Feature: Realizar reserva de vuelo
  Scenario: Realizar reserva de vuelo de Portland a Buenos Aires y completar compra
    Given Juan ingresa a la pagina de reserva
    When Juan realiza la reserva con "Portland" y "Buenos Aires"
    And Juan completa los datos de compra
    Then Juan verifica reserva efectuada

      |San Diego |Dublin |
