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
        System.out.println("El saldo de la cuenta de Mario es "+cuentaMario.getSaldo());

        cuentaLuigi.consignar(10);
        System.out.println("El saldo de la cuenta de Luigi es "+cuentaLuigi.getSaldo());

        /** Reelizar una transferencia entre 2 cuentas **/
        int VALOR = 200;
        String resultado = cuentaMario.retirar(VALOR);
        System.out.println(resultado);
        if(resultado.equals("RETIRO EXITOSO")) {
            resultado = cuentaLuigi.consignar(VALOR);
            System.out.println(resultado);
        }

        System.out.println("El saldo de la cuenta de Mario es "+cuentaMario.getSaldo());
        System.out.println("El saldo de la cuenta de Luigi es "+cuentaLuigi.getSaldo());
    }
}
