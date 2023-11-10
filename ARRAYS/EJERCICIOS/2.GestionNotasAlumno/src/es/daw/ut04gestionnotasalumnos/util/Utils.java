/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.ut04gestionnotasalumnos.util;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Utils {
    /**
     * Método que pinta el menú principal por consola
     */
    public static void pintaMenu() {
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
    public static int leerNumero(Scanner sc) {
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

}
