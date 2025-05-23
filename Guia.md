# Guía del Proyecto Serenity BDD con Cucumber

Este proyecto es un template para pruebas automatizadas utilizando Serenity BDD con Cucumber, diseñado para facilitar la creación y ejecución de pruebas web y de APIs. Se utiliza el patrón Screenplay para organizar los tests, promoviendo la reutilización de código y la claridad en la definición de las pruebas.

## Estructura del Proyecto

La estructura del proyecto sigue las convenciones de Serenity BDD y Cucumber, organizando los archivos de la siguiente manera:
```
Serenity_Starter/
├── .github/workflows/check.yml           # Configuración de GitHub Actions para CI
├── gradle/wrapper/gradle-wrapper.properties # Configuración de Gradle Wrapper
├── src/
│   ├── main/java/example/...            # Código fuente principal (si aplica)
│   └── test/
│       ├── java/example/
│       │   ├── model/                     # Clases de modelo
│       │   ├── questions/                 # Clases de preguntas (verificaciones)
│       │   ├── stepdefinitions/           # Clases de definiciones de pasos de Cucumber
│       │   ├── tasks/                     # Clases de tareas (acciones)
│       │   ├── userinterfaces/            # Clases de interfaces de usuario (selectores)
│       │   └── CucumberTestSuite.java   # Clase de ejecución de pruebas Cucumber
│       └── resources/
│           ├── features/                  # Archivos de características Cucumber (.feature)
│           ├── junit-platform.properties  # Configuración de JUnit Platform
│           ├── logback-test.xml           # Configuración de logging
│           └── serenity.conf              # Configuración de Serenity BDD
├── build.gradle                         # Archivo de configuración de Gradle
├── pom.xml                              # Archivo de configuración de Maven
├── serenity.properties                  # Propiedades de Serenity BDD
└── README.md                            # Archivo de descripción del proyecto
```

### Descripción Detallada de las Carpetas Clave

*   **src/test/java/example/model**: Contiene clases que representan los modelos de datos utilizados en las pruebas (ej., `Producto`, `Usuario`).
*   **src/test/java/example/questions**: Define las preguntas que se hacen sobre el estado de la aplicación (ej., `ProductosCarrito`, `MensajeSuccess`).
*   **src/test/java/example/stepdefinitions**: Contiene las clases que enlazan los pasos definidos en los archivos `.feature` con el código de automatización (ej., `CarritoDeCompraStepDefinitions`, `ReservaVueloStepDefinitions`).
*   **src/test/java/example/tasks**: Define las tareas que los actores pueden realizar (ej., `AgregarAlCarrito`, `SeleccionaPaises`).
*   **src/test/java/example/userinterfaces**: Define los selectores de los elementos de la interfaz de usuario (ej., `CompraProducto`, `ReservaVuelo`).
*   **src/test/resources/features**: Contiene los archivos `.feature` que describen los escenarios de prueba en lenguaje Gherkin (ej., `carrito_compra.feature`, `reserva_vuelo.feature`).
*   **src/test/java/example/CucumberTestSuite.java**: Clase que configura y ejecuta las pruebas de Cucumber.

## Funcionalidades

*   **Automatización Web**: Permite automatizar la interacción con interfaces web utilizando Selenium y Serenity BDD.
*   **Automatización de APIs**: Permite realizar pruebas de APIs utilizando Serenity REST.
*   **Patrón Screenplay**: Utiliza el patrón Screenplay para organizar y estructurar las pruebas, facilitando la reutilización y el mantenimiento del código.
*   **Cucumber y Gherkin**: Permite escribir pruebas en lenguaje natural utilizando Gherkin, facilitando la colaboración entre desarrolladores, testers y stakeholders.
*   **Múltiples Casos de Prueba**: Soporta la ejecución de múltiples casos de prueba definidos en los archivos `.feature`.
*   **Estructuras de Datos**: Utiliza estructuras de datos como List, Collection, Map y DataTable para manejar datos de prueba de manera eficiente.
*   **Assertions**: Permite realizar aserciones para verificar el estado de la aplicación.
*   **Selectores Estáticos y Dinámicos**: Utiliza selectores estáticos (Target) y dinámicos para interactuar con los elementos de la interfaz de usuario.

## Guía para la Creación de un Archivo de Custom Instructions en la Carpeta `.github`

GitHub Copilot puede ser personalizado para seguir las convenciones y el estilo de tu proyecto. Para ello, puedes crear un archivo de "custom instructions" en formato Markdown (`.md`) y colocarlo en la carpeta `.github`. Este archivo servirá como guía para Copilot al interactuar en el chat, permitiéndole entender mejor el contexto del proyecto y ofrecer sugerencias más relevantes.

### Pasos para crear el archivo:

1.  **Crear el archivo**: En la carpeta `.github` de tu proyecto, crea un nuevo archivo llamado `copilot-instructions.md`.

2.  **Definir las instrucciones**: Dentro del archivo, escribe en lenguaje natural las instrucciones que Copilot debe seguir. Estas instrucciones pueden incluir:

    *   **Descripción del proyecto**: Breve resumen del propósito y alcance del proyecto.
    *   **Convenciones de nombres**: Reglas para nombrar clases, métodos, variables, etc.
    *   **Estilo de código**: Preferencias de formato, indentación, etc.
    *   **Patrones de diseño preferidos**: Uso del patrón Screenplay, etc.
    *   **Bibliotecas y frameworks utilizados**: Serenity BDD, Cucumber, JUnit, AssertJ, etc.
    *   **Ejemplos de código**: Fragmentos de código que ilustren las mejores prácticas del proyecto.
    *   **Consideraciones específicas**: Cualquier otra información relevante para Copilot.

### Ejemplo de `copilot-instructions.md`

```markdown
# Instrucciones para GitHub Copilot en el Proyecto Serenity BDD con Cucumber

Este proyecto utiliza Serenity BDD con Cucumber para pruebas automatizadas. Siga estas instrucciones al interactuar en el chat:

*   **Descripción del proyecto**: Este proyecto es un template para pruebas automatizadas de aplicaciones web y APIs.

*   **Convenciones de nombres**:
    *   Las clases de tareas deben terminar con "Task".
    *   Las clases de preguntas deben terminar con "Question".
    *   Los selectores de la interfaz de usuario deben ser definidos como `Target`.

*   **Estilo de código**:
    *   Utilice indentación de 4 espacios.
    *   Asegúrese de que el código sea legible y bien documentado.

*   **Patrones de diseño preferidos**:
    *   Utilice el patrón Screenplay para organizar las pruebas.
    *   Prefiera selectores dinámicos cuando sea posible.

*   **Bibliotecas y frameworks utilizados**:
    *   Serenity BDD
    *   Cucumber
    *   JUnit
    *   AssertJ

*   **Ejemplos de código**:

    ```java
    package example.tasks;

    import net.serenitybdd.screenplay.Task;
    import net.serenitybdd.screenplay.actions.Click;
    import net.serenitybdd.screenplay.targets.Target;

    public class RealizarBusqueda implements Task {
        private final String termino;

        public RealizarBusqueda(String termino) {
            this.termino = termino;
        }

        public static RealizarBusqueda por(String termino) {
            return new RealizarBusqueda(termino);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                Click.on(Target.the("Resultado de búsqueda").locatedBy("//a[contains(text(),'" + termino + "')]"))
            );
        }
    }
    ```

*   **Consideraciones específicas**:
    *   Al generar selectores, prefiera XPath o CSS selectores que sean robustos y fáciles de mantener.
    *   Asegúrese de que las tareas sean atómicas y reutilizables.

3. **Guardar los cambios:** Guarda el archivo en la carpeta .github de tu proyecto.

4. **Comprobar los resultados:** Copilot debería empezar a seguir las instrucciones definidas en el archivo


## Ejercicios para Mejorar los Tests con GitHub Copilot
A continuación, se presentan algunos ejercicios básicos para mejorar los tests utilizando GitHub Copilot.

### Ejercicio 1: Refactorizar un Selector Estático a Dinámico
Paso a Paso:
1. Identificar el selector estático: En el archivo ReservaVuelo.java, identifica el selector estático BUTTON_CHOOSE_FLIGHT.

```Java
public static final Target BUTTON_CHOOSE_FLIGHT = Target.the("Boton Elegir Vuelo").locatedBy("//tbody/tr[1]/td[1]/input[1]");
```

2. Solicitar a Copilot: Selecciona la línea del selector y pide a Copilot que lo refactorice a un selector dinámico que pueda elegir el vuelo según un parámetro. Puedes usar un comentario como guía:

```Java
// Refactorizar a un selector dinámico que reciba el número de vuelo como parámetro
public static final Target BUTTON_CHOOSE_FLIGHT = Target.the("Boton Elegir Vuelo").locatedBy("//tbody/tr[1]/td[1]/input[1]");
```

3. Aceptar la sugerencia de Copilot: Copilot podría sugerir algo como:
```Java
public static Target botonElegirVuelo(int numeroVuelo) {
    return Target.the("Boton Elegir Vuelo " + numeroVuelo).locatedBy("//tbody/tr[" + numeroVuelo + "]/td[1]/input[1]");
}
```

4. Modificar el Step Definition: En ReservaVueloStepDefinitions.java, modifica el paso realiza_la_reserva para usar el nuevo selector dinámico. 
Primero, crea una nueva tarea para seleccionar el vuelo:

```Java
package example.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import example.userinterfaces.ReservaVuelo;

public class SeleccionarVuelo {
    public static Task numero(int numeroVuelo) {
        return Task.where("{0} selecciona el vuelo número " + numeroVuelo,
                Click.on(ReservaVuelo.botonElegirVuelo(numeroVuelo))
        );
    }
}
```
Luego, modifica el Step Definition:
```Java
@When("{actor} realiza la reserva con {string} y {string}")
public void realiza_la_reserva(Actor actor, String desde, String hasta) {
    actor.wasAbleTo(
            SeleccionaPaises.ciudades(desde,hasta),
            SeleccionarVuelo.numero(1), // Selecciona el primer vuelo por defecto
            Click.on(BUTTON_PURCHASE_FLIGHT)
    );
}
```
### Resultado Esperado:
El selector BUTTON_CHOOSE_FLIGHT se ha refactorizado a un selector dinámico que puede elegir el vuelo según un parámetro.
El Step Definition realiza_la_reserva utiliza el nuevo selector dinámico para seleccionar el vuelo.


## Ejercicio 2: Añadir un Assertion Personalizado

1. Identificar la verificación existente: En el archivo ReservaVueloStepDefinitions.java, identifica la verificación existente en el paso verifica_reserva_efectuada.

```Java
actor.attemptsTo(
    Ensure.that(MensajeSuccess.mensajePresente()).isEqualTo("Thank you for your purchase today!")
);
```
2. Solicitar a Copilot: Selecciona la línea de la verificación y pide a Copilot que añada una verificación adicional para asegurar que el ID de transacción esté presente en la página. Puedes usar un comentario como guía:

```Java
// Añadir una verificación para asegurar que el ID de transacción esté presente en la página
actor.attemptsTo(
    Ensure.that(MensajeSuccess.mensajePresente()).isEqualTo("Thank you for your purchase today!")
);
```
3. Aceptar la sugerencia de Copilot: Copilot podría sugerir algo como:

```Java
actor.attemptsTo(
    Ensure.that(MensajeSuccess.mensajePresente()).isEqualTo("Thank you for your purchase today!"),
    Ensure.that(Target.the("ID de transacción").locatedBy("//td[contains(text(),'Id:')]").resolveFor(actor).getText()).isNotEmpty()
);
```
### Resultado Esperado:

Se ha añadido una verificación adicional para asegurar que el ID de transacción esté presente en la página.


## Ejercicio 3: Mejorar la Legibilidad del Código con Copilot

1. Identificar un bloque de código complejo: En el archivo CarritoDeCompraStepDefinitions.java, identifica el bloque de código en el método verificas_catalogo_con_nombre_y_precio_de_producto.


```Java
@Then("verificas catalogo con nombre y precio de producto")
public void verificas_catalogo_con_nombre_y_precio_de_producto(List<Producto> productoRecibido) {

    for (Producto producto : productoRecibido) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(PageElement.withCSSClass("inventory_item").containingText(producto.getNombre())).isDisplayed(),
                Ensure.that(PageElement.withCSSClass("inventory_item").containingText(producto.getNombre())).textContent().contains(producto.getPrecio())
        );

    }
}
```
2. Solicitar a Copilot: Selecciona el bloque de código y pide a Copilot que mejore la legibilidad del código. Puedes usar un comentario como guía:

```Java
// Mejorar la legibilidad del código
@Then("verificas catalogo con nombre y precio de producto")
public void verificas_catalogo_con_nombre_y_precio_de_producto(List<Producto> productoRecibido) {

    for (Producto producto : productoRecibido) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(PageElement.withCSSClass("inventory_item").containingText(producto.getNombre())).isDisplayed(),
                Ensure.that(PageElement.withCSSClass("inventory_item").containingText(producto.getNombre())).textContent().contains(producto.getPrecio())
        );

    }
}
```
3. Aceptar la sugerencia de Copilot: Copilot podría sugerir algo como:

```Java
@Then("verificas catalogo con nombre y precio de producto")
public void verificas_catalogo_con_nombre_y_precio_de_producto(List<Producto> productoRecibido) {
    for (Producto producto : productoRecibido) {
        String nombreProducto = producto.getNombre();
        String precioProducto = producto.getPrecio();

        OnStage.theActorInTheSpotlight().attemptsTo(
            Ensure.that(PageElement.withCSSClass("inventory_item").containingText(nombreProducto)).isDisplayed(),
            Ensure.that(PageElement.withCSSClass("inventory_item").containingText(nombreProducto)).textContent().contains(precioProducto)
        );
    }
}
```

### Resultado Esperado:

El código se ha refactorizado para mejorar la legibilidad, utilizando variables descriptivas para el nombre y el precio del producto.
