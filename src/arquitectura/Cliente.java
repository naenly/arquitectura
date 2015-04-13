/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitectura;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Cliente {
    
    
  public static void main (String Args []){
        System.out.println("Introduzca un numero entre 1 y 2 por favor:");
        Scanner reader = new Scanner(System.in);
        int tipo = Integer.parseInt(reader.nextLine());
          
       Product producto = new Product() {
            @Override
            public void imprimir() {
            }            
        };
       
        Factory fabrica = new Factory ();    
        fabrica.CreaProducto(tipo);
       
            
    }
    
}
