Feature: Realizar reserva de vuelo

  Scenario Outline: Realizar reserva de vuelo con origen y destino
    Given Juan ingresa a la pagina de reserva
    When Juan realiza la reserva con "<origen>" y "<destino>"
    Then Juan verifica reserva efectuada

    Examples: Vuelos
      |origen    |destino|
      |Portland  |Berlin |
      |San Diego |Dublin |
