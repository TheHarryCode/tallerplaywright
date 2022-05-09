package steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminUsersPage;

public class AdminUsersSteps {
    
    AdminUsersPage page = new AdminUsersPage();

    @Given("^ingreso a la pagina de admin usuarios")
	public void navigateTo(){
		page.navigate();
	}

    @And("^doy click en el boton Sign up")
	public void darClickBotonSignUp(){
		page.darClickBotonSignUp();
	}

    @And("^puedo ver la pantalla de creacion de usuarios")
	public void validaPantallaAddUser(){
		boolean existePageAddUser = page.validaPantallaAddUser();
        assertTrue(existePageAddUser);
	}

    @And("^ingreso el nombre del usuario")
	public void ingresarName(){
		page.ingresarName("Harry");
	}

    @And("^ingreso el apellido del usuario")
	public void ingresarLastName(){
		page.ingresarLastName("Mesa");
	}

    @And("^ingreso el email del usuario")
	public void ingresarEmail(){
		page.ingresarEmail("Harrydd24@gmail.com");
	}

    @And("^ingreso el password del usuario")
	public void ingresarPassword(){
		page.ingresarPassword("HarryMesa");
	}

    @When("^doy click en el boton Submit")
	public void darClickBotonSubmitSignUp(){
		page.darClickBotonSubmitSignUp();
	}

    @Then("^espero ver la lista de contactos")
	public void validaPantallaListaContactos(){
		boolean existePage = page.validaPantallaListaContactos();
        assertTrue(existePage);
	}

	@Given("^doy click en el boton agregar nuevo contacto")
	public void darClickBotonAddNewContact(){
		page.darClickBotonAddNewContact();
	}

	@And("^verifico que haya ingreso en la pantalla de agregar contacto")
	public void validarPantallaAddContact(){
		boolean existePage = page.validarPantallaAddContact();
        assertTrue(existePage);
	}

	@And("^ingreso el primer nombre")
	public void agregarContactoNombre(){
		page.ingresarContactoNombre("Laura");
	}

	@And("^ingreso el segundo nombre")
	public void ingresarContactoApellido(){
		page.ingresarContactoApellido("Marin");
	}

	@And("^ingreso la fecha de nacimiento")
	public void ingresarContactoFechaCumple(){
		page.ingresarContactoFechaCumple("2020-01-01");
	}

	@And("^ingreso el email del contacto")
	public void ingresarContactoEmail(){
		page.ingresarContactoEmail("correo1@gmail.com");
	}

	@And("^ingreso el numero celular")
	public void ingresarContactoCelular(){
		page.ingresarContactoCelular("3120154874");
	}

	@And("^ingreso la direccion principal")
	public void ingresarContactoAddres1(){
		page.ingresarContactoAddres1("Av 44 1");
	}

	@And("^ingreso la direccion secundaria")
	public void ingresarContactoAddres2(){
		page.ingresarContactoAddres2("Av 44 2");
	}

	@And("^ingreso la ciudad")
	public void ingresarContactoCity(){
		page.ingresarContactoCity("Bello");
	}

	@And("^ingreso el estado o providencia")
	public void ingresarContactoState(){
		page.ingresarContactoState("Medayork");
	}

	@And("^ingreso el codigo postal")
	public void ingresarContactoPostalCode(){
		page.ingresarContactoPostalCode("050001");
	}

	@And("^ingreso el pais")
	public void ingresarContactoCountry(){
		page.ingresarContactoCountry("Colombia");
	}

	@When("^doy click en el boton Submit de Add Card")
	public void darClickBotonSubmitAddContact(){
		page.darClickBotonSubmitAddContact();
	}

	@Then("^verifico que el registro se agrega a la tabla")
	public void validarPantallaSubmitAddContact(){
		boolean existePage = page.validarPantallaAddContact();
		assertTrue(existePage);
	}
}
