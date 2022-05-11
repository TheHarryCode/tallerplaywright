package steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ReservasVuelosPage;

public class ReservasVuelosSteps {

	ReservasVuelosPage page = new ReservasVuelosPage();

	String name = "Harry";
	String lastname = "Mesa";

	@Given("^ingreso al sitio web")
	public void navigateTo(){
		page.navigate();
	}

	@When("^ingreso el usuario")
	public void ingresarUsuario(){
		page.ingresarUsuario("agileway");
	}

	@And("^ingreso el password")
	public void ingresarPassword(){
		page.ingresarPassword("testwise");
	}

	@And("^doy click en el boton Sign In")
	public void darClickBotonSignIn(){
		page.darClickBotonSignIn();
	}

	@Then("^valido que se logui correctamente")
	public void validarLoginCorrecto(){
		boolean loginCorrecto = page.validarLoginCorrecto();
		assertTrue(loginCorrecto);
	}

	@Given("^selecciono el tipo de vuelo solo ida")
	public void seleccionarTipoVueloSoloIda(){
		page.seleccionarTipoVuelo("SOLO_IDA");
	}

	@When("^selecciono el lugar de oriden")
	public void seleccionarOrigen(){
		page.seleccionarOrigen();
	}

	@And("^selecciono el lugar de destino")
	public void seleccionarDestino(){
		page.seleccionarDestino();
	}

	@And("^selecciono la fecha de vuelo")
	public void seleccionarFechaVuelo(){
		page.seleccionarDayOrigen();
		page.seleccionarMonthOrigen();
		page.waitMiliSeconds(5000);
	}

	@And("^doy click en continuar")
	public void clickContinuar(){
		page.clickBotonContinuar();
	}

	@Then("^verifico si continua la vista de detalles del pasajero")
	public void verificarDetallesPasajeros(){
		boolean existenciaDetallePasajero = page.existenDetallesPasajero();
		assertTrue(existenciaDetallePasajero, "No se dirige a ventana de pasajero");
	}

	@Given("^ingreso el nombre")
	public void ingresarNombre(){
		page.ingresarNombre(name);
	}

	@When("^ingreso el apellido")
	public void ingresarApellido(){
		page.ingresarApellido(lastname);
	}

	@And("^doy click en el boton next")
	public void darClickBotonNext(){
		page.darClickBotonNext();
	}

	@Then("^verificar en el campo card holder's field este el nombre del pasajero")
	public void verificarCampoCardHolder(){
		String valorObtenido = page.obtenerValorCardHolder();
		String valorReal = name+" "+lastname;
		assertTrue(valorReal.equalsIgnoreCase(valorObtenido),"No coincide el nombre");
	}

	@Given("^selecciono el tipo de tarjeta visa")
	public void seleccionarTipoTarjeta(){
		page.seleccionarTipoTarjeta("VISA");
		page.waitMiliSeconds(2000);
	}

	@And("^ingreso el numero de la tarjeta")
	public void ingresarNumeroTarjeta(){
		page.ingresarNumeroTarjeta();
		page.waitMiliSeconds(2000);
	}

	@And("^selecciono la fecha de expiracion de la tarjeta")
	public void seleccionarFechaExpiracionTarjeta(){
		page.seleccionarMesCard();
		page.waitMiliSeconds(2000);
		page.seleccionarYearCard();
		page.waitMiliSeconds(2000);
	}

	@When("^doy click en el boton pay now")
	public void darClickBotonPay(){
		page.darClickBotonPay();
		page.waitMiliSeconds(6000);
	}

	@Then("^valido el mensaje de pago exitoso")
	public void verificarPagoExitoso(){
		boolean pagoExitoso = page.isPagoExitoso();
		assertTrue(pagoExitoso, "El pago no se completo correctamente");
	}

}
