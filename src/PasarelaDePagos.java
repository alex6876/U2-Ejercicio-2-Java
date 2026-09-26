public class PasarelaDePagos {

    public boolean procesarPago(double monto, Tarjeta tarjeta){

        System.out.println("Iniciando proceso de pago");
        System.out.println("Monto: "+monto);
        System.out.println("Tarjeta: "+tarjeta.getTitular());

        return true;
    }
}
