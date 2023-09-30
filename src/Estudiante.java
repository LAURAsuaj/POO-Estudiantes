import java.time.LocalDate;

/**
 * Clase Estudiante
 */
public class Estudiante {
    private String nombre;
    private LocalDate fechaNacimiento;
    private double notaMateria1 = 0.0;
    private double notaMateria2 = 0.0;
    private double notaMateria3 = 0.0;
    /*******************************************************************************/
    /*********************************CONSTRUCTORES ********************************/
    /*******************************************************************************/

    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param nombre
     * @param fechaNacimiento
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Estudiante(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Metodo que permite obtener la edad del estudiante a partir de la fecha de nacimiento
     * @return
     * Complejidad temporal: O(1) Tiempo constante
     */
    public int getEdad() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }

    /**
     * Metodo que calcula el promedio de las notas de las materias
     * @return
     */
    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3;
    }
    /********************************************************************************/
    /***************************** MÉTODOS MODIFICADORES ****************************/
    /********************************************************************************/

    /**
     * Método para obtener el nombre del estudiante
     * @return Retorna el nombre
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que permite consultar el fecha de nacimiento del estudiante
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    /********************************************************************************/
    /*************************** MÉTODOS CONSULTA DE NOTAS **************************/
    /********************************************************************************/
    /**
     * Complejidad temporal: O(1) Tiempo constante
     * @return
     */
    public double getNotaMateria1() {
        return notaMateria1;
    }
    public double getNotaMateria2() {
        return notaMateria2;
    }
    public double getNotaMateria3() {
        return notaMateria3;
    }
    /********************************************************************************/
    /********************** MÉTODOS QUE MODIFICAN LOS ATRIBUTOS *********************/
    /******************************* opción adicional *******************************/
    /**
     * Complejidad temporal: O(1) Tiempo constante
     * @param nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }
}