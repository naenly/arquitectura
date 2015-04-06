/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitectura;

/**
 *
 * @author lenovo
 */
public class Singleton {
    private static Singleton instance;
    public static Singleton getInstance(){
        if (instance==null) {
        instance= new Singleton();
               }
        
    return instance;
    }
    private Singleton(){ 
    }
  
public static void main (String Args[]){

    System.out.print(instance);
    getInstance();
    System.out.print(instance);

        }
}
