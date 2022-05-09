Feature: Testear pagina reserva de vuelos

    Scenario: Como usuario deseo loguearme en la aplicacion
    Given ingreso al sitio web
    When ingreso el usuario
    And ingreso el password
    And doy click en el boton Sign In
    Then valido que se logui correctamente

    Scenario: Como usuario deseo seleccionar un iterinario de vuelos
    Given selecciono el tipo de vuelo solo ida
    When selecciono el lugar de oriden
    And selecciono el lugar de destino
    And selecciono la fecha de vuelo
    And doy click en continuar
    Then verifico si continua la vista de detalles del pasajero

    Scenario: Como usuario deseo enviar la informacion de un pasajero
    Given ingreso el nombre
    When ingreso el apellido
    And doy click en el boton next
    Then verificar en el campo card holder's field este el nombre del pasajero

    Scenario: Como usuario deseo realizar el pago con tarjeta de credito visa
    Given selecciono el tipo de tarjeta visa
    And ingreso el numero de la tarjeta
    And selecciono la fecha de expiracion de la tarjeta
    When doy click en el boton pay now
    Then valido el mensaje de pago exitoso