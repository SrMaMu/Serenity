package example.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Button;
import org.openqa.selenium.By;

public class ReservaVuelo extends PageObject {

    public static final Target LIST_DEPARTURE = Target.the("Lista de partida").located(By.name("fromPort"));
    public static final Target LIST_DESTINATION = Target.the("Lista de destino").located(By.name("toPort"));
    public static final Target BUTTON_FIND_FLIGHTS = Target.the("Botón Buscar Vuelo").locatedBy("xpath://input[@value='Find Flights']");
    public static final Target BUTTON_CHOOSE_FLIGHT = Target.the("Boton Elegir Vuelo").locatedBy("//tbody/tr[1]/td[1]/input[1]");
    public static final Target BUTTON_PURCHASE_FLIGHT = Target.the("Boton Comprar Vuelo").locatedBy("//input[@value='Purchase Flight']");
    public static final Target TEXT_SUCCESS = Target.the("Mensaje de éxito").locatedBy("//h1[contains(text(),'Thank you for your purchase today!')]");
    public static final Target INPUT_NAME = Target.the("Campo Nombre").located(By.id("inputName"));
    public static final Target INPUT_ADDRESS = Target.the("Campo Dirección").located(By.id("address"));
    public static final Target INPUT_CITY = Target.the("Campo Ciudad").located(By.id("city"));
    public static final Target INPUT_STATE = Target.the("Campo Estado").located(By.id("state"));
    public static final Target INPUT_ZIPCODE = Target.the("Campo Código Postal").located(By.id("zipCode"));
    public static final Target SELECT_CARD_TYPE = Target.the("Tipo de Tarjeta").located(By.id("cardType"));
    public static final Target INPUT_CREDIT_CARD_NUMBER = Target.the("Número de Tarjeta").located(By.id("creditCardNumber"));
    public static final Target INPUT_CREDIT_CARD_MONTH = Target.the("Mes de Tarjeta").located(By.id("creditCardMonth"));
    public static final Target INPUT_CREDIT_CARD_YEAR = Target.the("Año de Tarjeta").located(By.id("creditCardYear"));
    public static final Target INPUT_NAME_ON_CARD = Target.the("Nombre en la Tarjeta").located(By.id("nameOnCard"));
    public static final Target CHECKBOX_REMEMBER_ME = Target.the("Recordarme").located(By.id("rememberMe"));
    public static final Target TEXT_ID_RESERVA = Target.the("ID de reserva").located(By.xpath("//td[text()='Id']/following-sibling::td"));
    public static final Target TEXT_TOTAL_COMPRA = Target.the("Total de compra").located(By.xpath("//td[text()='Amount']/following-sibling::td"));
    public static final Target TEXT_TOTAL_PREVIO = Target.the("Total previo").located(By.xpath("//p[strong[contains(text(),'Total Cost')]]/em"));
}
