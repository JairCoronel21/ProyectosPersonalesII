/*La aplicación debe permitir que los usuarios puedan recuperar sus contraseñas 
mediante el ingreso de la PalabraClave, solo para los usuarios activos (Estado es 1), si el 
usuario esta inactivo (Estado es 0), debe mostrarse un mensaje de error
*/


package com.mycompany.tarea01;

import java.util.Scanner;

public class Tarea01 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
    
       
       
       String[] usuario = {"jperez", "acastro", "mpandilla", "raulp"};
       String[] pwd = {"12a23", "   12a5d", "fred", "der22"};
       String[] perfil = {"Admin", "user", "user", "user"};
       int[] estado = {1, 1, 1, 0};
       String[] clave = {"senati", "peru", "amazon", "lima"};
       
       
           String user, palabra;
       
       
         
         System.out.println("Ingrese Nombre de usuario: ");
         user = sc.nextLine();
         
         
      for (int i = 0; i < usuario.length; i++) {
        if (estado[i] == 1) {
        if (user.equalsIgnoreCase(usuario[i])){
            System.out.println("Usuario Activo");
            System.out.println("Su perfil es de: " + perfil[i]);
            System.out.println("Ingrese la palabra clave para recuperar la contraseña: ");
            palabra = sc.nextLine();
            if (palabra.equalsIgnoreCase(clave[i])) {
                System.out.println("Su contraseña es: " + pwd[i]);
                break;
            }
        }
        }else{
            System.out.println("Error al ingresar :(");  
           
        }             
                                
         }}
                                
      }                  
      
    
           
    



