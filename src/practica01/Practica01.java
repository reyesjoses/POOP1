package practica01;

/**
 * Clase de práctica que imprime "HelloWorld" y realiza la suma de dos números enteros.
 * 
 * <p>Este programa define dos variables enteras, las suma y muestra el resultado en consola.</p>
 * 
 * @author evare
 * @version 1.0
 */
public class Practica01 {

    /**
     * Método principal que ejecuta el programa.
     * Imprime un mensaje en pantalla, realiza la suma de dos números enteros y muestra el resultado.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Imprimir un mensaje de bienvenida
        System.out.println("HelloWorld");

        // Declaración de variables
        int num1 = 5;  // Primer número entero
        int num2 = 7;  // Segundo número entero
        
        // Calcular la suma de los dos números
        int suma = num1 + num2;

        // Mostrar el resultado de la suma
        System.out.println("La suma es: " + suma);
    }
}
