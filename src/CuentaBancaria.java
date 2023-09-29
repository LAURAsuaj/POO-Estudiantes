/**
 * clase CuentaBancaria
 */
public class CuentaBancaria {

    private String nombre;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;
    private double fecha;

    /****************************************************************************************************/
    /******************************************* CONSTRUCTORES ******************************************/
    /****************************************************************************************************/
    /**
     *  * Método constuctor para inicializar los atributos de la clase
     * @param nombre
     * @param notaMateria1
     * @param notaMateria2
     * @param notaMateria3
     *
     * * Complejidad temporal: O(1) Tiempo constante
     */
    public CuentaBancaria(String nombre, double notaMateria1, double notaMateria2, double notaMateria3, double fecha) {
        this.nombre = nombre;
        this.notaMateria1 = notaMateria1;
        this.notaMateria2 = notaMateria2;
        this.notaMateria3 = notaMateria3;
        this.fecha = fecha;
    }

    
    public double getEdad(double fecha){
        this.fecha += valor;
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
