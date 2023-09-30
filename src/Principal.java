import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.LocalDate;

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

        LocalDate fechaNacimientoMario = LocalDate.of(2005, 10, 8);
        Estudiante cuentaMario = new Estudiante("Lupita", fechaNacimientoMario);

        System.out.println("Datos del estudiante:");
        System.out.println("Nombre: " + cuentaMario.getNombre());
        System.out.println("Fecha de Nacimiento: " + cuentaMario.getFechaNacimiento());
        System.out.println("Edad: " + cuentaMario.getEdad());
        System.out.println("Promedio de Notas: " + cuentaMario.getPromedio());

        /**
         * Insertar las notas del estudiante para calcular el promedio
         */
        cuentaMario.setNotaMateria1(4.5);
        cuentaMario.setNotaMateria2(3.8);
        cuentaMario.setNotaMateria3(4.0);

        /**
         * Se obtiene la nota de la materia del estudiante y luego mostrarla por consola
         */
        System.out.println();
        System.out.println("Notas de las Materias:");
        double nota1 = cuentaMario.getNotaMateria1();
        System.out.println("Materia 1: " + nota1);

        double nota2 = cuentaMario.getNotaMateria2();
        System.out.println("Materia 2: " + nota2);

        double nota3 = cuentaMario.getNotaMateria3();
        System.out.println("Materia 3: " + nota3);

        System.out.println("Promedio de Notas: " + cuentaMario.getPromedio());

        System.out.println();
        /**
         * Utilizar los métodos setNombre y setFechaNacimiento para cambiar el nombre y la fecha de nacimiento
         */

        System.out.println("Datos de "+cuentaMario.getNombre() + " después del cambio:");
        cuentaMario.setNombre("Paquita");
        System.out.println("Nombre: " + cuentaMario.getNombre());
        cuentaMario.setFechaNacimiento(LocalDate.of(1997, 9, 1));
        System.out.println("Fecha de Nacimiento: " + cuentaMario.getFechaNacimiento());
        System.out.println("Edad: " + cuentaMario.getEdad());
    }
}
