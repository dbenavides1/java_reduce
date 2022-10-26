/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package group.reduce;

import java.util.Arrays;

/**
 *
 * @author David
 */
public class Reduce {

    public static void main(String[] args) {
        //Usamos Reduce para crear un acumulador que opere los salarios
        double[] salaries = {10, 90, 50, 55, 62};
        
        //reduce(valor inicial, funcion)
        double sum = Arrays.stream(salaries).reduce(0, (a, b) -> a + b);
        double rest = Arrays.stream(salaries).reduce(0, (a, b) -> a - b);
        double mul = Arrays.stream(salaries).reduce(1, (a, b) -> a * b);
        double div = Arrays.stream(salaries).reduce(100, (a, b) -> a / b);
        
        System.out.println("suma: " + sum + "\nresta: " + rest + "\nmultiplicacion: " + mul + "\ndivision: " + div);
    }
}
