package steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminUsersPage;

public class AdminUsersSteps {
    
    AdminUsersPage page = new AdminUsersPage();
	String name;
	String lastName;

	@Given("^ingreso a la pagina de Contact List App")
	public void navigateTo(){
		page.navigate();
	}

    @When("^doy click en el boton login")
	public void darClickBotonLogin(){
		page.darClickBotonLogin();
		page.waitMiliSeconds(500);
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
		page.ingresarEmail("Harry1@gmail.com");
	}

    @And("^ingreso el password del usuario")
	public void ingresarPassword(){
		page.ingresarPassword("HarryMesa");
	}

    @When("^doy click en el boton add user")
	public void darClickBotonSubmitSignUp(){
		page.darClickBotonSubmitSignUp();
		page.waitMiliSeconds(5000);
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
		this.name = "Carlos3";
		page.ingresarContactoNombre(name);
	}

	@And("^ingreso el segundo nombre")
	public void ingresarContactoApellido(){
		this.lastName="Perez";
		page.ingresarContactoApellido(lastName);
	}

	@And("^ingreso la fecha de nacimiento")
	public void ingresarContactoFechaCumple(){
		page.ingresarContactoFechaCumple("2020-01-01");
	}

	@And("^ingreso el email del contacto")
	public void ingresarContactoEmail(){
		page.ingresarContactoEmail("correo2@gmail.com");
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
		page.waitMiliSeconds(5000);
	}

	@Then("^verifico que el registro se agrega a la tabla")
	public void validarPantallaSubmitAddContact(){
		boolean existePage = page.validarExisteRegistro(name+" "+lastName);
		assertTrue(existePage);
		page.waitMiliSeconds(5000);
	}

	@And("^doy click en el boton Sign up")
	public void darClickBotonSignUp(){
		page.darClickBotonSignUp();
	}
}
