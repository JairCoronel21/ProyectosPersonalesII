/*
El Nuevo Perú Bank desea Implementar un programa para un cajero Automático en 
Java. El cual los clientes puedan realizar las operaciones frecuentes en un cajero. El 
algoritmo permitirá tres intentos para el ingreso y la contraseña, De ingresar 
incorrectamente más de 3 veces el programa finaliza y manda un mensaje de 
error.
Operaciones para realizar:
Ingreso del usuario (Nick) 
1 = Deposito
2.= Retiro de saldo
3 = Consulta de saldo
4 = Salir del sistema

*/

package com.mycompany.trabajo_final;
import java.util.Scanner;

public class Trabajo_Final {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //VARIABLES
        String[] user = {"jperez", "acastro", "Nick"};
        String[] pwd = {"12a23", "12a5d", "@123"};
        int saldo = 5000;
        //Almacenar valor salir como falso
        boolean salir = false;
         
        
        String usuario = "", password = "";
        
        System.out.println("BIENVENIDO AL CAJERO AUTOMATICO PERÚ BANK");
        System.out.println("===============================");
        
  

        //CICLO FOR PARA SABER LAS VECES QUE INTENTA INGRESAR LA CONTRASEÑA
        for (int i = 1; i <= 3; i++) {
            
            
                
            
            //ENTRADA
            System.out.println("Ingrese su nombre de usuario por favor:  ");
            usuario = sc.nextLine();
            
            
            System.out.println("Por favor ingrese su contraseña:");
            password = sc.nextLine();
            
           
            
            
              //LA CONDICION DEL USUARIO Y CONTRASEÑA
            if ((usuario.equals(user[0]) && password.equals(pwd[0]) || usuario.equals(user[1]) && password.equals(pwd[1]) ||
                    usuario.equals(user[2]) && password.equals(pwd[2]))) {
                System.out.println("Sus datos son correctos");
                break;
            }else {
                if (i <= 2) {
                    System.out.println("Lo siento, la contraseña es incorrecta, aún tienes: " + (3 - i) + " intentos");
                } else {
                                System.out.println("!Lamentablemente hemos bloqueado el usuario, "
                                    + "ya que accedio a los 3 intentos permitidos");
                            System.out.println("Bloqueando el usuario..........");
                            System.out.println("Comuniquese con soporte de PERU BANK ");
                        System.exit(0);
                        
                }
             
            }
        
        }
        
            
        
        //VARIABLES
        int opcion;
        int nuevo_saldo = 0,  seguir = 0;
        int depositar, retirar;
        //LA CONDICION CON AYUDA DE SALIR
        //BUCLE DO-WHILE
        do{
                
            while (!salir) {
                System.out.println("=========================================");
                    System.out.println("BIENVENIDO SR " + usuario);
                    System.out.println("**INGRESE LAS OPCIONES: **");
                    System.out.println("1 = Deposito");
                    System.out.println("2.= Retiro de saldo");
                    System.out.println("3 = Consulta de saldo");
                    System.out.println("4 = Salir del sistema");
                    System.out.println("Ingrese la opcion que desea: ");
                    opcion = sc.nextInt();
                            
                     switch (opcion){
                         
                         
                     case 1:
                         System.out.println("=========================================");
                         System.out.println("DEPOSITO:");
                         System.out.println("Ingrese el monto a depositar: ");
                         depositar = sc.nextInt();
                         nuevo_saldo = saldo + depositar;
                         System.out.println("Su saldo actual es de: "+nuevo_saldo+" soles");
                         saldo = nuevo_saldo;
                         System.out.println("=========================================");
                         break;
                         
                         
                     case 2:
                         System.out.println("=========================================");
                         System.out.println("RETIRO:");
                         System.out.println("Ingrese el monto a retirar: ");
                         retirar = sc.nextInt();
                                if (retirar > saldo) {
                                    System.out.println("No cuenta con el saldo suficiente");
                                }else {
                                 nuevo_saldo = saldo - retirar;
                                 saldo = nuevo_saldo;
                                 System.out.println("Su saldo actual es de: "+nuevo_saldo+" soles");
                                }
                                
                         System.out.println("=========================================");   
                         break;
                         
                         
                     case 3:
                         System.out.println("=========================================");
                         System.out.println("CONSULTA DE SALDO:");
                         System.out.println("Su saldo actualmente es de: "+saldo+" soles");
                         System.out.println("=========================================");
                         break;
                         
                         
                     case 4:
                         salir = true;
                         seguir = 1;
                         System.out.println("=========================================");
                         System.out.println("Muchas gracias por su tiempo!!!");
                         System.out.println("=========================================");
                       
                         System.exit(0);
                         break;
                     default:
                         System.out.println("=========================================");
                         System.out.println("Ingreso una opcion erronéa..Vuelva al principio por favor!!!");
                         System.out.println("=========================================");
                break;
                     }            
        }     
            
            
            
        
        }while(seguir == 0);
     
        
    }
}
