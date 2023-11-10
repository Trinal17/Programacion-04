/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.ut04gestionnotasalumnos.util;

import static es.daw.ut04gestionnotasalumnos.util.Utils.leerNumero;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Informes {
   
    /**
     *
     */
    public static void gestionarInformes(Scanner sc) {
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

            opcion = leerNumero(sc);

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
    
    
}
