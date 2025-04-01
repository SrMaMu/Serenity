package example.stepdefinitions;

import example.model.Producto;
import example.questions.carrito.ProductosCarrito;
import example.tasks.compra.AgregarAlCarrito;
import example.tasks.compra.EliminarCarrito;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.PageElement;

import java.util.List;
import java.util.Map;

import static example.userinterfaces.CompraProducto.CARRITO_COMPRA;

public class CarritoDeCompraStepDefinitions {

    List<String> itemsCarritos;

    @Given("{actor} ingresa a la pagina de compra")
    public void ingresa_pagina_compra(Actor actor) {
        actor.wasAbleTo(Open.url("https://www.saucedemo.com/v1/inventory.html"));
    }
    @When("{actor} agrega los items al carrito de compra")
    public void agrega_items_carrito_compra(Actor actor, List<String> items) {
        itemsCarritos = items;
        items.forEach(
                nombreItem -> actor.attemptsTo(AgregarAlCarrito.item(nombreItem))
        );
    }
    @When("{actor} elimina el item {string} del carrito de compra")
    public void elimina_item_carrito_compra(Actor actor, String item) {
        actor.attemptsTo(EliminarCarrito.item(item));
        /*   itemsCarritos.remove(item); */
    }
    @Then("verifica todos los items agregados")
    public void verifica_items_agregados() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO_COMPRA),
                Ensure.that(ProductosCarrito.MostradosEnPantalla()).containsElementsFrom(itemsCarritos)
        );
    }
    @Then("verifica que el item {string} ya no esté en el carrito")
    public void verifica_item_eliminado(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(ProductosCarrito.MostradosEnPantalla()).doesNotContain(item)
        );
    }

    @DataTableType
    public Producto producto(Map<String, String> datosProducto){
        return new Producto(datosProducto.get("Nombre"),datosProducto.get("Precio"));
    }

    @Then("verificas catalogo con nombre y precio de producto")
    public void verificas_catalogo_con_nombre_y_precio_de_producto(List<Producto> productoRecibido) {

        for (Producto producto : productoRecibido) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Ensure.that(PageElement.withCSSClass("inventory_item").containingText(producto.getNombre())).isDisplayed(),
                    Ensure.that(PageElement.withCSSClass("inventory_item").containingText(producto.getNombre())).textContent().contains(producto.getPrecio())
            );

        }
    }

}
