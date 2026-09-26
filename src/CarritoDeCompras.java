public class CarritoDeCompras {

    double monto;
    PasarelaDePagos pasarelaDePagos;

    public CarritoDeCompras(double monto, PasarelaDePagos pasarelaDePagos) {
        this.monto = monto;
        this.pasarelaDePagos = pasarelaDePagos;
    }

    public void realizarCompra(Tarjeta tarjeta){

        boolean pagoExitoso = pasarelaDePagos.procesarPago(monto, tarjeta);

        if(pagoExitoso){
            System.out.println("Compra realizada con éxito");
        }else {
            System.out.println("El pago fue rechazado");
        }
    }

}
