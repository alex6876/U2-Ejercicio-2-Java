public class Tarjeta {
    String numero;
    String Titular;

    public Tarjeta(String numero, String Titular) {
        this.numero = numero;
        this.Titular = Titular;
    }

    public String getnumero(){
        return numero;
    }

    public String getTitular(){
        return Titular;
    }
}
