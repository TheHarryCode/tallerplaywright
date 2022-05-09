package pages;

public class AdminUsersPage extends BasePage {

   String locatorBotonSignUp = "//button[@id='signup']";
   String locatorName = "//input[@id='firstName']";
   String locatorLastName = "//input[@id='lastName']";
   String locatorEmail = "//input[@id='email']";
   String locatorPassword = "//input[@id='password']";
   String locatorBotonSubmitSignUp = "//button[@id='signup']";
   String locatorTituloAddUser = "//h1[contains(text(),'Add User')]";
   String locatorTituloContactList = "//header//h1";
   String locatorBotonAddNewContact = "//button[@id='add-contact']";
   String locatorTituloAddContact = "//header//h1";
   String locatorContactFirstName = "//input[@id='firstName']";
   String locatorContactLastName = "//input[@id='lastName']";
   String locatorContactDateBirth = "//input[@id='birthdate']";
   String locatorContactEmail = "//input[@id='email']";
   String locatorContactPhone = "//input[@id='email']";
   String locatorContactAddres1 = "//input[@id='street1']";
   String locatorContactAddres2 = "//input[@id='street2']";
   String locatorContactCity = "//input[@id='street2']";
   String locatorContactState = "//input[@id='stateProvince']";
   String locatorContactPostalCode = "//input[@id='postalCode']";
   String locatorContactCountry = "//input[@id='country']";
   String locatorBotonSubmitAddContact = "//button[@id='submit']";

   public void darClickBotonSubmitAddContact(){
      click(locatorBotonSubmitAddContact);
   }

   public void ingresarContactoCity(String city){
      write(locatorContactCity, city);
   }

   public void ingresarContactoState(String state){
      write(locatorContactState, state);
   }

   public void ingresarContactoPostalCode(String postalCode){
      write(locatorContactPostalCode, postalCode);
   }

   public void ingresarContactoCountry(String country){
      write(locatorContactCountry, country);
   }

   public void ingresarContactoAddres1(String address){
      write(locatorContactAddres1, address);
   }

   public void ingresarContactoAddres2(String address){
      write(locatorContactAddres2, address);
   }

   public void ingresarContactoEmail(String email){
      write(locatorContactEmail, email);
   }

   public void ingresarContactoCelular(String phone){
      write(locatorContactPhone, phone);
   }

   public void ingresarContactoFechaCumple(String date){
      write(locatorContactDateBirth, date);
   }

   public void ingresarContactoNombre(String name){
      write(locatorContactFirstName, name);
   }

   public void ingresarContactoApellido(String lastName){
      write(locatorContactLastName, lastName);
   }

   public boolean validarPantallaAddContact() {
      return existeElemento(locatorTituloAddContact);
   }

   public void darClickBotonAddNewContact() {
      click(locatorBotonAddNewContact);
   }

   public AdminUsersPage() {
      super(playwright);
   }

   public void navigate() {
      navigateTo("https://thinking-tester-contact-list.herokuapp.com");
   }

   public void darClickBotonSignUp() {
      click(locatorBotonSignUp);
   }

   public void ingresarName(String name) {
      write(locatorName, name);
   }

   public void ingresarLastName(String lastname) {
      write(locatorLastName, lastname);
   }

   public void ingresarEmail(String mail) {
      write(locatorEmail, mail);
   }

   public void ingresarPassword(String pass) {
      write(locatorPassword, pass);
   }

   public void darClickBotonSubmitSignUp() {
      click(locatorBotonSubmitSignUp);
   }

   public boolean validaPantallaListaContactos() {
      return existeElemento(locatorTituloContactList);
   }

   public boolean validaPantallaAddUser() {
      return existeElemento(locatorTituloAddUser);
   }
}
