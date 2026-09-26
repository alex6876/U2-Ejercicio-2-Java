public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("5422124445214", "Olivares Alex");

        PasarelaDePagos pasarela = new PasarelaDePagos();

        CarritoDeCompras carritoDeCompras = new CarritoDeCompras(48520,pasarela);

        carritoDeCompras.realizarCompra(tarjeta);
    }
}