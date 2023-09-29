/**
 * clase Principal
 */
public class Principal {
    /**
     * Método inicial que es ejecutado
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {
        CuentaBancaria cuentaMario = new CuentaBancaria("C1", "Bancolombia", "Mario");
        CuentaBancaria cuentaLuigi = new CuentaBancaria("C2", "Davivienda", "Luigi");

        cuentaMario.consignar(100);
        System.out.println("El saldo de la cuenta de Mario es "+cuentaMario.consultarsaldo());

        cuentaLuigi.consignar(10);
        System.out.println("El saldo de la cuenta de Luigi es "+cuentaLuigi.consultarsaldo());

        /** Reelizar una transferencia entre 2 cuentas **/
        int VALOR = 10;
        cuentaMario.retirar(VALOR);
        cuentaLuigi.consignar(VALOR);

        System.out.println("El saldo de la cuenta de Mario es "+cuentaMario.consultarsaldo());
        System.out.println("El saldo de la cuenta de Luigi es "+cuentaLuigi.consultarsaldo());


        /*********************************************************************************************************************/
        /** ESTE ES UN ERROR DE DISEÑO, DESDE AQUÍ NO DEBERÍA PERMITIRSE LA MODIFICACIÓN DEL ATRIBUTO SALDO DEL OBJETO MARIO **/
        /*********************************************************************************************************************/
        cuentaMario.saldo = -30;

        System.out.println("OHHHH NOOOOOOOO! mi saldo fue modificado. La clase CuentaBancaria es insegura, no tiene encapsulamiento :(");
        System.out.println("Mi nuevo saldo es: "+cuentaMario.consultarsaldo());
    }
}
