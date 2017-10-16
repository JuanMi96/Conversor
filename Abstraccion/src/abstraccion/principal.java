/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author juanpablo
 */
public class principal  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     HConversor abstraccion= new HConversor();
      System.out.println(abstraccion.grado2radian());
        System.out.println(abstraccion.farenheit2kelvin());
        
        ConversorI interfaz= new ConversorI();
        System.out.println(interfaz.kelvin2celsius());
          System.out.println(interfaz.grado2radian());
        
    }
    
}
