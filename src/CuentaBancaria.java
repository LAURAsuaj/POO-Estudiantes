/**
 * clase CuentaBancaria
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreBanco;
    private String nombreUsuario;
    private double saldo;

    /****************************************************************************************************/
    /******************************************* CONSTRUCTORES ******************************************/
    /****************************************************************************************************/

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
    public String consignar(double valor){
        this.saldo += valor;
        return "CONSIGNACIÓN EXITOSA";
    }

    /**
     * Método que permite retirar el valor de la cuenta bancaria
     * @param valor
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String retirar(double valor){
        if(valor > this.saldo){
            return "LA CUENTA NO TIENE FONDOS SUFICIENTES";
        }
        else{
            this.saldo -= valor;
            return "RETIRO EXITOSO";
        }
    }

    /****************************************************************************************************/
    /*************************************** MÉTODOS MODIFICADORES **************************************/
    /****************************************************************************************************/

    /**
     * Método para obtener el número de cuenta
     * @return Retorna el número de cuenta
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }

    /**
     * Método que permite consultar el saldo de la cuenta bancaria
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double getSaldo(){
        return this.saldo;
    }

    /**
     * Método que permite consultar el nombree del banco asociado a la cuenta bancaria
     * @return Nombre de la cuenta
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * Método que permite consultar el nombre del usuario asociado a la cuenta bancaria
     * @return Nombre del usuario
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }
}
