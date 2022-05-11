@AdminUser
Feature: Testear pagina de administracion de usuarios

    #Scenario: Como usuario deseo registrarme en la pagina
    #Given ingreso a la pagina de admin usuarios
    #And doy click en el boton Sign up
    #And puedo ver la pantalla de creacion de usuarios
    #And ingreso el nombre del usuario
    #And ingreso el apellido del usuario
    #And ingreso el email del usuario
    #And ingreso el password del usuario
    #When doy click en el boton add user
    #Then espero ver la lista de contactos

    Scenario: Como usuario deseo loguearme en la pagina
    Given ingreso a la pagina de Contact List App
    And ingreso el email del usuario
    And ingreso el password del usuario
    When doy click en el boton login
    Then espero ver la lista de contactos

    Scenario: Como usuario deseo agregar contactos a la lista
    Given doy click en el boton agregar nuevo contacto
    And verifico que haya ingreso en la pantalla de agregar contacto
    And ingreso el primer nombre
    And ingreso el segundo nombre
    And ingreso la fecha de nacimiento
    And ingreso el email del contacto
    And ingreso el numero celular
    And ingreso la direccion principal
    And ingreso la direccion secundaria
    And ingreso la ciudad
    And ingreso el estado o providencia
    And ingreso el codigo postal
    And ingreso el pais
    When doy click en el boton Submit de Add Card
    Then verifico que el registro se agrega a la tabla