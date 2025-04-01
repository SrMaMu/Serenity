Feature: Realizar consulta de usuario

  Scenario Outline: Realizar cosnulta de usuario por id en servicio https://reqres.in/api/users/{id}
    When Juan consume el servicio de consutla de usuario con "<id>"
    Then verifica que la consulta retorna "<nombre>" y "<correo>" correctos

    Examples: Datos
      |id|nombre|correo                |
      |1 |George|george.bluth@reqres.in|
      |2 |Janet |janet.weaver@reqres.in|