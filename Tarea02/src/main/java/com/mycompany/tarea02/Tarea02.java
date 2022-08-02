/*
Crear una aplicación que almacene la siguiente informacion mediante vectores
La aplicación debe permitir que el ingreso al sistema mediante el nombre de usuario y 
contraseña correcta. Al ingresar se muestra el mensaje Bienvenido!!!.
• Si el usuario que ingresa es el usuario con el perfil Admin, se debe mostrar el listado de 
usuarios activos e inactivos por separado
*/

package com.mycompany.tarea02;
import java.util.Scanner;


public class Tarea02 {

    public static void main(String[] args) {
               Scanner scStr = new Scanner(System.in);
                   
               
       String[] usuario = {"jperez", "acastro", "mpandilla", "raulp"};
       String[] pwd = {"12a23", "12a5d", "fred", "der22"};
       String[] perfil = {"Admin", "user", "user", "user"};
       int[] estado = {1, 1, 1, 0};
       String[] clave = {"senati", "peru", "amazon", "lima"};
        
       
       String password, user;
        System.out.println("Ingrese el nombre de usuario por favor:");
        user = scStr.nextLine();
        
        System.out.println("Ingrese la contraseña: ");
        password = scStr.nextLine();
          
      
       
        for (int i = 0; i < usuario.length; i++) {
            
        
      
        
        if (password.equalsIgnoreCase(pwd[i])) {
            
            System.out.println("Bienvenido!!! Contraseña y usuario correctos");
            System.out.println("El perfil de usted es: "+perfil[i]);
            if (("Admin".equals(perfil[i]))) {
                            System.out.println("**USUARIOS ACTIVOS**");
                            for (int a = 0; a < usuario.length; a++) {
                                if (estado[a] == 1) {
                                    System.out.println(usuario[a]);
                                    
                                } if (estado[a] == 0) {
                                    System.out.println("========================");
                                    System.out.println("***USUARIOS INACTIVOS*****");
                                    System.out.println(usuario[a]);
                                    break;
                                }
                            }         
                            
            }else {
                System.out.println("Lo sentimos usted tiene perfil user");
                break;
            }
            
            
            
        }else{
            System.out.println("Los datos ingresados son Incorrectos");
             break;
        }
        
        }
    
    }

}

        
        
    


