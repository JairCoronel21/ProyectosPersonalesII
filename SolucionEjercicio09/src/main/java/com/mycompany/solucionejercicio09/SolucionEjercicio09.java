/*
  SOLUCION 09 - ACTIVIDAD 01
Desarrolle una aplicación que simule la venta de un producto.
Proceso
o Se solicita el nombre del usuario
o Se solicita el producto a comprar
o Se solicita la cantidad a comprar
o Se solicita el codigo de descuento
o Se muestra el resultado de la compra: Subtotal, IGV, Importe, Descuento y Neto a 
Pagar.
Codigo de descuento: A12-2022 tiene 20% de descuento del importe, B20-2022 tiene 
10% de descuento del importe y C10-2022 tiene 5% de descuento del importe. X 
significa que no hay descuento.

*/

package com.mycompany.solucionejercicio09;

                    import java.util.Scanner;

                    public class SolucionEjercicio09 {

                        public static void main(String[] args) {
                            Scanner sc = new Scanner(System.in);
                    // VARIABLES
                    String user = "", prod ="", codigo = "";
                    int cant = 0;
                    double precio = 15, subTotal = 0, igv = 0, importe = 0, descuento = 0, neto = 0;
                    // ENTRADA
                    System.out.println("Ingrese nombre del usuario: ");
                    user = sc.nextLine();
                    System.out.println("Ingrese codigo de descuento: ");
                    codigo = sc.nextLine();
                    // Validar codigo de descuento
                    // Pregunta inversa: En lugar de preguntar si el codigo es correcto, pregunto si el coidog es incorrecto
                    // Utilizando la negacion !
                    // Aqui pregunto si codigo no es A12, B12, C10 o X
                    if (!(codigo.equalsIgnoreCase("A12-2022") || codigo.equalsIgnoreCase("B20-2022") || codigo.equalsIgnoreCase("C10-2022") || codigo.equalsIgnoreCase("x"))) {
                    System.out.println("Codigo invalido, la aplicacion finalizará");
                    System.exit(0);
                    }
                    System.out.println("Ingrese nombre del producto a comprar: ");
                    prod = sc.nextLine();
                    System.out.println("Ingrese cantidad a comprar: ");
                    cant = sc.nextInt();

                     // PROCESOS
                    importe = precio * cant;
                    subTotal = importe / 1.18;
                    igv = importe - subTotal;
                    // Para el descuento se tiene 4 posibles respuestas
                    // Solucion: If anidado
                    if (codigo.equalsIgnoreCase("A12-2022")) {
                    descuento = 0.2 * importe;
                    }else if (codigo.equalsIgnoreCase("B20-2022")) {
                    descuento = 0.1 * importe;
                    }else if (codigo.equalsIgnoreCase("C10-2022")) {
                    descuento = 0.05 * importe;
                    }else {
                    descuento = 0;
                    }
                    neto = importe - descuento;
                    // SALIDA
                    System.out.println("****************** COMPROBANTE DE PAGO *******************");
                    System.out.println("Nombre de usuario que realizo la compra: " + user);
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("SubTota: " + subTotal);
                    System.out.println("IGV: " + igv);
                    System.out.println("Importe: " + importe);
                    System.out.println("Codigo de descuento aplicado: " + codigo);
                    System.out.println("Descuento: " + descuento);
                    System.out.println("Neto a Pagar: " + neto);

                    }
}
