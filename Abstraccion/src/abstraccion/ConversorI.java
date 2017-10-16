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
public class ConversorI implements Itranformador {
    double dato=10;
    @Override
   public  double grado2radian(){
        return Math.toRadians(dato);
    
}
    @Override
 public double kelvin2celsius(){
     return (dato-273.15);
 }
}
