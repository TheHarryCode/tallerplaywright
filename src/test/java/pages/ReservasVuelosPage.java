package pages;

public class ReservasVuelosPage extends BasePage{

    String locatorUser = "//input[@id='username']";
    String locatorPassword = "//input[@id='password']";
    String locatorSignIn = "//body/div[@id='container']/form[1]/div[1]/div[1]/p[4]/input[1]";
    String locatorMensajeEmergente = "//div[@id='flash_notice']";
    String locatorSoloIda = "//tbody/tr[1]/td[2]/input[2]";
    String locatorIdayRegreso = "//tbody/tr[1]/td[2]/input[1]";
    String locatorOrigen = "//tbody/tr[2]/td[2]/select[1]";
    String locatorDestino = "//tbody/tr[3]/td[2]/select[1]";
    String locatorDayOrigen = "//select[@id='departDay']";
    String locatorMonthOrigen = "//select[@id='departMonth']";
    String locatorBotonContinuar = "//body/div[@id='container']/form[1]/input[1]";
    String locatorDetallePasajero = "//h2[contains(text(),'Passenger Details')]";
    String locatorNombre = "//tbody/tr[1]/td[2]/input[1]";
    String locatorApellido = "//tbody/tr[2]/td[2]/input[1]";
    String locatorBotonNext = "//body[1]/div[1]/form[1]/input[3]";
    String locatorCardHolver = "//tbody/tr[2]/td[2]/input[1]";
    String locatorTypeCardVisa = "//tbody/tr[1]/td[2]/input[1]";
    String locatorTypeCardMaster = "//tbody/tr[1]/td[2]/input[2]";
    String locatorCardNumber = "//tbody/tr[3]/td[2]/input[1]";
    String locatorMonthCard = "//tbody/tr[4]/td[2]/select[1]";
    String locatorYearCard = "//tbody/tr[4]/td[2]/select[2]";
    String locatorBotonPay = "//body[1]/div[1]/form[1]/p[1]/input[1]";
    String locatorMensajeConfirmacion = "//h2[contains(text(),'Confirmation')]";

    public ReservasVuelosPage() {
        super(playwright);
    }

    public void navigate(){
        navigateTo("http://travel.agileway.net/login");
    }
    
    public void ingresarUsuario(String user){
       write(locatorUser, user);
    }

    public void ingresarPassword(String pass){
        write(locatorPassword, pass);
     }

     public void darClickBotonSignIn(){
         click(locatorSignIn);
     }

     public boolean validarLoginCorrecto(){
        return existeElemento(locatorMensajeEmergente);
     }

     public void seleccionarTipoVuelo(String typeVuelo){
        if(typeVuelo.equalsIgnoreCase("SOLO_IDA")){
            click(locatorSoloIda);
        }else{
            click(locatorIdayRegreso);
        }
     }

     public void seleccionarOrigen(){
         seleccionar(locatorOrigen, "San Francisco");
     }

     public void seleccionarDestino(){
        seleccionar(locatorDestino, "New York");
    }

    public void seleccionarDayOrigen(){
        seleccionar(locatorDayOrigen, "08");
    }

    public void seleccionarMonthOrigen(){
        seleccionar(locatorMonthOrigen, "042016");
    }

    public void clickBotonContinuar(){
        click(locatorBotonContinuar);
    }

    public boolean existenDetallesPasajero(){
        return existeElemento(locatorDetallePasajero);
    }

    public boolean existenMensajePagoExitoso(){
        return existeElemento(locatorMensajeConfirmacion);
    }

    public void ingresarNombre(String name){
        write(locatorNombre, name);
    }

    public void ingresarApellido(String lastname){
        write(locatorApellido, lastname);
    }

    public void darClickBotonNext(){
        click(locatorBotonNext);
    }

    public String obtenerValorCardHolder(){
       return obtenerValor(locatorCardHolver);
    }

    public void seleccionarTipoTarjeta(String typeCard) {
        if("VISA".equalsIgnoreCase(typeCard)){
            click(locatorTypeCardVisa);
        }else{
            click(locatorTypeCardMaster);
        }
    }

    public void ingresarNumeroTarjeta() {
        write(locatorCardNumber, "4545");
    }

    public void seleccionarMesCard() {
        seleccionar(locatorMonthCard, "10");
    }

    public void seleccionarYearCard() {
        seleccionar(locatorYearCard, "2011");
    }

    public void darClickBotonPay() {
        click(locatorBotonPay);
    }

    public boolean isPagoExitoso() {
        return existeElemento(locatorMensajeConfirmacion);
    }

}


