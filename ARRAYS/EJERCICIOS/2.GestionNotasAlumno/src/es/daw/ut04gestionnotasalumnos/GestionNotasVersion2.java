/*
 * https://github.com/profeMelola/Programacion-04-2023-24/tree/main/ARRAYS/EJERCICIOS/2.GestionNotasAlumno#programa-para-la-gesti%C3%B3n-de-notas-de-los-alumnos
 */
package es.daw.ut04gestionnotasalumnos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class GestionNotasVersion2 {

    // DECLARACIONES A NIVEL GENERAL
    // Declaro el scanner de forma global a toda la clase
    static Scanner sc = new Scanner(System.in);
    
    static final String[] MODULOS = {"PR","BD","SI","LM","ED","FOL"};
    
    static String[] nombresAlumnos;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 3;
        
        // Declaro el array bidimensional para guardar las notas
        float[][] notasAlumno;

        do {
            pintaMenu();
            opcion = leerNumero();

            switch (opcion) {
                case 1:
                    System.out.println("Vas a cargar datos....");
                    notasAlumno=cargarNotas();
                    break;
                case 2:
                    System.out.println("Vas a gestionar informes...");
                    gestionarInformes();
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
     * Método que pinta el menú principal por consola
     */
    private static void pintaMenu() {
        System.out.println("********* PROGRAMA DE GESTIÓN DE NOTAS DE ALUMNOS ********");
        System.out.println("1. Cargar datos de alumnos");
        System.out.println("2. Informes");
        System.out.println("3. Salir");
        System.out.println("-----------------");
        System.out.println("Elige una opción");
    }

    /**
     * Hasta que no se escriba un número que repita
     *
     * @return
     */
    private static int leerNumero() {
        boolean correcto = false;
        int opcion = 0;
        try {
            while (!correcto) {
                opcion = sc.nextInt();
                correcto = true;
            }
        } catch (Exception e) {
            System.out.println("Excepción de teclado");
            sc.nextLine();
        }
        return opcion;
    }

    /**
     *
     */
    private static void gestionarInformes() {
        int opcion = 6;
        do{
            System.out.println("**** SUBMENÚ DE INFORMES *****");
            System.out.println("1. Mostrar todas las notas\n"
                    + "2. Mostrar las notas de un módulo concreto\n"
                    + "3. Nota media de cada módulo\n"
                    + "4. Nota media de cada alumno\n"
                    + "5. Ver nota de un alumno en un módulo concreto\n"
                    + "6. Volver al menú principal\n"
                    + "-----------------------------------------\n"
                    + "Elige una opción:");

            opcion = leerNumero();

            switch (opcion) {
                case 1:
                    System.out.println("Se van a mostrar las notas...");
                    break;
                case 2:
                    System.out.println("Se va a mostrar las notas de un módulo concreto...");
                    break;
                case 3:
                    System.out.println("Se va a mostrar la nota media de cada módulo");
                    break;
                case 4:
                    System.out.println("Se va a mostrar la nota media de cada alumno");
                    break;
                case 5:
                    System.out.println("Se va a ver la nota de un alumno en un módulo concreto");
                    break;
                case 6:
                    System.out.println("Vuelvo al menú principal");
                    break;
                default:
                    System.out.println("Debes elegir una opción del menú correcta");


            }
        }while(opcion != 6);
    }
    
    /**
     * Método que pide al usuario el número de alumnos de los que va a cargar las notas
     * y carga todas esas notas de los 6 módulos en una matriz
     * @return matriz con todas las notas de los alumnos cargadas
     */
    private static float[][] cargarNotas(){
        
        System.out.println("¿De cuántos alumnos vas a introducir notas?");
        int numAlumnos = leerNumero();
        
        float[][] notas = new float[numAlumnos][MODULOS.length];
        
        // PENDIENTE RELLENAR LAS NOTAS...
        return notas;
        
    }
    /*
    private static float[][] cargarNotasByAlumno() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vas a cargar las notas completas de cada alumno!!");
        System.out.println("¿De cuántos alumnos vas a introducir notas?");
        int numAlumnos = sc.nextInt();
        sc.nextLine();

        // Una vez que se el número de alumnos tengo que declarar:
        // - La matriz con su número de filas
        // - El array de nombres con tu tamaño (nombres de los alumnos)
        float[][] matriz = new float[numAlumnos][MODULOS.length];
        nombresAlumnos = new String[numAlumnos];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce el nombre del alumno <" + (i + 1) + ">:");
            nombresAlumnos[i] = sc.nextLine();

            System.out.println("\tAhora vas a introducir las notas de " + nombresAlumnos[i]);

            for (int j = 0; j < matriz[i].length; j++) {
                //for (int j = 0; j < MODULOS.length; j++) {
                System.out.println("\tIntroduce la nota de " + MODULOS[j]);
                matriz[i][j] = sc.nextFloat();
            }

            sc.nextLine();
        }

        return matriz;
    }*/
    
}
