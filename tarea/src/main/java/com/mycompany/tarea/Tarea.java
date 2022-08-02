

package com.mycompany.tarea;

import java.util.Scanner;
public class Tarea {
public static void main(String args[]) {
 
//Creamos la clase BufferedReader para la entrada de datos por teclado:
    Scanner entrada = new Scanner(System.in);
 
    boolean seguir = true;
 
//Ahora creo el código para preguntar si deseo continuar:
    while (seguir) {
        System.out.print("¿Desea continuar? ");
 
        System.out.println("S / N ");
        String opc = entrada.next();
        if (opc.equals("s") || opc.equals("S")) { // Desicion repetir o no 
            System.out.print("Introduce un numero: ");
            String numero = entrada.next();
            double numDouble = Double.parseDouble(numero);
            if (numDouble % 2 != 0) {
                System.out.println("El numero es impar");
            } else {
                System.out.println("El numero es par");
            }
        }else{
            seguir=false;
        }
    }
 
}
    

}



