
Feature: login usuario


  Scenario: login de cliente exitoso

    Given que el usuario este en la pagina
    When el usuario ingresa usuario y contrasena
      |usuario           |contrasena   |
      |milena12@gmail.com|mile.6920    |
    Then el usuario valida que se muestre login exitoso