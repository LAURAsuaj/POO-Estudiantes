/**
 * clase CuentaBancaria
 */
public class CuentaBancaria {
    String numeroCuenta;
    String nombreBanco;
    String nombreUsuario;
    double saldo;

    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param numeroCuenta Número de la cuenta bancaria
     * @param nombreBanco Nombre del banco
     * @param nombreUsuario Nombre del usuario titular de la cuenta bancaria
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public CuentaBancaria(String numeroCuenta, String nombreBanco, String nombreUsuario){
        this.numeroCuenta = numeroCuenta;
        this.nombreBanco = nombreBanco;
        this.nombreUsuario = nombreUsuario;
        this.saldo = 0.0;
    }

    /**
     * Método que permite realizar una consignación en la cuenta bancaria
     * @param valor
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    void consignar(double valor){
        this.saldo += valor;
    }

    /**
     * Método que permite retirar el valor de la cuenta bancaria
     * @param valor
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    void retirar(double valor){
        this.saldo -= valor;
    }

    /**
     * Método que permite consultar el saldo de la cuenta bancaria
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    double consultarsaldo(){
        return this.saldo;
    }
}
