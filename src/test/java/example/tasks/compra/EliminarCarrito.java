package example.tasks.compra;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.PageElement;

public class EliminarCarrito {

    public static Performable item(String nombreItem){
        return Task.where("{0} hace click en el boton de eliminar del carrito" + nombreItem,
                Click.on(
                        Button.withText("remove")
                                .inside(PageElement.withCSSClass("cart_list").containingText(nombreItem))
                ));
    }
}
