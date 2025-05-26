package example.tasks.vuelos;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static example.userinterfaces.ReservaVuelo.*;

public class CompletaDatosCompra {
    public static Performable conDatosFicticios() {
        return Task.where("{0} completa los datos de compra ficticios",
                Enter.theValue("Juan Perez").into(INPUT_NAME),
                Enter.theValue("Calle Falsa 123").into(INPUT_ADDRESS),
                Enter.theValue("Buenos Aires").into(INPUT_CITY),
                Enter.theValue("CABA").into(INPUT_STATE),
                Enter.theValue("1000").into(INPUT_ZIPCODE),
                Enter.theValue("4111111111111111").into(INPUT_CREDIT_CARD_NUMBER),
                Enter.theValue("12").into(INPUT_CREDIT_CARD_MONTH),
                Enter.theValue("2027").into(INPUT_CREDIT_CARD_YEAR),
                Enter.theValue("Juan Perez").into(INPUT_NAME_ON_CARD)
        );
    }
}
