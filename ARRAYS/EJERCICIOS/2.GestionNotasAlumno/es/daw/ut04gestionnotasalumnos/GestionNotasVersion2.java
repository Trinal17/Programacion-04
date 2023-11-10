/*
 * https://github.com/profeMelola/Programacion-04-2023-24/tree/main/ARRAYS/EJERCICIOS/2.GestionNotasAlumno#programa-para-la-gesti%C3%B3n-de-notas-de-los-alumnos
 */
package es.daw.ut04gestionnotasalumnos;

import static es.daw.ut04gestionnotasalumnos.util.Informes.gestionarInformes;
import static es.daw.ut04gestionnotasalumnos.util.Utils.leerNumero;
import static es.daw.ut04gestionnotasalumnos.util.Utils.pintaMenu;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class GestionNotasVersion2 {

    // DECLARACIONES A NIVEL GENERAL
    // Declaro el scanner de forma global a toda la clase
    static Scanner sc = new Scanner(System.in);

    static final String[] MODULOS = {"PR", "BD", "SI", "LM", "ED", "FOL"};

    static String[] nombresAlumnos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 3;

        // Declaro el array bidimensional para guardar las notas
        float[][] notasAlumno = null;

        do {
            pintaMenu();
            opcion = leerNumero(sc);

            switch (opcion) {
                case 1:
                    notasAlumno = cargarNotas();
                    break;
                case 2:
                    if (notasAlumno == null)
                        System.out.println("No se pueden generar informes si no has introducido las notas");
                    else
                        gestionarInformes(sc);
                    break;
                case 3:
                    System.out.println("Vas a salir del programa...");
                    break;
                default:
                    System.out.println("Debes elegir una opción del menú correcta");
            }

        } while (opcion != 3);

    }

    /**
     * Método que pide al usuario el número de alumnos de los que va a cargar
     * las notas y carga todas esas notas de los 6 módulos en una matriz
     *
     * @return matriz con todas las notas de los alumnos cargadas
     */
    private static float[][] cargarNotas() {
        System.out.println("Vas a cargar las notas completas de cada alumno!!");
        System.out.println("¿De cuántos alumnos vas a introducir notas?");
        int numAlumnos = leerNumero(sc);
        sc.nextLine(); //coo vo a leer luego String (por el nombre del alumno)...
        
        // Una vez que se el número de alumnos tengo que declarar:
        // - La matriz con su número de filas
        // - El array de nombres con tu tamaño (nombres de los alumnos)
        float[][] notas = new float[numAlumnos][MODULOS.length];
        nombresAlumnos = new String[numAlumnos];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce el nombre del alumno <" + (i + 1) + ">:");
            nombresAlumnos[i] = sc.nextLine();

            System.out.println("\tAhora vas a introducir las notas de " + nombresAlumnos[i]);

            for (int j = 0; j < notas[i].length; j++) {
                //for (int j = 0; j < MODULOS.length; j++) {
                System.out.println("\tIntroduce la nota de " + MODULOS[j]);
                notas[i][j] = sc.nextFloat();
            }

            sc.nextLine();
        }

        return notas;

    }


}
