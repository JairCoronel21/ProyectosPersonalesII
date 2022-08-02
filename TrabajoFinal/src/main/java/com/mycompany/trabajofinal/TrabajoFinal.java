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
package com.mycompany.trabajofinal;

import java.util.Scanner;

public class TrabajoFinal {
  
       public boolean clientes(String[] user, String[] pwd) {
           Scanner sc = new Scanner(System.in);
           System.out.println("BIENVENIDO AL CAJERO AUTOMATICO PERÚ BANK");
           System.out.println("===============================");
           
           System.out.println("Ingrese su nombre de usuario por favor");
           String usuario = sc.nextLine();
           
           System.out.println("Por favor ingrese su contraseña:");
           String password = sc.nextLine();
           boolean activador = false;
           
            for (int i = 0; i < user.length; i++) {
            if (usuario.equalsIgnoreCase(user[i]) && password.equalsIgnoreCase(pwd[i])) {
                activador = true;

                break;
            } else {
                activador = false;

            }
        }
       return activador;
}}
        
