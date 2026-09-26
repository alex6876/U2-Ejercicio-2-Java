# 💳 Ejercicio — Pasarela de Pagos y Carrito de Compras

Proyecto enfocado en la interacción y colaboración entre clases, procesamiento de transacciones financieras y simulación de un flujo de compra de comercio electrónico mediante Programación Orientada a Objetos (POO) en Java.

---

## 📝 Descripción

El sistema implementa un modelo de checkout electrónico compuesto por los datos del medio de pago (Tarjeta), un servicio externo o intermediario de cobro (PasarelaDePagos) y la gestión del pedido (CarritoDeCompras), coordinando la validación e informe del resultado del pago.

---

## 🚀 Funcionalidades e Implementación

### 📦 Clase Tarjeta

* **Atributos:**
* **numero** (String): Identificador o numeración plástica de la tarjeta.
* **Titular** (String): Nombre y apellido del propietario de la tarjeta.


* **Métodos Implementados:**
* **Constructor Tarjeta:** Registra el número y el titular del plástico.
* **Métodos Getters:** Permiten consultar los atributos mediante `getnumero()` y `getTitular()`.



### 📦 Clase PasarelaDePagos

* **Métodos Implementados:**
* **procesarPago(double monto, Tarjeta tarjeta):** Imprime los detalles de la transacción (monto e información del titular) y retorna `true` para simular la aprobación de la entidad bancaria.



### 📦 Clase CarritoDeCompras

* **Atributos:**
* **monto** (double): Valor total acumulado de la compra.
* **pasarelaDePagos** (PasarelaDePagos): Instancia de la pasarela utilizada para tramitar la cobranza.


* **Métodos Implementados:**
* **Constructor CarritoDeCompras:** Asigna el monto del pedido e integra el servicio de pasarela de pagos.
* **realizarCompra(Tarjeta tarjeta):** Invoca el procesamiento del pago enviando el monto y la tarjeta. Si el resultado es favorable, informa la confirmación de la compra; en caso contrario, notifica el rechazo del pago.



---

## 💻 Programa Principal (main)

El flujo principal ejecuta la siguiente simulación de compra en línea:

1. Instancia la `Tarjeta` asignada al titular "Olivares Alex" con el número "5422124445214".
2. Instancia la entidad `PasarelaDePagos`.
3. Crea el `CarritoDeCompras` fijando un monto de $48.520 y vinculando la pasarela de pagos.
4. Ejecuta la transacción con `realizarCompra(tarjeta)`, mostrando los mensajes de procesamiento e informando la finalización exitosa de la compra.
