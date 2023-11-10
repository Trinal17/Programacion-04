/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT04_Estructuras%20de%20Almacenamiento/Array#ejercicio-5
 */
package es.daw.ut04ejerciciosarrays1d;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author melola
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] pares = rellenaDeNumerosPares(10, 100);
        
        System.out.println("Array de números pares ordenados: "+Arrays.toString(pares));
        
    }
    
    /**
     * rellenaDeNumerosPares
     * @param longitud
     * @param fin
     * @return 
     */
    public static int[] rellenaDeNumerosPares(int longitud, int fin){
        int pares[] = new int[longitud];
        
        int i = 0;
        
        Random r = new Random();
        int num = 0;
        
        while( i < pares.length){
            //int num = (int) (Math.random() * fin + 1);
            
            num = r.nextInt(fin) + 1; // desde 1 a 100. Como solo se guardan pares, el par menor sería 2
            
            if (num % 2 == 0){
                pares[i] = num;
                i++;
            }
        }
        
        // ordenación ascendente
        Arrays.sort(pares); 
        
        return pares;
        
    }
    
}
