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
public class Factory {
    
    public void CreaProducto(int tipo){
        
        if (tipo == 1){
            Product product;
            product = new ConcreteProduct();
            product.imprimir();
        }
        else if (tipo == 2){
            Product product1;
            product1 = new ConcreteProduct1();
            product1.imprimir();
        }
        else{
            System.out.println("Esa opcion no es valida");
        }
    }
    
}
