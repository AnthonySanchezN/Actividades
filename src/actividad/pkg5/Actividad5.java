/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad5 {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int x;
        System.out.println("Ingresa el primer caracter");
        x = Integer.parseInt(entrada.readLine());
        
        int y;
        System.out.println("Ingresa el segunda caracter");
        y = Integer.parseInt(entrada.readLine());
        
        int suma;
        suma = x + y;
        
        int resta;
        resta = x - y;
        
        int multiplicacion;
        multiplicacion = x * y;
        
        int division;
        division = x / y;
        
        int modulo;
        modulo = x % y;
        
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicacion = " + multiplicacion);
        System.out.println("Division = " + division);
        System.out.println("Modulo = " + modulo);        
    }
    
}
